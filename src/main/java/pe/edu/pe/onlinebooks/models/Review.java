package pe.edu.pe.onlinebooks.models;
import jakarta.persistence.*;
import java.time.LocalDateTime;
public class Review {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;


    @Column(nullable = false)
    private String comment;

    @Column(nullable = false)
    private Integer rating;

    @Column(name="create_at")
    private LocalDateTime createdAt;

    @Column(name="updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id",nullable = false)
    private User user;

}
