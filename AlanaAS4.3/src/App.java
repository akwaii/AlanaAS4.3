import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // create an Employee object
        Employee employee = new Employee("Alice Smith", 101);

        // create instances of each job subclass
        contractJob contractJob1 = new contractJob("Tech Innovations", "Frontend Developer",
                LocalDate.of(2023, 3, 10), LocalDate.of(2024, 6, 10), 25, 500, 1000, 200);

        fullTimeJob fullTimeJob1 = new fullTimeJob("Global Solutions", "Senior Software Engineer",
                LocalDate.of(2022, 5, 1), LocalDate.of(2023, 1, 31), 40, 85000);

        partTimeJob partTimeJob1 = new partTimeJob("Retail Store", "Sales Associate",
                LocalDate.of(2020, 7, 1), LocalDate.of(2021, 1, 31), 15, 20);

        // add jobs to the employee's job history
        employee.addJob(contractJob1);
        employee.addJob(fullTimeJob1);
        employee.addJob(partTimeJob1);

        // display job history
        employee.displayJobHistory();

        // calculate total experience
        int totalExperience = employee.calculateTotalExperience();
        System.out.println("Total Experience: " + totalExperience + " years");

        // calculate average satisfaction
        double averageSatisfaction = employee.calculateAverageSatisfaction();
        System.out.printf("\nAverage Job Satisfaction: %.2f\n", averageSatisfaction);

        //other info
        System.out.println("\nContract Payment: " + contractJob1.calculatePayment());

        System.out.println("\nContract Job Security: " + contractJob1.evaluateJobSecurity());

        System.out.println("\nFull-Time Work-Life Balance: " + fullTimeJob1.evaluateWorkLifeBalance());

        System.out.println("\nPart-Time Salary: " + partTimeJob1.calculateWeeklySalary());

        System.out.println("\nPart-Time Flexibility: " + partTimeJob1.evaluateFlexibility());

    }
}