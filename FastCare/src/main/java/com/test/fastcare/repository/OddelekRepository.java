package com.test.fastcare.repository;

import com.test.fastcare.vao.Oddelek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OddelekRepository extends JpaRepository<Oddelek, Long> {
}
