package ro.msg.learning.shop.strategy;

import lombok.AllArgsConstructor;
import ro.msg.learning.shop.dto.OrderDTO;
import ro.msg.learning.shop.dto.StockDTO;
import ro.msg.learning.shop.exception.LocationNotFoundException;
import ro.msg.learning.shop.model.Stock;
import ro.msg.learning.shop.repository.StockRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
public class SingleLocation implements OrderStrategy{

    private final StockRepository stockRepository;

    private Integer inspectLocations(HashMap<Integer, ArrayList<StockDTO>> potentialLocations,
                                     List<StockDTO> orderedProducts) {

        for (Map.Entry<Integer, ArrayList<StockDTO>> entry: potentialLocations.entrySet()) {
            if (entry.getValue().size() == orderedProducts.size()) {
                return entry.getKey();
            }
        }
        throw new LocationNotFoundException();
    }

    @Override
    public List<StockDTO> run(OrderDTO orderInfo) {
        HashMap<Integer, ArrayList<StockDTO>> potentialLocations = new HashMap<>();
        List<StockDTO> orderedProducts = orderInfo.getProducts();
        List<Stock> stocks = (List<Stock>) this.stockRepository.findAll();
        for (Stock stock: stocks) {
            int productId = stock.getProduct().getId();

            Integer quantity = OrderDTO.getQuantityById(orderedProducts, productId);

            if (quantity == null) {
                continue;
            }

            if (quantity > stock.getQuantity()) {
                continue;
            }

            int locationId = stock.getLocation().getId();
            potentialLocations.putIfAbsent(locationId, new ArrayList<>());
            potentialLocations.get(locationId).add(new StockDTO(productId, locationId, quantity));
        }

        int bestLocation = this.inspectLocations(potentialLocations, orderedProducts);
        return potentialLocations.get(bestLocation);

    }
}
