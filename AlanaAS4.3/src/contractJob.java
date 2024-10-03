import java.time.LocalDate;

public class contractJob extends Job {
    private double hourlyRate, bonus, penalty;
    private int hoursWorked;

    //constructor
    public contractJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double hourlyRate, int hoursWorked, double bonus, double penalty) {
        super(companyName, position, startDate, endDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.bonus = bonus;
        this.penalty = penalty;
    }

    //getter for hourly rate
    public double getHourlyRate(){
        return hourlyRate;
    }
    
    //setter for hourly rate
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    //getter for bonus
    public double getBonus(){
        return bonus;
    }

    //setter for bonus
    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    //getter for penalty
    public double getPenalty(){
        return penalty;
    }

    //setter for penalty
    public void setPenalty(double penalty){
        this.penalty = penalty;
    }

    //getter for hours worked
    public int getHoursWorked(){
        return hoursWorked;
    }

    //setter for hours worked
    public void getHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    //override to display specific job details
    @Override
    public void displayJobDetails() {
        System.out.println("Contract Job at " + getCompanyName() + " as " + getPosition());
        System.out.println("Contract Start Date: " + getStartDate() + ", Contract End Date: " + getEndDate());
    }

    @Override
    public String assessJobSatisfaction(){
        return "N/A"; //place holder fix this
    }

    //method to calculate payment
    public double calculatePayment() {
        return (hourlyRate * hoursWorked) + bonus - penalty;
    }

    //method to evaluate job security
    public String evaluateJobSecurity() {
        int contractLength = getEndDate().getYear() - getStartDate().getYear();
        if (contractLength >= 2) {
            return "High";
        } else if (contractLength == 1) {
            return "Medium";
        } else {
            return "Low";
        }
    }
}