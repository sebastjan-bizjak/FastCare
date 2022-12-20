package com.test.fastcare.repository;

import com.test.fastcare.vao.Oddelek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface OddelekRepository extends JpaRepository<Oddelek, Integer> {
    @Query("SELECT a FROM Oddelek a WHERE a.namen = namen AND a.imeOdd = imeOdd")
    List<Oddelek> vrniOddelekpoNamenuImenu(String ImeOdd, String namen);
}
