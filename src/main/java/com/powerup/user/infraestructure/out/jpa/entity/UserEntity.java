package com.powerup.user.infraestructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    //@NotBlank(message = "campo de name es obligatorio")
    @Column(name = "name", nullable = false, length = 60)
    private String name;

    //@NotBlank(message = "El campo lastname es obligatorio")
    @Column(name = "lastname", nullable = false, length = 60)
    private String lastName;

    //@Pattern(regexp = "^\\+\\d{12}$")
    // @NotBlank(message = "El campo de telefono  es obligatorio")
    @Column(name = "phone", nullable = false, length = 60)
    private String phone;


    //@NotBlank(message = "El campo correo es obligatorio")
    //@Email(message = "El correo electrónico no es válido")
    @Column(name = "email", nullable = false, length = 60)
    private String email;

    //@NotBlank(message = "El campo password es obligatorio")
    @Column(name = "password", nullable = false, length = 60)
    private String password;

    @JoinColumn(name = "id_role", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch =
    FetchType.EAGER)
    private RoleEntity role;

    //@Pattern(regexp = "\\d+")
    //@NotBlank(message = "El campo id es obligatorio")
    @Column(name = "id_document", nullable = false, length = 60)
    private String idDocument;
}
