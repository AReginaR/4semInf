package com.itis.project2.repository;

import com.itis.project2.models.Serial;
import com.itis.project2.models.StatusSerial;
import com.itis.project2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSerialRepository extends JpaRepository<StatusSerial, Integer>{
}
