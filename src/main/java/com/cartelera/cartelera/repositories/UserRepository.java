package com.cartelera.cartelera.repositories;

import com.cartelera.cartelera.DTO.UserDTO;
import com.cartelera.cartelera.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
