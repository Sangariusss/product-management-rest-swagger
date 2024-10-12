package com.sangarius.product_management_rest_swagger.repository;

import com.sangarius.product_management_rest_swagger.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}