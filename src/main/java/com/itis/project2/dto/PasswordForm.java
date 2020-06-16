package com.itis.project2.dto;

import lombok.Data;

@Data
public class PasswordForm {
    private String oldPassword;
    private String newPassword;
    private String newPassConfirm;
}
