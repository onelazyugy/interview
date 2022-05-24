package com.interview.interview;

import org.springframework.stereotype.Service;

/** CURRENT PROMOTION
 * Promotion price
 * Buy 8 or more apples, you get half price
 * Buy 10 or more oranges, you get half price
 * Ex: if you buy 8 or more apples, each will cost 5 unit
 * Ex: if you buy 10 or more oranges, each will cost 10 unit
 *
 * Regular price
 * Ex: if you buy 4 or less apples, each will cost 10 units
 * Ex: if you buy 5 or less oranges, each will cost 20 units
 *
 * basically you get 50% off if you buy double or greater
 */
@Service
public class PromotionService {
    private CartService cartService;

    public PromotionService(CartService cartService) {
        this.cartService = cartService;
    }

    //TODO: implement logic by applying the promotion
    public Cart calculateCartWithPromotion() {
        return null;
    }
}
