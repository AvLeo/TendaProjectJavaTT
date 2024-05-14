package com.example.TendaProjectJavaTT.dominio.servicios;

import com.example.TendaProjectJavaTT.dominio.Product;
import com.example.TendaProjectJavaTT.dominio.repositorio.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.getAll();
    }

    public List<Product> findByCategory(int categoryId){
        return productRepository.findByCategory(categoryId);
    }

    public List<Product> getScareStock(int idProduct){
        return productRepository.getScarseProduct(idProduct);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }
}
