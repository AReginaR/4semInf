package com.itis.project2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistrationDto {

    @NotEmpty(message = "Введите email")
    private String email;

    @NotEmpty(message = "Введите имя")
    private String name;

    @Size(min = 8, max = 30, message = "Не меньше 8 символов")
    private String password;
    private String passwordConfirm;
}
