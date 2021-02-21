package guru.springframework.msscbrewery.web.services.v2;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(final UUID beerId) {
        return null;
    }

    @Override
    public BeerDto saveNewBeer(final BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public void updateBeer(final UUID beerId, final BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteById(final UUID beerId) {

    }
}
