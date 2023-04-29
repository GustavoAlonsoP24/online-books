package pe.edu.pe.onlinebooks.repositories;
import pe.edu.pe.onlinebooks.models.Review;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ReviewRepository extends CrudRepository<Review,Integer> {
    List<Review> findByBookId(Integer bookId);
    List<Review> findByUserId(Integer bookId);
}
