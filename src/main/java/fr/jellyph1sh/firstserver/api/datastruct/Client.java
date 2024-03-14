package fr.jellyph1sh.firstserver.api.datastruct;

import org.springframework.data.annotation.Id;

public class Client {
    @Id private String id;

    private String firstname;
    private String lastname;
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    } 

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
