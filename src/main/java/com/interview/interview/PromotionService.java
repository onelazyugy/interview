package com.interview.interview;

import org.springframework.stereotype.Service;

@Service
public class PromotionService {
    private CartService cartService;

    public PromotionService(CartService cartService) {
        this.cartService = cartService;
    }

    //TODO: implement logic by applying the promotion
    public Cart calculateCartWithPromotion() throws Exception {
        return null;
    }
}
