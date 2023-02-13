package com.PruebaTecnica.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
    //Usuarios
//        Nombre completo / Nombre de usuario / Clave / Fecha de Creación / Fecha de ultimo ingreso
//        Nivel de acceso (usuario/admin) / Estado (activo/desactivo)
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    @NotNull
    private String fullName;

    @Column
    @NotNull
    private String userName;

    @Column
    @NotNull
    private String password;

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
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="id_user")
    private Set<Rol> roles;

}
