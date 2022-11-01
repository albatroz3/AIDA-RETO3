package project.ciclo3.Reto3.crud;

import org.springframework.data.repository.CrudRepository;
import project.ciclo3.Reto3.model.Reservation;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
