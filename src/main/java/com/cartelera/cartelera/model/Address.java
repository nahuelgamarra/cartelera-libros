package com.cartelera.cartelera.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address extends BaseEntity{
    @Column(name = "street")
    private String  street;
    @Column(name = "number")
    private String number;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_location")
    private Location location;

}
