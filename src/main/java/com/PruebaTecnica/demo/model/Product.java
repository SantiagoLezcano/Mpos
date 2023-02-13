package com.PruebaTecnica.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {

//    Categoría de productos / Nombre / Estado (activo/borrado) / Fecha de creación
//    Fecha de última actualización / Estado (activo/desactivo) / Productos / Nombre

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private String categoria;

    @Column
    @NotNull
    private BigDecimal cost;

    @Column
    @NotNull
    private BigDecimal price;

    @Column
    @NotNull
    @OneToMany(fetch =FetchType.LAZY)
    @JoinColumn(name="id_product")
    private Set<Tag> tag;

    @Column
    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateCreated;



    @Column
    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateOfLastEntry;

    @Column
    @NotNull
    private boolean status;




}
