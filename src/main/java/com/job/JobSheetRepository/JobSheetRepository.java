package com.job.JobSheetRepository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.job.Entity.JobSheet;

public interface JobSheetRepository extends JpaRepository<JobSheet, Long> {
	List<JobSheet> findByClientNameContainingOrClientIdContaining(String clientName, String clientId);
}
