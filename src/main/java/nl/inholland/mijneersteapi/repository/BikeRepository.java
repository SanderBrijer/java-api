package nl.inholland.mijneersteapi.repository;

import nl.inholland.mijneersteapi.model.Bike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends CrudRepository<Bike, Long> {
}
