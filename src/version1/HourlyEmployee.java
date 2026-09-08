package version1;

public class HourlyEmployee {
    private int empID;
    private String empName;
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
        this(0, "N/A", 0.0f, 0.0);
    }

    public HourlyEmployee(int empID, String empName) {
        this(empID, empName, 0.0f, 0.0);
    }

    public HourlyEmployee(int empID, String empName, float totalHoursWorked, double ratePerHour){
        setEmpID(empID);
        setEmpName(empName);
        setTotalHoursWorked(totalHoursWorked);
        setRatePerHour(ratePerHour);
    }

    public int getEmpID(){
        return empID;
    }

    public void setEmpID(int empID){
        this.empID = empID;
    }
    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String empName){
        this.empName = (empName == null || empName.trim().isEmpty())? "N/A":empName;
    }

    public float getTotalHoursWorked(){
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked){
        if (totalHoursWorked < 0.0f){
            system.out.println("Warning: Total hours worked cannot be negative Setting to 0.");
            this.totalHoursWorked = 0.0f;
        } else {
            this.totalHoursWorked = totalHoursWorked
        }
    }
    public double getRatePerHour(){
        return ratePerHour;
    }
    public void setRatePerHour(double ratePerHour){
        if (ratePerHour < 0.0){
            System.out.println("Warning: Rate per hour cannot be negative setting to 0.");
            this.ratePerHour = 0.0;
        } else {
            this.ratePerHour =
                    ratePerHour;
        }
    }

    public double computeSalary(){
        if(totalHoursWorked <=)
    }
}


