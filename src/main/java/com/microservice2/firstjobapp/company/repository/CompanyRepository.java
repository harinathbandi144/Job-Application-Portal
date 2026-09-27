package com.microservice2.firstjobapp.company.repository;


import com.microservice2.firstjobapp.company.dao.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
