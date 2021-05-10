package nl.inholland.mijneersteapi.repository;

import nl.inholland.mijneersteapi.model.Bike;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BikeRepository extends CrudRepository<Bike, Long> {
    @Query("SELECT u FROM Bike u WHERE u.price > 5")
    Collection<Bike> findAllExpensiveBikes();
}
