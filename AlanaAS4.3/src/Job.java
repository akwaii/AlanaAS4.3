abstract class Job {
    private String companyName, position, startDate, endDate;

    //constructor
    public Job(String companyName, String position, String startDate, String endDate){
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
    public String setStartDate(){
        return startDate;
    }

    //setter for start date
    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    //getter for end date
    public String getEndDate(){
        return endDate;
    }

    //setter for end date
    public void setEndDate(String endDate){
        this.endDate = endDate;
    }

    public void DisplayJobDetails(){

    }
}
