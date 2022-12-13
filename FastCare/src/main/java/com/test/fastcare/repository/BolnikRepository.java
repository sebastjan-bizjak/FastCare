package com.test.fastcare.repository;

import com.test.fastcare.vao.Bolnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BolnikRepository extends JpaRepository<Bolnik, Long> {
}
