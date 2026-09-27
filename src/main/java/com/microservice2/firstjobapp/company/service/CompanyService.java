package com.microservice2.firstjobapp.company.service;

import com.microservice2.firstjobapp.company.dao.Company;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();

    String createNewCompany(List<Company> company);

    boolean updateCompany(Company company, Integer id);

    boolean deleteCompany(Integer id);
}
