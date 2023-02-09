package com.example.Sql_Rocks;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Entity
@Table(name="author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int bookWritten;
    private  int country;
    private String age;

    public Author() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookWritten() {
        return bookWritten;
    }

    public void setBookWritten(int bookWritten) {
        this.bookWritten = bookWritten;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
