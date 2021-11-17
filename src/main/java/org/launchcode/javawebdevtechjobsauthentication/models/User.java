package org.launchcode.javawebdevtechjobsauthentication.models;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import javax.persistence.Entity;


@Entity
public class User  extends  AbstractEntity {

    private String pwHash;
    private String username;
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();


    public User(String username, String password) {
        this.username = username;
        this.pwHash = encoder.encode(password);
    }

    public String getUsername() {
        return username;
    }

    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);


    /*public void setUsernameUsername(String username) {
        this.username = username;
    }*/

    /*public String getPassword() {
        return pwHash;
    }

    public void setPassword(String pwHash) {
        this.pwHash = pwHash;
    }*/

    }

}