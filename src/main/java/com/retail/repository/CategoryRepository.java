package com.retail.repository;

import com.retail.models.Category;
import com.retail.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    public Category findByCategoryName(String categoryName);
}
