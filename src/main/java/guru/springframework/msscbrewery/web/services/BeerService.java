package guru.springframework.msscbrewery.web.services;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.BeerDto;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
