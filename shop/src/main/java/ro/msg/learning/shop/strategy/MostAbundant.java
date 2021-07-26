package ro.msg.learning.shop.strategy;

import lombok.AllArgsConstructor;
import ro.msg.learning.shop.dto.OrderDTO;
import ro.msg.learning.shop.dto.StockDTO;
import ro.msg.learning.shop.exception.StockUnavailableException;
import ro.msg.learning.shop.model.Stock;
import ro.msg.learning.shop.repository.StockRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@AllArgsConstructor
public class MostAbundant implements OrderStrategy{

    private final StockRepository stockRepository;

    @Override
    public List<StockDTO> run(OrderDTO orderInfo) {

        HashMap<Integer, StockDTO> orderStock = new HashMap<>();
        List<StockDTO> orderedProducts = orderInfo.getProducts();
        List<Stock> stocks = (List<Stock>) stockRepository.findAll();

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

            orderStock.putIfAbsent(productId, new StockDTO( productId, locationId, quantity));
            if (quantity > orderStock.get(productId).getQuantity()) {
                orderStock.put(productId, new StockDTO(productId, locationId, quantity));
            }
        }

        if (orderStock.size() < orderedProducts.size()) {
            throw new StockUnavailableException();
        }

        return new ArrayList<>(orderStock.values());
    }
}
