package pe.edu.pe.onlinebooks.services.impl;

import org.springframework.stereotype.Service;
import pe.edu.pe.onlinebooks.models.Review;
import pe.edu.pe.onlinebooks.services.ReviewService;
import pe.edu.pe.onlinebooks.repositories.ReviewRepository;
import pe.edu.pe.onlinebooks.repositories.BookRepository;
import pe.edu.pe.onlinebooks.repositories.UserRepository;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final BookRepository bookRepository;
    private final UserRepository userRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository, BookRepository bookRepository, UserRepository userRepository) {
        this.reviewRepository = reviewRepository;
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Review createReview(Review review, Integer bookId, Long userId) {
        return null;
    }

    @Override
    public List<Review> getReviewsByBookI(Integer bookId) {
        return null;
    }

    @Override
    public Review getReviewByBookIdUserId(Integer bookId, Long userId) {
        return null;
    }

    @Override
    public Review updateReview(Long id, Review review) {
        return null;
    }

    @Override
    public void deleteReview(Long id) {

    }
}
