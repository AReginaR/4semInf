package com.itis.project2.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SerialDto {
    private String name;
    private String descrition;
    private Date realiseDate;
    private Date expirationDate;
    private String genre;
}
