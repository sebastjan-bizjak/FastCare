package com.test.fastcare.repository;

import com.test.fastcare.vao.ZdravstveniDelavec;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZdravstveniDelavecRepository extends CrudRepository<ZdravstveniDelavec, Long> {
    @Query("select z from ZdravstveniDelavec z where z.oddelek=?1 and z.urgenca=?2")
    List<ZdravstveniDelavec> oddelekInUrgenca(String oddelek, String urgenca);
}
