package com.nyx.nyxdata.service;

import com.nyx.nyxdata.entity.Category;
import com.nyx.nyxdata.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategory(Integer id) {
        return categoryRepository.findById(id).get();
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Integer id, Category category) {
        Category existingCategory = categoryRepository.findById(id).get();
        existingCategory.setName(category.getName());

        return categoryRepository.save(existingCategory);
    }
    public Category updatePatchCategory(Integer id, Category category) {
        Category existingCategory = categoryRepository.findById(id).get();
        if (existingCategory != null) {
            if (category.getName() != null) {
                existingCategory.setName(category.getName());
            }
            // Add other fields as needed
            return categoryRepository.save(existingCategory);
        }
        return null;
    }
    public void deleteCategory(Integer id) {
        categoryRepository.deleteById(id);
    }


}
