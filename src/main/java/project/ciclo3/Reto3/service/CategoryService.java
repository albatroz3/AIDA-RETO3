package project.ciclo3.Reto3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.ciclo3.Reto3.model.Category;
import project.ciclo3.Reto3.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.getAll();
    }

    public Optional<Category> getCategory(int id) {
        return categoryRepository.getCategory(id);
    }

    public Category save(Category category) {
        if(category.getId() == null) {
            return categoryRepository.save(category);
        }else {
            Optional<Category> aux = categoryRepository.getCategory(category.getId());
            if (aux.isPresent()){
                return  category;
            }else {
                return categoryRepository.save(category);
            }
        }
    }
    public Category update(Category category){
        if (category.getId() != null){
            Optional<Category> c = categoryRepository.getCategory(category.getId());
            if (c.isPresent()){
                if (category.getName() != null){
                    c.get().setName(category.getName());
                }
                if (category.getDescription() != null){
                    c.get().setDescription(category.getDescription());
                }
                if (category.getCostumes() != null){
                    c.get().setCostumes(category.getCostumes());
                }
                categoryRepository.save(c.get());
                return c.get();
            }else {
                return category;
            }
        }else{
            return category;
        }
    }
    public boolean delete(int id) {
        boolean flag = false;
        Optional<Category> c = categoryRepository.getCategory(id);
        if (c.isPresent()) {
            categoryRepository.delete(c.get());
        }
        return flag;
    }
}
