package version2;

public class BasePlusCommissionEmployee {
    private int empID;
    private Name empName;
    private MyDate birthDate;
    private MyDate dateHired;
    private double totalSales;
    private double baseSalary;

    public BasePlusCommissionEmployee() {
        this(0, new Name(), new MyDate(), new MyDate(), 0.0, 0.0);
    }

    public BasePlusCommissionEmployee(int empID, Name empName) {
        this(empID, empName, new MyDate(), new MyDate(), 0.0, 0.0);
    }

    public BasePlusCommissionEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired, double totalSales, double baseSalary) {
        setEmpID(empID);
        setEmpName(empName);
        setBirthDate(birthDate);
        setDateHired(dateHired);
        setTotalSales(totalSales);
        setBaseSalary(baseSalary);
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

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        if (totalSales >= 0.0) {
            this.totalSales = totalSales;
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0.0) {
            this.baseSalary = baseSalary;
        }
    }

    public double computeSalary() {
        double rate;
        if (totalSales < 50000.0) {
            rate = 0.05;
        } else if (totalSales < 100000.0) {
            rate = 0.10;
        } else if (totalSales < 500000.0) {
            rate = 0.15;
        } else {
            rate = 0.20;
        }
        return baseSalary + (totalSales * rate);
    }

    public double computeSalary(int currentMonth) {
        double salary = computeSalary();
        if (birthDate != null && birthDate.getMonth() == currentMonth) {
            salary += 5000.00;
        }
        return salary;
    }

    public void displayBasePlusCommissionEmployee() {
        System.out.printf("ID: %d | Name: %s | DOB: %s | Hired: %s | Sales: ₱%,.2f | Base Salary: ₱%,.2f%n",
                empID, empName, birthDate, dateHired, totalSales, baseSalary);
    }

    @Override
    public String toString() {
        return String.format("BasePlusCommissionEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Sales: ₱%,.2f, Base Salary: ₱%,.2f, Total Salary: ₱%,.2f]",
                empID, empName, birthDate, dateHired, totalSales, baseSalary, computeSalary());
    }
}