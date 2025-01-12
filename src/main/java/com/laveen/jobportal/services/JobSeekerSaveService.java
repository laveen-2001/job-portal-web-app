package com.laveen.jobportal.services;

import com.laveen.jobportal.entity.JobPostActivity;
import com.laveen.jobportal.entity.JobSeekerProfile;
import com.laveen.jobportal.entity.JobSeekerSave;
import com.laveen.jobportal.repository.JobSeekerSaveRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerSaveService {
    private final JobSeekerSaveRepository jobSeekerSaveRepository;

    public JobSeekerSaveService(JobSeekerSaveRepository jobSeekerSaveRepository) {
        this.jobSeekerSaveRepository = jobSeekerSaveRepository;
    }

    public List<JobSeekerSave> getCandidatesJob(JobSeekerProfile userAccountId) {
        return jobSeekerSaveRepository.findByUserId(userAccountId);
    }

    public List<JobSeekerSave> getJobCandidates(JobPostActivity job) {
        return jobSeekerSaveRepository.findByJob(job);
    }

    public void addNew(JobSeekerSave jobSeekerSave){
        jobSeekerSaveRepository.save(jobSeekerSave);
    }
}
