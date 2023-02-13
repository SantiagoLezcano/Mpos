package com.PruebaTecnica.demo.service.imp;

import com.PruebaTecnica.demo.model.Product;
import com.PruebaTecnica.demo.model.Rol;
import com.PruebaTecnica.demo.repository.RolRepository;
import com.PruebaTecnica.demo.service.RolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class RolServiceImp implements RolService {

    @Autowired
    private RolRepository rolRepository;


    @Override
    public void saveRol(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public void updateRol(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public void desactivateRol(Long id) {
        Optional<Rol> rol= rolRepository.findById(id);
        if(rol.isPresent()) {
            rol.get().setStatus(false);
        }else {
            log.warn("Rol no encontrado");
        }
    }

    @Override
    public List<Rol> finAll() {
        return rolRepository.findAll();
    }
}
