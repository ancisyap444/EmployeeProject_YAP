package version2;

public class HourlyEmployee {
    private int empID;
    private Name empName;
    private MyDate birthDate;
    private MyDate dateHired;
    private double totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
        this(0, new Name(), new MyDate(), new MyDate(), 0.0, 0.0);
    }

    public HourlyEmployee(int empID, Name empName) {
        this(empID, empName, new MyDate(), new MyDate(), 0.0, 0.0);
    }

    public HourlyEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired, double totalHoursWorked, double ratePerHour) {
        setEmpID(empID);
        setEmpName(empName);
        setBirthDate(birthDate);
        setDateHired(dateHired);
        setTotalHoursWorked(totalHoursWorked);
        setRatePerHour(ratePerHour);
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        if (empID > 0) {
            this.empID = empID;
        }
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = (empName != null) ? empName : new Name();
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = (birthDate != null) ? birthDate : new MyDate();
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = (dateHired != null) ? dateHired : new MyDate();
    }

    public double getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(double totalHoursWorked) {
        if (totalHoursWorked >= 0.0) {
            this.totalHoursWorked = totalHoursWorked;
        }
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        if (ratePerHour >= 0.0) {
            this.ratePerHour = ratePerHour;
        }
    }

    public double computeSalary() {
        if (totalHoursWorked <= 40.0) {
            return totalHoursWorked * ratePerHour;
        } else {
            double regularPay = 40.0 * ratePerHour;
            double overtimePay = (totalHoursWorked - 40.0) * (ratePerHour * 1.5);
            return regularPay + overtimePay;
        }
    }

    public double computeSalary(int currentMonth) {
        double salary = computeSalary();
        if (birthDate != null && birthDate.getMonth() == currentMonth) {
            salary += 5000.00;
        }
        return salary;
    }

    public void displayHourlyEmployee() {
        System.out.printf("ID: %d | Name: %s | DOB: %s | Hired: %s | Hours: %.2f | Rate: ₱%,.2f/hr%n",
                empID, empName, birthDate, dateHired, totalHoursWorked, ratePerHour);
    }

    @Override
    public String toString() {
        return String.format("HourlyEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Hours: %.2f, Rate: ₱%,.2f, Total Salary: ₱%,.2f]",
                empID, empName, birthDate, dateHired, totalHoursWorked, ratePerHour, computeSalary());
    }
}