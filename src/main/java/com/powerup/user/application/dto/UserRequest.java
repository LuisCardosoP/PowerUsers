package com.powerup.user.application.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

@Getter
@Setter

public class UserRequest {

    @NotBlank(message = "campo de name es obligatorio")
    private String name;
    @NotBlank(message = "campo de lastname es obligatorio")
    private String lastName;


    @Size(min=10, max=13, message="El campo debe tener entre 8 y 13 caracteres")
    @Pattern(regexp = "\\d+")
    @NotBlank(message = "El campo id es obligatorio")
    private String idDocument;

    @Pattern(regexp = "^\\+\\d{12}$")
    @NotBlank(message = "El campo de telefono  es obligatorio")
    private String phone;

    @NotBlank(message = "El campo correo es obligatorio")
    @Email(message = "El correo electrónico no es válido")
    private String email;
    @NotBlank(message = "campo de password es obligatorio")
    private String password;
}
