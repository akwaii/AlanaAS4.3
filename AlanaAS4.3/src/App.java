import java.time.LocalDate;
public class App {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("Alice Smith", 101);

        // Create instances of each job subclass
        contractJob contractJob1 = new contractJob("Tech Innovations", "Frontend Developer", 
            LocalDate.of(2022, 1, 10), LocalDate.of(2023, 6, 10), 25, 500, 1000, 200);
        
        fullTimeJob fullTimeJob1 = new fullTimeJob("Global Solutions", "Senior Software Engineer", 
            LocalDate.of(2020, 5, 1), LocalDate.of(2022, 12, 31), 40, 85000);
        
        partTimeJob partTimeJob1 = new partTimeJob("Retail Store", "Sales Associate", 
            LocalDate.of(2023, 7, 1), LocalDate.of(2024, 1, 31), 15, 20);
        
        // Add jobs to the employee's job history
        employee.addJob(contractJob1);
        employee.addJob(fullTimeJob1);
        employee.addJob(partTimeJob1);

        // Display job history
        employee.displayJobHistory();

        // Calculate total experience
        int totalExperience = employee.calculateTotalExperience();
        System.out.println("Total Experience: " + totalExperience + " years");

        // Calculate average satisfaction
        double averageSatisfaction = employee.calculateAverageSatisfaction();
        System.out.printf("Average Job Satisfaction: %.2f\n", averageSatisfaction);
    }
}