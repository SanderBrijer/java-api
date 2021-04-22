package nl.inholland.mijneersteapi.controller;


import nl.inholland.mijneersteapi.model.Bike;
import nl.inholland.mijneersteapi.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("bikes3")
public class DemoPostController {

    @Autowired
    private BikeService service;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllBikes() {
        Iterable<Bike> bikes = service.getAllBikes();
        return ResponseEntity.status(200).body(bikes);
    }

    @RequestMapping(value = "/bikes3", method = RequestMethod.POST)
    @ResponseBody
    public String requestOTP(@RequestParam(value = "brand") String brand, @RequestParam(value = "model") String model, @RequestParam(value = "price") float price) {
        Bike bike = new Bike(0, brand, model, price);
        int id = service.addBike(bike);
        return "Added new bike " + bike.getBrand() + " (" + bike.getModel() + ") (" + id + ")";
    }
}
