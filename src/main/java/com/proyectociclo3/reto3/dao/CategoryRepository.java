package com.proyectociclo3.reto3.dao;

import com.proyectociclo3.reto3.entity.Category;
import com.proyectociclo3.reto3.entity.CategoryCrud;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository {

    @Autowired
    private CategoryCrud categoryCrudRepository;

    public List<Category> getAll() {
        return (List<Category>) categoryCrudRepository.findAll();
    }

  public Optional<Category> getCategory(int id) {
        return categoryCrudRepository.findById(id);
    }

  public Category save(Category category) {
        return categoryCrudRepository.save(category);
    }

}
