import java.time.LocalDate;

public class partTimeJob extends Job {
    private double hourlyWage;
    private int hoursPerWeek;

    public partTimeJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double hourlyWage, int hoursPerWeek) {
        super(companyName, position, startDate, endDate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    //getter for hourly wage
    public double getHourlyWage() {
        return hourlyWage;
    }

    //setter for hourly wage
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    //getter for hours weekly
    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    //setter for hours weekly
    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    //override to display specific job details
    @Override
    public void displayJobDetails() {
        System.out.println("Part-Time Job at " + getCompanyName() + " as " + getPosition());
        System.out.println("Start Date: " + getStartDate() + ", End Date: " + getEndDate());
    }

    //override for job satisfaction
    @Override
    public int assessJobSatisfaction(){
        int satisfaction = 10; //start at the highest score
        if (hoursPerWeek > 30) {
            satisfaction -= 5; //decrease satisfaction for high hours
        }
        if (hourlyWage < 15) {
            satisfaction -= 3; //decrease for lower wages
        }
        
        //ensure satisfaction does not go below 1
        if (satisfaction < 1) {
            satisfaction = 1;
        }
        
        return satisfaction;
    }

    //method to calculate salary
    public double calculateWeeklySalary() {
        return getHourlyWage() * getHoursPerWeek();
    }

    //method to determine flexibility 
    public String evaluateFlexibility() {
        if (getHoursPerWeek() <= 20) {
            return "Highly Flexible";
        } else if (getHoursPerWeek() <= 30) {
            return "Moderately Flexible";
        } else {
            return "Low Flexibility";
        }
    }
}
