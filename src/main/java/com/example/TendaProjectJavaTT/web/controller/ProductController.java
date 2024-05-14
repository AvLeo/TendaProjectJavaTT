package com.example.TendaProjectJavaTT.web.controller;

import com.example.TendaProjectJavaTT.dominio.Product;
import com.example.TendaProjectJavaTT.dominio.servicios.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAll(){
        return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<List<Product>> findByCategory(@PathVariable("id") int categoryId){
        return new ResponseEntity<>(productService.findByCategory(categoryId), HttpStatus.CREATED);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<List<Product>> getScareProduct(@PathVariable("id") int idProduct){
        List<Product> products =  productService.getScareStock(idProduct);
        if(products.size() > 0){
            return new ResponseEntity<>(products,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping("/add/product")
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }
}
