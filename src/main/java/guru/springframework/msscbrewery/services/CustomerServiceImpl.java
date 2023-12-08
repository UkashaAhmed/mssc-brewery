package guru.springframework.msscbrewery.services;

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
}
