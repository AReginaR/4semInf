package com.itis.project2.repository;

import com.itis.project2.models.Serial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SerialRepository extends JpaRepository<Serial, Integer> {
    Optional<Serial> findById(Integer id);
}
