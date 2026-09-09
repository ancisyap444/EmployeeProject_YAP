package version1;

public class CommissionEmployee {
    private int empID;
    private String empName;
    private double totalSale;

    public CommissionEmployee() {
        this(0, "N/A", 0.0);
    }

    public CommissionEmployee(int empID, String empName) {
        this(empID, empName, 0.0);
    }

    public CommissionEmployee(int empID, String empName, double totalSale) {
        setEmpID(empID);
        setEmpName(empName);
        setTotalSale(totalSale);
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        if (empID >= 0) {
            this.empID = empID;
        }
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        if (empName != null && !empName.trim().isEmpty()) {
            this.empName = empName;
        }
    }

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        if (totalSale >= 0) {
            this.totalSale = totalSale;
        }
    }

    public double computeSalary() {
        double commissionRate;
        if (totalSale < 50000) {
            commissionRate = 0.05;
        } else if (totalSale < 100000) {
            commissionRate = 0.10;
        } else if (totalSale < 500000) {
            commissionRate = 0.15;
        } else {
            commissionRate = 0.20;
        }
        return totalSale * commissionRate;
    }

    public void displayCommissionEmployee() {
        System.out.printf("ID: %d | Name: %s | Total Sales: ₱%,.2f%n",
                empID, empName, totalSale);
    }

    @Override
    public String toString() {
        return String.format("CommissionEmployee [ID: %d, Name: %s, Total Sales: ₱%,.2f, Total Salary: ₱%,.2f]",
                empID, empName, totalSale, computeSalary());
    }
}