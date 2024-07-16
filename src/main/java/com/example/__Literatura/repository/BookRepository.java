package com.example.__Literatura.repository;

import com.example.__Literatura.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByIdioma(String idioma);
    Optional<Book> findByTitulo(String titulo);

    @Query("SELECT b FROM Book b ORDER BY b.numeroDeDescargas DESC")
    List<Book> findTop10Books(Pageable pageable);

    default List<Book> buscarTop10Libros() {
        return findTop10Books(PageRequest.of(0, 10));
    }
}
