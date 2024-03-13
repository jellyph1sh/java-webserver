package fr.jellyph1sh.firstserver.api.datastruct;

import org.springframework.data.annotation.Id;

public class Person {
    @Id private String id;

    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    } 

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
