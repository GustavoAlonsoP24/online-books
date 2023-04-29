package pe.edu.pe.onlinebooks.models;
import jakarta.persistence.*;
import java.time.LocalDateTime;


public class FavoriteBook {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="created_at")
    private LocalDateTime createdAt;
    @Column(name="updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="book_id",nullable = false)
    private Book book;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id",nullable = false)
    private User user;



}
