package guru.springframework.spring5webapp.domain;
/**
 * Created by DB on 05/05/2024
 */




import javax.persistence.*;
import java.util.Set;
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
 private String firstName;
 private String lastName;
 @ManyToMany(mappedBy = "authors")
 private Set<Book> books;

    public Author() {

    }
    public Author(String lastName, String firstName, Set<Book> books) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.books = books;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
