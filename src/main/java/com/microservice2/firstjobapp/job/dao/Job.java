package com.microservice2.firstjobapp.job.dao;


import com.microservice2.firstjobapp.company.dao.Company;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private String minSalary;
    private String maxSalary;
    private String locations;

    @ManyToOne
    private Company company;

}
