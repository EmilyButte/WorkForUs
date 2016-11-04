package butte.emily.passionprojectserver.domain;

import javax.persistence.*;

/**
 * Created by emilybutte on 10/31/16.
 */

@Entity
//@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;

    public User(String email, String password){
        this.email = email;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        StringBuilder value = new StringBuilder("User (");
        value.append("Id: ");
        value.append(id);
        value.append(",email: ");
        value.append(email);
        value.append(",password: ");
        value.append(password);
        value.append(")");
        return value.toString();
    }
}
