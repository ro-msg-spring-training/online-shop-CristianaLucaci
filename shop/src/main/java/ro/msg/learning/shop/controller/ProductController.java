package ro.msg.learning.shop.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.msg.learning.shop.converter.ProductConverter;
import ro.msg.learning.shop.dto.ProductDTO;
import ro.msg.learning.shop.model.Product;
import ro.msg.learning.shop.service.ProductService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;
    private final ProductConverter productConverter;

    @GetMapping("/products")
    public ResponseEntity<List<ProductDTO>> getProducts() {
        List<Product> products = productService.getProducts();
        List<ProductDTO> productsDto = products.stream().map(productConverter::entityToDto).collect(Collectors.toList());
        return ResponseEntity.ok(productsDto);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductDTO> getProduct(@PathVariable int id) {
        Product product = productService.getProduct(id);
        return ResponseEntity.ok(productConverter.entityToDto(product));
    }

    @PostMapping("/products")
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO) {
        Integer productCategoryID = productDTO.getCategoryID();
        Product newProduct = productService.createProduct(productConverter.dtoToEntity(productDTO), productCategoryID);
        return ResponseEntity.ok(productConverter.entityToDto(newProduct));
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<ProductDTO> updateProduct(@RequestBody ProductDTO productDTO, @PathVariable int id) {
        Product newProduct = productService.updateProduct(id, productConverter.dtoToEntity(productDTO));
        return ResponseEntity.ok(productConverter.entityToDto(newProduct));
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity.BodyBuilder deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return ResponseEntity.ok();
    }
}
