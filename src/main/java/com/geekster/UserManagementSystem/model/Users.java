package com.geekster.UserManagementSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer studentId;

    @NotBlank(message = "First name cannot be blank")
    @Size(max = 30, message = "First name must be at most 30 characters long")
    @Column(name = "user_name", unique = true)
    private String firstName;

    @NotBlank(message = "Last name cannot be blank")
    @Size(max = 30, message = "Last name must be at most 30 characters long")
    @Column(name = "lastName")
    private String lastName;

    @NotBlank(message = "User email cannot be blank")
    @Email(message = "Invalid email format")
    @Column(name = "user_email")
    private String userEmail;

    @NotBlank(message = "User phone number cannot be blank")
    @Pattern(regexp = "[0-9]+", message = "Phone number must contain only digits")
    @Column(name = "user_phone_number")
    private String userPhoneNumber;

    @NotNull(message = "Age cannot be null")
    @Positive(message = "Age must be a positive value")
    @Column(name = "user_age")
    private Integer age;

    @NotNull(message = "Date of birth cannot be null")
    @Column(name = "user_dob")
    private LocalDate dob;

    @NotBlank(message = "Department cannot be blank")
    @Column(name = "user_department")
    private String department;



}