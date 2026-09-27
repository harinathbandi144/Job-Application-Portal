package com.microservice2.firstjobapp.company.dao;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.microservice2.firstjobapp.job.dao.Job;
import com.microservice2.firstjobapp.review.dao.Review;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Job> jobs;


    @OneToMany(mappedBy = "company")
    private List<Review> reviews;

}
