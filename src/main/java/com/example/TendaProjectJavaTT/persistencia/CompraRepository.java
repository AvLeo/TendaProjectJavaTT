package com.example.TendaProjectJavaTT.persistencia;

import com.example.TendaProjectJavaTT.dominio.Purchase;
import com.example.TendaProjectJavaTT.dominio.repositorio.PurchaseRepository;
import com.example.TendaProjectJavaTT.persistencia.crud.CompraCrudRepository;
import com.example.TendaProjectJavaTT.persistencia.entities.Compra;
import com.example.TendaProjectJavaTT.persistencia.mappers.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CompraRepository implements PurchaseRepository {
    @Autowired
    private CompraCrudRepository compraCrudRepository;
    @Autowired
    private PurchaseMapper mapper;


    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = mapper.toCompra(purchase);
       return mapper.toPurchase(compraCrudRepository.save(compra));
    }

    @Override
    public void deleteById(int id) {
        compraCrudRepository.deleteById(id);
    }

    @Override
    public List<Purchase> findByPaymentsMethod(String paymentMehtod) {
        return mapper.toPurchases(compraCrudRepository.findByMedioPago(paymentMehtod));
    }
}
