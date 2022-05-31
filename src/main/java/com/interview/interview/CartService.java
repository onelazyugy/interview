package com.interview.interview;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

@Service
public class CartService {
    private ObjectMapper mapper = new ObjectMapper();

    public Cart retrieveCart(boolean isApplyPromo) throws Exception {
        String cartJSON = isApplyPromo == true ? cartWithDiscount() : cartWithOutDiscount();
        List<Item> items = mapper.readValue(cartJSON, new TypeReference<List<Item>>(){});
        return Cart.builder().items(items).total(calculateTotal(items)).build();
    }

    public double calculateTotal(List<Item> items) {
        return items.stream().mapToDouble(i -> (i.getPriceEach()*i.getQty())).sum();
    }

    public String cartWithOutDiscount() throws Exception {
        File resource = new ClassPathResource("cart-with-out-discount.json").getFile();
        return new String(Files.readAllBytes(resource.toPath()));
    }

    public String cartWithDiscount() throws Exception {
        File resource = new ClassPathResource("cart-to-calculate-discount.json").getFile();
        return new String(Files.readAllBytes(resource.toPath()));
    }
}
