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
- User's current cart without promotion
```javascript
[]
```

# PROMOTION RULES
## regular price
- buy 4 or less apples, price will be 10 unit each
- buy 5 or less orange, price will be 20 unit each
## promo price
- buy 8 or more apples, price will be 5 unit each
- buy 10 or more orange, price will be 10 unit each
```javascript
[
     {
         "id": 1,
         "name": "apple",
         "priceEach": 5,
         "qty": 8
     },
     {
         "id": 2,
         "name": "orange",
         "priceEach": 10,
         "qty": 10
     }
 ]
```