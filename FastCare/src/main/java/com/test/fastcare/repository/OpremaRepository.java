package com.test.fastcare.repository;

import com.test.fastcare.vao.Oprema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpremaRepository extends JpaRepository<Oprema, Long> {
}
