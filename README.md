# spring-transactions

## Transactional-Propagation
Propagation defines our business logic ‘s transaction boundary. Spring manages to start and pause a transaction according to our propagation setting.

Spring calls TransactionManager::getTransaction to get or create a transaction according to the propagation. It supports some of the propagations for all types of TransactionManager, but there are a few of them that only supported by specific implementations of TransactionManager.
## Propagation Required
REQUIRED is the default propagation. Spring checks if there is an active transaction, then it creates a new one if nothing existed. Otherwise, the business logic appends to the currently active transaction:

## Example

``` @Transactional(propagation = Propagation.REQUIRED)
    public void saveCustomerAndOrder(CustomerOrdersDto customerOrdersDto) {
        customerService.saveCustomer(customerOrdersDto.getCustomer());
        ordersService.saveOrders(customerOrdersDto.getOrders());

    } 
 ```
    
 ``` 
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveCustomer(Customer customer) {
        if(customerRepository.findById(customer.getId() ) == null){
            throw  new RuntimeException("Customer Id already exist.");
        }
        customerRepository.save(customer);
    }
 ```

## Conclusion
  When Propagation.REQUIRED is used, if there is no transactional annotation in the calling service, the service creates a new transaction. However, if the calling service has a transactional annotation, the called service does not open a new transaction. uses the existing transaction.
    
    
