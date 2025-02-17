package com.tushar.spring_boot_rest.repo;

import com.tushar.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>(List.of(
            new JobPost(1,"","",12,List.of("dfljas","hkjdga")),
            new JobPost(2,"","",1,List.of("dfljas","hkjdga")),
            new JobPost(3,"","",10,List.of("dfljas","hkjdga")),
            new JobPost(4,"","",2,List.of("dfljas","hkjdga")),
            new JobPost(5,"","",21,List.of("dfljas","hkjdga"))
    ));

    public List<JobPost> getAllJobs(){
        return jobs;
    }
    public void addJob(JobPost job){
        jobs.add(job);
    }
}
