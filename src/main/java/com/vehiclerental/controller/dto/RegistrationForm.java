package com.vehiclerental.controller.dto;

import com.vehiclerental.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Simple form-backing DTO for the registration page.
 * Keeps controller lightweight and separates validation concerns.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationForm {

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid email")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;

    private String phone;

    private User.Role role;
}
