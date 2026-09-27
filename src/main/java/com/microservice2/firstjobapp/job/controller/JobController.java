package com.microservice2.firstjobapp.job.controller;


import com.microservice2.firstjobapp.job.dao.Job;
import com.microservice2.firstjobapp.job.service.JobServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobServiceImpl jobServiceImpl;

    public JobController(JobServiceImpl jobServiceImpl) {
        this.jobServiceImpl = jobServiceImpl;
    }


    @GetMapping()
    public ResponseEntity<List<Job>> getALl(){
        List<Job> jobs = jobServiceImpl.getAllJobs();
        if (!jobs.isEmpty()){
            return ResponseEntity.ok(jobs);
        }
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobbyId(@PathVariable int id){

        Job job = jobServiceImpl.getJobbyId(id);
        if(job!=null){
            return ResponseEntity.ok(job);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping()
    public String createJobs(@RequestBody List<Job> job){
        return jobServiceImpl.createJobs(job);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJobs(@PathVariable Integer id) {
        boolean jobs = jobServiceImpl.deleteJobs(id);
        if (jobs){
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateJobs(@RequestBody Job job, @PathVariable int id){
        boolean updatejobs = jobServiceImpl.updateJobs(job, id);
        if (updatejobs){
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.noContent().build();
        }
    }
//
//    @GetMapping("/{id}/company")
//    public String getCompany(@PathVariable int id){
//        for (Job job:jobs){
//            if (job.getId()==id){
//                return job.getTitle();
//            }
//        }
//        return null;
//    }
}
