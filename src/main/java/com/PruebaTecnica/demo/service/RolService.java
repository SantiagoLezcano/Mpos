package com.PruebaTecnica.demo.service;

import com.PruebaTecnica.demo.model.Rol;
import java.util.List;

public interface RolService {

    void saveRol(Rol rol);

    void updateRol(Rol rol);

    void desactivateRol(Long id);

    List<Rol> finAll();

}
