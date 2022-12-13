package com.test.fastcare.repository;

import com.test.fastcare.vao.Urgenca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrgencaRepository extends JpaRepository<Urgenca, Long> {
}
