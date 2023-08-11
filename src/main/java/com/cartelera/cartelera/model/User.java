package com.cartelera.cartelera.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email", unique = true, nullable = false)
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_addres")
    private Address address;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "user_boock",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "boock_id")
    )
    private List<Boock> boocks = new ArrayList<Boock>();

}
