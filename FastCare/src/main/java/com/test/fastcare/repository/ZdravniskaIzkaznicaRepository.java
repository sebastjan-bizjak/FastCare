package com.test.fastcare.repository;

import com.test.fastcare.vao.ZdravniskaIzkaznica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZdravniskaIzkaznicaRepository extends JpaRepository<ZdravniskaIzkaznica, Long> {
}
