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

@Controller
@RequestMapping("bikes")
public class DemoController {

    @Autowired
    private BikeService service;

    public DemoController(BikeService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllBikes(){
        Iterable<Bike> bikes = service.getAllBikes();

        return ResponseEntity.status(200).body(bikes);
    }

    @GetMapping("/test")
    public String hello(){
        return "Hello";
    }
}
