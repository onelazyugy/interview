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
 * Buy 8 or more apples, you get half price
 * Buy 10 or more oranges, you get half price
 * Ex: if you buy 8 or more apples, each will cost 5 unit
 * Ex: if you buy 10 or more oranges, each will cost 10 unit
 
 * Regular price
 * Ex: if you buy 4 or less apples, each will cost 10 units
 * Ex: if you buy 5 or less oranges, each will cost 20 units

 * basically you get 50% off if you buy double or greater
 