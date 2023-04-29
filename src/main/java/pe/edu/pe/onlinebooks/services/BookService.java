package pe.edu.pe.onlinebooks.services;

import org.springframework.web.multipart.MultipartFile;
import pe.edu.pe.onlinebooks.models.Book;

import java.util.List;

public interface BookService {
    Book addBook(String title, String author, String description, MultipartFile image);
    Book createBook(Book book);
    Book getBookById(Integer id);
    List<Book> getAllBooks();
    Book updateBook(Integer id,Book book);
    void deleteBook(Integer id);
    List<Book> searchBooks(String keyword);

}
