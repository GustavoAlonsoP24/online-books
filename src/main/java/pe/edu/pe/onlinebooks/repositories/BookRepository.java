package pe.edu.pe.onlinebooks.repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pe.edu.pe.onlinebooks.models.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Integer> {
    List<Book> findAll();

    @Override
    Optional<Book> findById(Integer integer);

    Book save(Book book);




}