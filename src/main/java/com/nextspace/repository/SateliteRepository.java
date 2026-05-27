package com.nextspace.repository;

import com.nextspace.entity.Satelite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SateliteRepository extends JpaRepository<Satelite, Long> {
}