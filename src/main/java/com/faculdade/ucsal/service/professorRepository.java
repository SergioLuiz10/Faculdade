package com.faculdade.ucsal.service;

import com.faculdade.ucsal.entity.professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface professorRepository extends JpaRepository<professor,Long> {
}
