package com.job.JobSheetController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.job.Entity.JobSheet;
import com.job.JobSheetService.JobSheetService;

@RestController
@RequestMapping("/api/jobsheets")
@CrossOrigin(origins = "*") // To allow access from React frontend

public class JobSheetController {

	 @Autowired
	    private JobSheetService jobSheetService;
	 
	 @PostMapping("/create")
	    public ResponseEntity<JobSheet> createJobSheet(@RequestBody JobSheet jobSheet) {
	        JobSheet newJobSheet = jobSheetService.saveJobSheet(jobSheet);
	        return new ResponseEntity<>(newJobSheet, HttpStatus.CREATED);
	    }
	 
	 @GetMapping("/all")
	    public ResponseEntity<List<JobSheet>> getAllJobSheets() {
	        List<JobSheet> jobSheets = jobSheetService.getAllJobSheets();
	        return new ResponseEntity<>(jobSheets, HttpStatus.OK);
	    }
	 
	 @GetMapping("/{id}")
	    public ResponseEntity<JobSheet> getJobSheetById(@PathVariable Long id) {
	        JobSheet jobSheet = jobSheetService.getJobSheetById(id);
	        return new ResponseEntity<>(jobSheet, HttpStatus.OK);
	    }
	 
	 @GetMapping("/search")
	    public ResponseEntity<List<JobSheet>> searchJobSheets(@RequestParam String query) {
	        List<JobSheet> jobSheets = jobSheetService.searchJobSheets(query);
	        return new ResponseEntity<>(jobSheets, HttpStatus.OK);
	    }
	 
	 @DeleteMapping("/{id}")
	    public ResponseEntity<String> deleteJobSheet(@PathVariable Long id) {
	        jobSheetService.deleteJobSheet(id);
	        return new ResponseEntity<>("JobSheet deleted successfully", HttpStatus.OK);
	    }
	
}
