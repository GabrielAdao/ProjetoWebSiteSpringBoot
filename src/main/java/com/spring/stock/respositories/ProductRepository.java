package com.spring.stock.respositories;

import com.spring.stock.entities.Product;
import com.spring.stock.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
