import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    private String username;
    private String password;
    private String roles; // Assuming you have roles as a simple string for now

    // Getters & Setters
}
