package com.PruebaTecnica.demo.service;

import com.PruebaTecnica.demo.model.Tag;

import java.util.List;

public interface TagService {

    void saveTag(Tag tag);

    void updateTag(Tag tag);

    void desactivateTag(Long id);

    List<Tag> finAll();

}
