package pe.edu.pe.onlinebooks.services.impl;

import org.springframework.stereotype.Service;
import pe.edu.pe.onlinebooks.models.Book;
import pe.edu.pe.onlinebooks.models.FavoriteBook;
import pe.edu.pe.onlinebooks.services.FavoriteBookService;
import pe.edu.pe.onlinebooks.repositories.FavoriteRepository;

import java.util.List;

@Service
public class FavoriteServiceImpl implements FavoriteBookService {

    private FavoriteRepository favoriteRepository;
    @Override
    public FavoriteBook addFavoriteBook(Integer bookId, Long userId) {
        return null;
    }

    @Override
    public List<Book> getFavoriteBooksByUserId(Long userId) {
        return null;
    }

    @Override
    public void removeFavoriteBook(Integer bookId, Long userId) {

    }
}
