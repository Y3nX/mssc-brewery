package guru.springframework.msscbrewery.web.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(final UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("test customer")
                .build();
    }

    @Override
    public CustomerDto createCustomer(final CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("new customer")
                .build();
    }

    @Override
    public void updateCustomer(final UUID customerId, final CustomerDto updatedCustomerDto) {
        // todo update customer info...
        log.debug("updating customer data...");
    }

    @Override
    public void deleteCustomerById(final UUID customerId) {
        // todo delete customer by id...
        log.debug("deleting customer by id...");
    }
}
