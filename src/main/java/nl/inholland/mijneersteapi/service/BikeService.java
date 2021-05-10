package nl.inholland.mijneersteapi.service;

import nl.inholland.mijneersteapi.repository.BikeRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import nl.inholland.mijneersteapi.model.Bike;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BikeService {

//    private ArrayList<Bike> bikes;
//
//    public BikeService() {
//        this.bikes = new ArrayList<Bike>(Arrays.asList(
//                new Bike(1, "Batavus", "Cayca", 500),
//                new Bike(2, "Fiets2", "Voorbeeld", 200),
//                new Bike(3, "Fiets3", "Example", 300)
//        ));
//    }




    private BikeRepository bikeRepository;

    public BikeService(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    public Iterable<Bike> getAllBikes() {
        //return this.bikes;
        return this.bikeRepository.findAll();
    }

    public int addBike(@RequestBody Bike bike) {
        this.bikeRepository.save(bike);
        return 1;
//        int id = this.getAllBikes().size()+1;
//        bike.setId(id);
//        this.bikes.add(bike);
//        return id;
    }
}
