package com.microservice2.firstjobapp.job.repository;

import com.microservice2.firstjobapp.job.dao.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Integer> {


}
