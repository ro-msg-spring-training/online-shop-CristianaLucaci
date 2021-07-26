package ro.msg.learning.shop.service;

import ro.msg.learning.shop.dto.OrderDTO;
import ro.msg.learning.shop.dto.StockDTO;
import ro.msg.learning.shop.model.Order;
import ro.msg.learning.shop.model.OrderDetail;

import java.util.List;

public interface OrderService {
    public Order createOrder(Order order, List<StockDTO> orderStock);
}
