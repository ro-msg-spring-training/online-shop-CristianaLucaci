package ro.msg.learning.shop.exception;

public class ProductCategoryNotFoundException extends RuntimeException{
    public ProductCategoryNotFoundException(Integer id) {
        super(String.format("product category with id '%d' does not exist", id));
    }
}
