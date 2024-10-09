import java.time.LocalDate;

public class fullTimeJob extends Job{
    private double hourlyWage;
    private int hoursPerWeek;

    public fullTimeJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double hourlyWage, int hoursPerWeek){
        super(companyName, position, startDate, endDate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    //getter for hourly wage
    public double getHourlyWage(){
        return hourlyWage;
    }

    //setter for hourly wage
    public void setHourlyWage(double hourlyWage){
        this.hourlyWage = hourlyWage;
    }

    //getter for hours per week
    public int getHoursPerWeek(){
        return hoursPerWeek;
    }

    //setter for hours per week
    public void setHoursPerWeek(int hoursPerWeek){
        this.hoursPerWeek = hoursPerWeek;
    }

    //oveerride to display specific job details
    @Override
    public void displayJobDetails(){
        System.out.println("Full time job at: " + getCompanyName() + " as a: " + getPosition());
        System.out.println("Start date: " + getStartDate() + " End Date: " + getEndDate());
    }

    @Override
    public int assessJobSatisfaction(){
        int satisfaction = 10; //start at the highest score
        if (hoursPerWeek > 50) {
            satisfaction -= 5; //decrease satisfaction for high hours
        }
        if (hourlyWage < 25) {
            satisfaction -= 3; //decrease for lower wages
        }
        
        //ensures satisfaction does not go below 1
        if (satisfaction < 1) {
            satisfaction = 1;
        }
        
        return satisfaction;
    }

    //method to calculate salary
    public double calculateSalary(){
        int weeksPerMonth = 4;

        return hourlyWage*hoursPerWeek*weeksPerMonth;
    }

    //method to evaluate work life balance
    public String evaluateWorkLifeBalance(){
        if (hoursPerWeek <= 40){
            return "Excellent.";
        } else if (hoursPerWeek <= 50){
            return "Modeerate.";
        } else {
            return "Poor";
        }
    }
}