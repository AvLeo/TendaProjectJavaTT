package com.example.TendaProjectJavaTT.persistencia.mappers;

import com.example.TendaProjectJavaTT.dominio.ProductItem;
import com.example.TendaProjectJavaTT.persistencia.entities.CompraProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface ProductItemMapper {
    @Mappings({
            //@Mapping(source = "id", target = "purchaseId"),
            @Mapping(source = "cantidad", target = "quantity"),
            @Mapping(source = "total", target = "total"),
            @Mapping(source = "estado", target = "state"),
            @Mapping(source = "producto", target = "product"),
    })
    ProductItem toProductItem(CompraProducto producto);
    List<ProductItem> toProductItems(List<CompraProducto> productos);

    @InheritInverseConfiguration
    @Mappings({
    @Mapping(target = "id", ignore = true),
    })
    CompraProducto toCompraProducto(ProductItem productItem);

}
