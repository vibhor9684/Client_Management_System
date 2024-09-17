package com.job.JobSheetService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.Entity.JobSheet;
import com.job.JobSheetRepository.JobSheetRepository;
@Service
public class JobSheetService {
	@Autowired
    private JobSheetRepository jobSheetRepository;
	
	public JobSheet saveJobSheet(JobSheet jobSheet) {
        return jobSheetRepository.save(jobSheet);
    }
	
	public List<JobSheet> getAllJobSheets() {
        return jobSheetRepository.findAll();
    }
	
	public JobSheet getJobSheetById(Long id) {
        return jobSheetRepository.findById(id).orElse(null);
    }

	public List<JobSheet> searchJobSheets(String query) {
        return jobSheetRepository.findByClientNameContainingOrClientIdContaining(query, query);
    }

    public void deleteJobSheet(Long id) {
        jobSheetRepository.deleteById(id);
    }

}
