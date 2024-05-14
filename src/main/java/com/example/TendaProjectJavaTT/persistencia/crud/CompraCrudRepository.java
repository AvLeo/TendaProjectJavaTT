package com.example.TendaProjectJavaTT.persistencia.crud;

import com.example.TendaProjectJavaTT.persistencia.entities.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {

    List<Compra> findByMedioPago(String medioPago);

}
