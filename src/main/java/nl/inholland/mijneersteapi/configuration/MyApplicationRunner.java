package nl.inholland.mijneersteapi.configuration;

import nl.inholland.mijneersteapi.model.Bike;
import nl.inholland.mijneersteapi.model.Category;
import nl.inholland.mijneersteapi.service.BikeService;
import nl.inholland.mijneersteapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Autowired
    CategoryService categoryService;

    @Autowired
    BikeService bikeService;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        Category category = new Category(1, "E-Bikes");
        categoryService.addCategory(category);

        Bike bike = new Bike(1, "Stella", "ModelX", 400);
        bike.setCategory(category);
        bikeService.addBike(bike);
    }
}
