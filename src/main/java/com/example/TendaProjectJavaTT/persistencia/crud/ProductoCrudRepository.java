package com.example.TendaProjectJavaTT.persistencia.crud;

import com.example.TendaProjectJavaTT.persistencia.entities.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoria(int id);

    List<Producto> findByCantidadStockLessThan(int cantidad);
}
