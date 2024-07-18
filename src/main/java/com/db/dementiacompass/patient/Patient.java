package com.db.dementiacompass.patient;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String sex;
    private String maritalStatus;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    private String contact;
    private String primaryCaregiverName;
    private String primaryCaregiverContact;
    private String profession;

    @OneToMany(cascade = CascadeType.ALL)
    private List<MedicalHistory> medicalHistory;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Medicine> medicines;
}
