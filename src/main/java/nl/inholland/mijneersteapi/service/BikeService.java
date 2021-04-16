package nl.inholland.mijneersteapi.service;

import org.springframework.stereotype.Service;
import nl.inholland.mijneersteapi.model.Bike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BikeService {

    private ArrayList<Bike> bikes;

    public BikeService() {
        this.bikes = new ArrayList<Bike>(Arrays.asList(
                new Bike(1, "Batavus", "Cayca", 500),
                new Bike(2, "Fiets2", "Voorbeeld", 200),
                new Bike(3, "Fiets3", "Example", 300)
        ));
    }

    public List<Bike> getAllBikes() {
        return this.bikes;
    }

    public int addBike(Bike bike) {
        int id = this.getAllBikes().size()+1;
        bike.setId(id);
        this.bikes.add(bike);
        return id;
    }
}
