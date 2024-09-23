package ie.atu.week2_refreshers;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Product")
public class ProductController {

    private List<Product> productList;

    @GetMapping("/GET")
    public List<Product> getProduct(){
        return productList;
    }
    @PostMapping("/add")
    public String addProduct(@RequestBody Product product){
        productList.add(product);
        return "product added successfully";
    }


}
