package project.ciclo3.Reto3.crud;

import org.springframework.data.repository.CrudRepository;
import project.ciclo3.Reto3.model.Category;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
}
