package com.example.demo.Repository;

import com.example.demo.Model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends JpaRepository<product, Integer> {
    // lalala
}
