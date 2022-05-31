# API
- GET http://localhost:8080/api/v1/cart
- User's current cart without promotion
```javascript
{
  "items": [
    {
      "id": 1,
      "name": "apple",
      "priceEach": 10,
      "qty": 4
    },
    {
      "id": 2,
      "name": "orange",
      "priceEach": 20,
      "qty": 5
    },
    {
      "id": 3,
      "name": "avacado",
      "priceEach": 30,
      "qty": 7
    }
  ],
  "total": 350
}
```
- GET http://localhost:8080/api/v1/apply-discount
- to be implemented by candidate


# PROMOTION RULES
 * Promotion price
 * Buy 5 or more apples, you get half price
 * Buy 6 or more oranges, you get half price
 * Buy 8 or more avocados, you get half price
 * OTHERWISE REGULAR PRICE