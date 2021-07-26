package ro.msg.learning.shop.service;

import lombok.AllArgsConstructor;
import ro.msg.learning.shop.dto.OrderDTO;
import ro.msg.learning.shop.dto.StockDTO;
import ro.msg.learning.shop.model.Order;
import ro.msg.learning.shop.model.OrderDetail;
import ro.msg.learning.shop.model.Stock;
import ro.msg.learning.shop.repository.*;
import ro.msg.learning.shop.strategy.MostAbundant;
import ro.msg.learning.shop.strategy.OrderStrategy;
import ro.msg.learning.shop.strategy.OrderStrategyConfig;
import ro.msg.learning.shop.strategy.SingleLocation;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@AllArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final OrderStrategyConfig strategyConfig;
    private LocationRepository locationRepository;
    private StockRepository stockRepository;
    private OrderRepository orderRepository;
    private OrderDetailRepository orderDetailRepository;



    @Override
    public Order createOrder(Order order, List<StockDTO> orderStock) {
        Order newOrder = this.orderRepository.save(order);
        return newOrder;
    }
}
