package pe.edu.pe.onlinebooks.services;
import pe.edu.pe.onlinebooks.models.Review;
import java.util.List;

public interface ReviewService {
    Review createReview(Review review,Integer bookId,Long userId);
    List<Review> getReviewsByBookI(Integer bookId);

    Review getReviewByBookIdUserId(Integer bookId,Long userId);
    Review updateReview(Long id,Review review);
    void deleteReview(Long id);
}
