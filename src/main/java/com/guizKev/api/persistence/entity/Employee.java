package com.guizKev.api.persistence.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "empleado")
@Getter
@Setter
@NoArgsConstructor

public class Employee {
    @Id
    @Column(name = "codigo_empleado", nullable = false, columnDefinition = "INTEGER")
    private int employeeCode;

    @Column(name = "nombre", nullable = false, columnDefinition = "VARCHAR(50)")
    private String firstName;

    @Column(name = "apellido1", nullable = false, columnDefinition = "VARCHAR(50)")
    private String lastName1;

    @Column(name = "apellido2", columnDefinition = "VARCHAR(50)")
    private String lastName2;

    @Column(name = "extension", nullable = false, columnDefinition = "VARCHAR(10)")
    private String extension;

    @Column(name = "email", nullable = false, columnDefinition = "VARCHAR(100)")
    private String email;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "codigo_oficina", nullable = false)
    private Office office;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "codigo_jefe", referencedColumnName = "codigo_empleado")
    private Employee manager;

    @JsonManagedReference
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Client> client;

    @Column(name = "puesto", columnDefinition = "VARCHAR(50)")
    private String position;
}
