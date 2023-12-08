package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID customerId){
        return CustomerDto.builder().id(UUID.randomUUID()).name("Joe Buck").build();
    }
    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto){
        return customerDto.builder().id(UUID.randomUUID()).build();
    }
    @Override
    public void updateCustomer(UUID customerId,CustomerDto customerDto){

    }

    @Override
    public void deleteById(UUID beerId){

    }
}
