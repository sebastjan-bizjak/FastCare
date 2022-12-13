package com.test.fastcare.repository;

import com.test.fastcare.vao.ZdravstveniDelavec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZdravstveniDelavecRepository extends JpaRepository<ZdravstveniDelavec, Long> {
}
