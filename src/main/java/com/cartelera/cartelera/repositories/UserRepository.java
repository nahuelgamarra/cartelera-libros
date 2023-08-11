package com.cartelera.cartelera.repositories;

import com.cartelera.cartelera.DTO.UserDTO;
import com.cartelera.cartelera.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository <User, Long> {
}
