package com.job.Entity;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jobsheets")
public class JobSheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String clientId;
    private String clientName;
    private String contactInfo;
    private LocalDate receivedDate;
    private String inventoryReceived;
    private String reportedIssues;
    private String clientNotes;
    private String assignedTechnician;
    private LocalDate deadline;
    private String status;
    private Double estimatedAmount;
    private String attachmentPath;  // For file storage path

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public LocalDate getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDate receivedDate) {
        this.receivedDate = receivedDate;
    }

    public String getInventoryReceived() {
        return inventoryReceived;
    }

    public void setInventoryReceived(String inventoryReceived) {
        this.inventoryReceived = inventoryReceived;
    }

    public String getReportedIssues() {
        return reportedIssues;
    }

    public void setReportedIssues(String reportedIssues) {
        this.reportedIssues = reportedIssues;
    }

    public String getClientNotes() {
        return clientNotes;
    }

    public void setClientNotes(String clientNotes) {
        this.clientNotes = clientNotes;
    }

    public String getAssignedTechnician() {
        return assignedTechnician;
    }

    public void setAssignedTechnician(String assignedTechnician) {
        this.assignedTechnician = assignedTechnician;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getEstimatedAmount() {
        return estimatedAmount;
    }

    public void setEstimatedAmount(Double estimatedAmount) {
        this.estimatedAmount = estimatedAmount;
    }

    public String getAttachmentPath() {
        return attachmentPath;
    }

    public void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath;
    }

    // equals and hashCode methods for comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        JobSheet jobSheet = (JobSheet) obj;
        return Objects.equals(id, jobSheet.id) &&
               Objects.equals(clientId, jobSheet.clientId) &&
               Objects.equals(clientName, jobSheet.clientName) &&
               Objects.equals(contactInfo, jobSheet.contactInfo) &&
               Objects.equals(receivedDate, jobSheet.receivedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientId, clientName, contactInfo, receivedDate);
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "JobSheet{" +
                "id=" + id +
                ", clientId='" + clientId + '\'' +
                ", clientName='" + clientName + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", receivedDate=" + receivedDate +
                ", inventoryReceived='" + inventoryReceived + '\'' +
                ", reportedIssues='" + reportedIssues + '\'' +
                ", clientNotes='" + clientNotes + '\'' +
                ", assignedTechnician='" + assignedTechnician + '\'' +
                ", deadline=" + deadline +
                ", status='" + status + '\'' +
                ", estimatedAmount=" + estimatedAmount +
                ", attachmentPath='" + attachmentPath + '\'' +
                '}';
    }
}
