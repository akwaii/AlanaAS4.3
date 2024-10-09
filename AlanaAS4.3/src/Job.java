import java.time.LocalDate;
import java.time.Period;
abstract class Job {
    private String companyName, position;
    private LocalDate startDate, endDate;

    //constructor
    public Job(String companyName, String position, LocalDate startDate, LocalDate endDate){
        this.companyName = companyName;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //getter for company name
    public String getCompanyName(){
        return companyName;
    }

    //setter for company name
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    //getter for position
    public String getPosition(){
        return position;
    }

    //setter for company name
    public void setPosition(String position){
        this.position = position;
    }

    //getter for start date
    public LocalDate getStartDate(){
        return startDate;
    }

    //setter for start date
    public void setStartDate(LocalDate startDate){
        this.startDate = startDate;
    }

    //getter for end date
    public LocalDate getEndDate(){
        return endDate;
    }

    //setter for end date
    public void setEndDate(LocalDate endDate){
        this.endDate = endDate;
    }

    //abstract class for job details
    public abstract void displayJobDetails();

    //method for calculating job duration in months
    public int calculatingJobDuration(){
        Period duration = Period.between(startDate, endDate);
        return duration.getYears() * 12 + duration.getMonths(); //duration in months
    }

    //abstract class for satisfaction
    public abstract int assessJobSatisfaction();
}