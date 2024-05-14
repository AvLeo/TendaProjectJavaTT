package com.example.TendaProjectJavaTT.dominio.servicios;

import com.example.TendaProjectJavaTT.dominio.Purchase;
import com.example.TendaProjectJavaTT.dominio.repositorio.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAll(){
        return purchaseRepository.getAll();
    }

    public Purchase save(Purchase purchase){
        return purchaseRepository.save(purchase);
    }

    public void deleteById(int id){
        purchaseRepository.deleteById(id);
    }

    public List<Purchase> findByPaymentsMethod(String paymentMethod){
        return purchaseRepository.findByPaymentsMethod(paymentMethod);
    }

}
