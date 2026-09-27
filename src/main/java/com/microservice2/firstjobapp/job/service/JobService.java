package com.microservice2.firstjobapp.job.service;

import com.microservice2.firstjobapp.job.dao.Job;

import java.util.List;

public interface JobService {

    List<Job> getAllJobs();
    String createJobs(List<Job> job);

    Job getJobbyId(int id);

    boolean deleteJobs(Integer id);

    boolean updateJobs(Job job, int id);
}
