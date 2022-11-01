package project.ciclo3.Reto3.crud;

import org.springframework.data.repository.CrudRepository;
import project.ciclo3.Reto3.model.Message;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
