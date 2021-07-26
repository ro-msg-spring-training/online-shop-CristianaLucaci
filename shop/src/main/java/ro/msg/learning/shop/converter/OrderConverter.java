package ro.msg.learning.shop.converter;


import ro.msg.learning.shop.dto.OrderDTO;
import ro.msg.learning.shop.model.Order;

public class OrderConverter implements BaseConverter<Order, OrderDTO> {
    @Override
    public Order dtoToEntity(OrderDTO orderDTO) {
        if (orderDTO == null){
            return null;
        }

        Order order = Order.builder()
                .createdAt(orderDTO.getCreatedAt())
                .addressCountry(orderDTO.getAddressCountry())
                .addressCity(orderDTO.getAddressCity())
                .addressCounty(orderDTO.getAddressCounty())
                .streetAddress(orderDTO.getStreetAddress())
                .build();

        order.setId(orderDTO.getID());

        return order;
    }

    @Override
    public OrderDTO entityToDto(Order order) {

        if (order == null){
            return null;
        }

        OrderDTO orderDTO = OrderDTO.builder()
                .createdAt(order.getCreatedAt())
                .addressCountry(order.getAddressCountry())
                .addressCity(order.getAddressCity())
                .addressCounty(order.getAddressCounty())
                .streetAddress(order.getStreetAddress())
                .build();

        orderDTO.setID(order.getId());

        return orderDTO;
    }
}
