package br.com.gestao_vagas.gestao_vagas.modules.company.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity(name = "Company")
@Data

public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank
    @Pattern(regexp = "^\\S+$", message = "O campo [username] não deve conter espaço")
    private String username;
    @Email(message = "O campo deve conter um email válido")
    private String email;

    @Length(min = 10, max = 100, message = "a senha deve ter 10 á 100 caracteres")
    private String password;
    
    private String website;
    private String name;
    private String description;

    private LocalDateTime createdAt;
}