package com.nyx.nyxdata.controller;

import com.nyx.nyxdata.entity.Category;
import com.nyx.nyxdata.repository.CategoryRepository;
import com.nyx.nyxdata.service.CategoryService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

   private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Category getCategory(@PathVariable("id") Integer id) {
        return categoryService.getCategory(id);
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category) {

        return categoryService.createCategory(category);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable("id") Integer id, @RequestBody Category category) {
        return categoryService.updateCategory(id, category);
    }

    @PatchMapping("/{id}")
    public Category updatePatchCategory(@PathVariable("id") Integer id, @RequestBody Category category) {
            return categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void deleteCategory(@PathVariable("id") Integer id) {
        categoryService.deleteCategory(id);
    }
}