package com.example.TendaProjectJavaTT.dominio.repositorio;

import com.example.TendaProjectJavaTT.dominio.Purchase;

import java.util.List;

public interface PurchaseRepository {

    List<Purchase> getAll();
    Purchase save(Purchase purchase);
    void deleteById(int id);
    List<Purchase> findByPaymentsMethod(String paymentMethod);

}
