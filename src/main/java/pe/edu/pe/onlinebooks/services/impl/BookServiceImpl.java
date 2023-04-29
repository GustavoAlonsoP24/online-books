package pe.edu.pe.onlinebooks.services.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import pe.edu.pe.onlinebooks.models.Book;
import pe.edu.pe.onlinebooks.repositories.BookRepository;
import pe.edu.pe.onlinebooks.services.BookService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override public Book addBook(String title, String author, String description, MultipartFile image) {
        Book book = new Book(title, author, description, "", LocalDateTime.now(), LocalDateTime.now());
        return bookRepository.save(book);
    }

    @Override
    public Book createBook(Book book) {
        return null;
    }

    @Override
    public Book getBookById(Integer id) {

        return  bookRepository.findById(id).orElseThrow(() -> new
                EntityNotFoundException("Book not found with id " + id));
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public Book updateBook(Integer id, Book book) {
        return null;
    }

    @Override
    public void deleteBook(Integer id) {

    }

    @Override
    public List<Book> searchBooks(String keyword) {
        return null;
    }
}
