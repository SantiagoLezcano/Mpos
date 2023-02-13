package com.PruebaTecnica.demo.repository;

import com.PruebaTecnica.demo.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Long> {
}
