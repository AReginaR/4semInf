package com.itis.project2.servise;

import com.itis.project2.dto.SerialDto;
import com.itis.project2.models.Serial;
import com.itis.project2.repository.SerialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SerialServiceImpl implements SerialService {

    @Autowired
    private SerialRepository serialRepository;


    @Override
    public List<Serial> getAll() {
        return serialRepository.findAll();
    }

    @Override
    public void save(SerialDto dto) {

    }

}
