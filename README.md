# spring-transactions

## Purpose 
Our aim in this branch. It will be to see what happens when we add @Transactional annotation to the methods in CustomerOrdersService.When we add the @Transactional annotation, we will see that Customer will be saved first and rollback will be applied when Orders throw an exception. Thus, when an error is received, the record in the Customer table will be deleted, so transaction management will be provided.

## Example Request

http://localhost:8080/api/saveCustomerOrders

```
{
    "customer":{
        "id":null,
        "name":"Dwyane",
        "surname":"Wade",
        "age":"25"
    },
    "orders":{
        "id":null,
        "orderDate":"26-08-2020",
        "orderTotal":51.2
    }
}
```

Second Request for Orders Service Exception:
```
{
    "customer":{
        "id":null,
        "name":"Lebron",
        "surname":"James",
        "age":"25"
    },
    "orders":{
        "id":null,
        "orderDate":"26-08-2020",
        "orderTotal":51.2
    }
}
```

