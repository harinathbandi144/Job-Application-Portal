package com.microservice2.firstjobapp.job.service;

import com.microservice2.firstjobapp.job.dao.Job;
import com.microservice2.firstjobapp.job.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService {

    //private List<Job> jobs = new ArrayList<>();

    //private Integer nextId = 1;
    private final JobRepository repository;

    @Override
    public List<Job> getAllJobs() {
        return repository.findAll();
    }

    @Override
    public String createJobs(List<Job> job) {
//
//        for(Job j:job){
//            j.setId(nextId++);
//        }
        repository.saveAll(job);
        return "Job Created Successfully";
    }

    @Override
    public Job getJobbyId(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteJobs(Integer id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;

    }

    @Override
    public boolean updateJobs(Job job, int id) {
        Optional<Job> optionalJob = repository.findById(id);
        if(optionalJob.isPresent()){
            Job job1=optionalJob.get();

            job1.setTitle(job.getTitle());
            job1.setDescription(job.getDescription());
            job1.setMinSalary(job.getMinSalary());
            job1.setMaxSalary(job.getMaxSalary());
            job1.setLocations(job.getLocations());
            return true;
        }
        return false;
    }
}
