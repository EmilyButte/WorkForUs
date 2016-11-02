package butte.emily.passionprojectserver.domain;

import javax.persistence.*;

/**
 * Created by emilybutte on 10/31/16.
 */

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    public User(String username, String password){
        this.email = username;
        this.passwordHash = password;
    }

    public User() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String toString(){
        StringBuilder value = new StringBuilder("User (");
        value.append("Id: ");
        value.append(id);
        value.append(",email: ");
        value.append(email);
        value.append(",passwordHash: ");
        value.append(passwordHash);
        value.append(")");
        return value.toString();
    }
}
