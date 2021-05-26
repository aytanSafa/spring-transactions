# spring-transactional

The aim of the project is to understand and explain the transactional issue.A simple RestApi is written within this project. In the data layer, jpa is used.
In order to keep the project simple, H2 database, which is In-memory, was used.

## Entities

Two entities are defined in the customer and orders name. If we consider these entities logically, there should be a relationship between each other. However, in this project, I will not associate them with each other in the master branch and a few other branches in order to express the concept of Transactional. Then I can associate.

## Transactional

If you look at the code snippets in the master branch, no Transactional annotations have been added within the CustomerOrdersService methods.It has been prepared with the aim of showing what transactional annotation does simply and what we would meet without Transactional annotation.
The CustomerOrders service first records the incoming customer. Then it saves or deletes the order that came with it.

If transactional annotation is not added on Spring Boot, transactions are provided with auto-commit. However, this may cause some errors. If transaction management is not done well, some problems may occur while saving, updating or deleting data.

## Purpose

The purpose in this branch is to see what happens when we do not use the Transactional annotation.First of all, Customer will be registered and an exception will be attempted for Orders.
Here we will see that the Customer will be saved in the database, but the Orders will not be saved because they received an error. Customer, which should be a rollback, will not be rollbacked. Because it will be auto-commit.

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
