package nl.inholland.mijneersteapi.configuration;

import nl.inholland.mijneersteapi.model.Bike;
import nl.inholland.mijneersteapi.model.Category;
import nl.inholland.mijneersteapi.model.Role;
import nl.inholland.mijneersteapi.model.User;
import nl.inholland.mijneersteapi.service.BikeService;
import nl.inholland.mijneersteapi.service.CategoryService;
import nl.inholland.mijneersteapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Autowired
    CategoryService categoryService;

    @Autowired
    BikeService bikeService;

    @Autowired
    UserService userService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Category category = new Category(1, "E-Bikes");
        categoryService.addCategory(category);

        Bike bike = new Bike(1, "Stella", "ModelX", 400);
        bike.setCategory(category);
        bikeService.addBike(bike);




        User testUser = new User();
        testUser.setUsername("testus");
        testUser.setPassword("test");
        testUser.setRoles(Arrays.asList(Role.ROLE_USER));
        userService.add(testUser);
    }
}
