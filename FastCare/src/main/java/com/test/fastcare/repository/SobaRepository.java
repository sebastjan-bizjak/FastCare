package com.test.fastcare.repository;

import com.test.fastcare.vao.Soba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SobaRepository extends JpaRepository<Soba, Long> {
}
