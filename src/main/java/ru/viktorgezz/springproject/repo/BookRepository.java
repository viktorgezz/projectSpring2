package ru.viktorgezz.springproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.viktorgezz.springproject.model.Book;



@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    Book findFirstByTitleStartingWith(String searchByTitle);
}
