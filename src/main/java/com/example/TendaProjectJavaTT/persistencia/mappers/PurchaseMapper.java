package com.example.TendaProjectJavaTT.persistencia.mappers;

import com.example.TendaProjectJavaTT.dominio.Purchase;
import com.example.TendaProjectJavaTT.persistencia.entities.Compra;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ProductItemMapper.class})
public interface PurchaseMapper {

    @Mappings({
            @Mapping(source = "idCompra", target = "purchaseId"),
            @Mapping(source = "idCliente", target = "clientId"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "medioPago", target = "paymentMethod"),
            @Mapping(source = "comentario", target = "comment"),
            //@Mapping(source = "estado", target = "state"),
            @Mapping(source = "productos", target = "products"),
    })
    Purchase toPurchase(Compra compra);
    List<Purchase> toPurchases(List<Compra> compras);

    @InheritInverseConfiguration
    @Mapping(target = "estado", ignore = true)
    Compra toCompra(Purchase purchase);
}
