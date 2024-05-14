package com.example.TendaProjectJavaTT.persistencia.mappers;

import com.example.TendaProjectJavaTT.dominio.Category;
import com.example.TendaProjectJavaTT.persistencia.entities.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "estado", target = "state"),
            @Mapping(source = "descripcion", target = "description"),
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCotegoria(Category category);

}
