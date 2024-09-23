package ie.atu.week2_refreshers;

import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();

    public List<Product> getProduct(){
        return productList;
    }

    public String addProduct(Product product){
        productList.add(product);
        return "product added successfully";
    }
}
