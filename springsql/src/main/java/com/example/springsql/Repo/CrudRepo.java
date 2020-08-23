package com.example.springsql.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springsql.modal.Product;

public interface CrudRepo extends JpaRepository<Product, Integer> {

}
