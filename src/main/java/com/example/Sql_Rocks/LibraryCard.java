package com.example.Sql_Rocks;

import jakarta.persistence.*;

@Entity
@Table(name="Library card")
public class LibraryCard {
    @Id
    private int cardNo;
    private int fine;
    private int bookIssued;
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;
    @OneToOne
    @JoinColumn
    User user;

}
