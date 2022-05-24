package com.interview.interview;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
@Slf4j
public class CartController {
    private CartService cartService;
    private PromotionService promotionService;

    public CartController(CartService cartService, PromotionService promotionService) {
        this.cartService = cartService;
        this.promotionService = promotionService;
    }

    /**
     * current items in user's cart without discount
     * @return user's current cart
     * @throws Exception
     */
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/cart")
    public Cart cart() throws Exception {
        return this.cartService.retrieveCart(false);
    }

    /**
     * apply discount rules toward current items in cart
     * @return user's current cart with discount
     * @throws Exception
     */
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/apply-discount")
    public Cart applyDiscount() throws Exception {
        return this.promotionService.calculateCartWithPromotion();
    }
}
