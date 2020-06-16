package com.itis.project2.servise;

import com.itis.project2.dto.SerialDto;
import com.itis.project2.models.Serial;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface SerialService {
    List<Serial> getAll();
    void save(SerialDto dto);
}
