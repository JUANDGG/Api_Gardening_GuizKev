package com.guizKev.api.persistence.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "oficina")
@Getter @Setter @NoArgsConstructor
public class Office {
    @Id
    @Column(name = "codigo_oficina", nullable = false, columnDefinition = "VARCHAR(10)")
    private String officeCode;

    @Column(name = "ciudad", nullable = false, columnDefinition = "VARCHAR(30)")
    private String city;

    @Column(name = "pais", nullable = false, columnDefinition = "VARCHAR(50)")
    private String country;

    @Column(name = "region", columnDefinition = "VARCHAR(50)")
    private String region;

    @Column(name = "codigo_postal", nullable = false, columnDefinition = "VARCHAR(10)")
    private String postalCode;

    @Column(name = "telefono", nullable = false, columnDefinition = "VARCHAR(20)")
    private String phone;

    @Column(name = "linea_direccion1", nullable = false, columnDefinition = "VARCHAR(50)")
    private String addressLine1;

    @Column(name = "linea_direccion2", columnDefinition = "VARCHAR(50)")
    private String addressLine2;


    
    @OneToMany(mappedBy = "office", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Employee> employee ;
}
