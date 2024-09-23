package ie.atu.week2_refreshers;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Product")
public class ProductController {

    ProductService productService = new ProductService();

    @GetMapping("/GET")
    public List<Product> getProduct(){
    return productService.getProduct();
    }
    @PostMapping("/add")
    public String addProduct(@RequestBody Product product){
    return productService.addProduct(product);
    }


}
