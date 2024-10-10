import java.util.ArrayList;
import java.util.List;
import java.time.Period;

public class Employee {
    private String name;
    private int employeeId;
    private List<Job> jobHistory;

    //constructor
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
        this.jobHistory = new ArrayList<>();
    }

    //method to add a job to the employee's history
    public void addJob(Job job) {
        jobHistory.add(job);
    }

    //method to retrieve job details
    public void displayJobHistory() {
        if (jobHistory.isEmpty()) {
            System.out.println(name + " has no job history.");
            return;
        }

        System.out.println("Job history for " + name + ":");
        for (Job job : jobHistory) {
            job.displayJobDetails();
            System.out.println("Satisfaction Score: " + job.assessJobSatisfaction());
            System.out.println();
        }
    }

    //method to calculate total work experience in years
    public int calculateTotalExperience() {
        int totalExperience = 0;
        for (Job job : jobHistory) {
            totalExperience += Period.between(job.getStartDate(), job.getEndDate()).getYears();
        }
        return totalExperience;
    }
    

    //method to calculate average job satisfaction
    public double calculateAverageSatisfaction() {
        if (jobHistory.isEmpty()) {
            return 0.0; // Return 0 if no jobs exist
        }

        int totalSatisfaction = 0;
        for (Job job : jobHistory) {
            totalSatisfaction += job.assessJobSatisfaction();
        }

        return (double) totalSatisfaction / jobHistory.size();
    }

    //getters
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}