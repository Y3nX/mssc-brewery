package guru.springframework.msscbrewery.web.services;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.CustomerDto;

public interface CustomerService {
    CustomerDto getCustomerById(final UUID customerId);

    CustomerDto createCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto updatedCustomerDto);

    void deleteCustomerById(UUID customerId);
}
