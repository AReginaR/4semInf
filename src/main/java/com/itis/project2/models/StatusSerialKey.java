package com.itis.project2.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StatusSerialKey implements Serializable {

    private Integer user;

    private Integer serial;

}
