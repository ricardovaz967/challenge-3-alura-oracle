package com.example.__Literatura.repository;

import com.example.__Literatura.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findByFechaDeFallecimientoGreaterThan(Integer año);
    @Query("SELECT a FROM Author a WHERE LOWER(a.nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<Author> findByNombre(@Param("nombre") String nombre);
}