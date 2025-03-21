    package org.example.employees;

public class Jobs {
    private String jobTitle;
    private String jobDescription;
    private String jobLocation;
    private String jobSalary;

    public Jobs(String jobTitle, String jobDescription, String jobLocation, String jobSalary) {
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.jobLocation = jobLocation;
        this.jobSalary = jobSalary;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "jobTitle='" + jobTitle + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", jobLocation='" + jobLocation + '\'' +
                ", jobSalary='" + jobSalary + '\'' +
                '}';
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public String getJobSalary() {
        return jobSalary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public void setJobSalary(String jobSalary) {
        this.jobSalary = jobSalary;
    }
}
