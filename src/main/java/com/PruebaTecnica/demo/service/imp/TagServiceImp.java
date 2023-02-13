package com.PruebaTecnica.demo.service.imp;

import com.PruebaTecnica.demo.model.Tag;
import com.PruebaTecnica.demo.repository.TagRepository;
import com.PruebaTecnica.demo.service.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class TagServiceImp implements TagService {

    private TagRepository tagRepository;

    @Override
    public void saveTag(Tag tag) {
        tagRepository.save(tag);

    }

    @Override
    public void updateTag(Tag tag) {
        tagRepository.save(tag);
    }

    @Override
    public void desactivateTag(Long id) {
        Optional<Tag> product= tagRepository.findById(id);
        if(product.isPresent()) {
            product.get().setStatus(false);
        }else {
            log.warn("Tag no encontrado");
        }
    }

    @Override
    public List<Tag> finAll() {
        return tagRepository.findAll();
    }
}
