package nl.inholland.mijneersteapi.controller;


import nl.inholland.mijneersteapi.model.Bike;
import nl.inholland.mijneersteapi.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bikes2")
public class DemoRestController {

    @Autowired
    private BikeService service;

    @GetMapping("")
    public List<Bike> getAllBikes(){
        List<Bike> bikes = service.getAllBikes();

        return service.getAllBikes();
    }





    @GetMapping("/test")
    public String hello(){
        return "Hello";
    }
}
