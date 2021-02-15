package guru.springframework.msscbrewery.web.services;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.CustomerDto;

public interface CustomerService {
    CustomerDto getCustomerById(final UUID customerId);
}
