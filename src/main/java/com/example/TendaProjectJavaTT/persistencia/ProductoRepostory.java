package com.example.TendaProjectJavaTT.persistencia;

import com.example.TendaProjectJavaTT.dominio.Product;
import com.example.TendaProjectJavaTT.dominio.repositorio.ProductRepository;
import com.example.TendaProjectJavaTT.persistencia.crud.ProductoCrudRepository;
import com.example.TendaProjectJavaTT.persistencia.entities.Producto;
import com.example.TendaProjectJavaTT.persistencia.mappers.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductoRepostory implements ProductRepository {

    private ProductoCrudRepository productoCrudRepository;
    private ProductMapper mapper;

    @Autowired
    public ProductoRepostory(ProductoCrudRepository productoCrudRepository, ProductMapper mapper) {
        this.productoCrudRepository = productoCrudRepository;
        this.mapper = mapper;
    }

    @Override
    public List<Product> getAll(){
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public List<Product> findByCategory(int id){
        List<Producto> productos = (List<Producto>) productoCrudRepository.findByIdCategoria(id);
        return mapper.toProducts(productos);
    }

    @Override
    public void deletedById(int id) {
        productoCrudRepository.deleteById(id);
    }

    @Override
    public List<Product> getScarseProduct(int productId) {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findByCantidadStockLessThan(productId);
        return mapper.toProducts(productos);
    }

    @Override
    public Product save(Product product) {
        Producto producto = mapper.producto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }

}
