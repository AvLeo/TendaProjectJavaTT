package com.example.TendaProjectJavaTT.web.controller;

import com.example.TendaProjectJavaTT.dominio.Purchase;
import com.example.TendaProjectJavaTT.dominio.servicios.ProductService;
import com.example.TendaProjectJavaTT.dominio.servicios.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/all")
    public List<Purchase> getAll(){
        return purchaseService.getAll();
    }

}
