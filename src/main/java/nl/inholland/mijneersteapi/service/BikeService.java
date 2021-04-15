package nl.inholland.mijneersteapi.service;

import org.springframework.stereotype.Service;
import nl.inholland.mijneersteapi.model.Bike;

import java.util.Arrays;
import java.util.List;

@Service
public class BikeService {

    private List<Bike> bikes;

    public BikeService() {
        this.bikes = Arrays.asList(
                new Bike(1, "Batavus", "Cayca", 500),
                new Bike(1, "Fiets2", "Voorbeeld", 200),
                new Bike(1, "Fiets3", "Example", 300)
        );
    }

    public List<Bike> getAllBikes() {
        return this.bikes;
    }
}
