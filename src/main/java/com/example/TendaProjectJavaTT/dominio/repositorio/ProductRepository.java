package com.example.TendaProjectJavaTT.dominio.repositorio;

import com.example.TendaProjectJavaTT.dominio.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAll();
    List<Product> findByCategory(int categoryId);
    void deletedById(int id);
    List<Product> getScarseProduct(int productId);
    Product save(Product product);
}
