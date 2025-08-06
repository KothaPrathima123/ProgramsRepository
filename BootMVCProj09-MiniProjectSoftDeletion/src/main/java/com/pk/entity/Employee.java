package com.pk.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name="employee")
@Entity
@SQLDelete(sql = "UPDATE EMPLOYEE SET STATUS='inactive' WHERE EMPNO=?")
@Where(clause="STATUS<> 'inactive'")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empno;

    @Column(length = 30)
    @NonNull
    private String ename;

    @Column(length = 30)
    @NonNull
    private String job;

    @NonNull
    private Double sal;
    @Transient//for ot paticipating in persistence operations
    private String vflag="no";
    
    private String status="active";
}

