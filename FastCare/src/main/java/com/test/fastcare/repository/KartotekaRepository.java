package com.test.fastcare.repository;

import com.test.fastcare.vao.Kartoteka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KartotekaRepository extends JpaRepository<Kartoteka, Long> {
}
