package com.cartelera.cartelera.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "boock")
public class Boock extends BaseEntity {
    @Column(name = "boockTitle")
    private String boockTitle;
    @Column(name = "date")
    private Date date;
    @Column(name = "gender")
    private String gender;
    @Column(name = "pages")
    private Integer pages;
    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Author> authors;

}
