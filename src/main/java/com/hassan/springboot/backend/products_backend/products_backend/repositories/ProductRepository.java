package com.hassan.springboot.backend.products_backend.products_backend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hassan.springboot.backend.products_backend.products_backend.entities.Product;

// Automatically create Get, Update, Insert, Delete, CRUD methods
@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource(path = "products")
public interface ProductRepository extends CrudRepository<Product, Long>{

}
