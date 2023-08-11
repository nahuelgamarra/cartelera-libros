package com.cartelera.cartelera.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "location")
public class Location extends BaseEntity{
    private String  name;

}
