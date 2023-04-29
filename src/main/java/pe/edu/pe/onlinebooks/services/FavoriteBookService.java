package pe.edu.pe.onlinebooks.services;
import pe.edu.pe.onlinebooks.models.FavoriteBook;
import pe.edu.pe.onlinebooks.models.Book;
import java.util.List;
public interface FavoriteBookService {

    FavoriteBook addFavoriteBook(Integer bookId,Long userId);
    List<Book> getFavoriteBooksByUserId(Long userId);
    void removeFavoriteBook(Integer bookId,Long userId);
}
