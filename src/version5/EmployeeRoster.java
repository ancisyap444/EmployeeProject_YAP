package version5;

import java.util.ArrayList;

public class EmployeeRoster {
    private ArrayList<Employee> empList;

    public EmployeeRoster() {
        this.empList = new ArrayList<>();
    }

    public EmployeeRoster(int initialCapacity) {
        this.empList = new ArrayList<>(initialCapacity);
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public boolean addEmployee(Employee emp) {
        if (emp == null) {
            return false;
        }
        return empList.add(emp);
    }

    public Employee removeEmployee(int empID) {
        for (int i = 0; i < empList.size(); i++) {
            if (empList.get(i).getEmpID() == empID) {
                return empList.remove(i);
            }
        }
        return null;
    }

    public Employee searchEmployee(int empID) {
        for (Employee emp : empList) {
            if (emp.getEmpID() == empID) {
                return emp;
            }
        }
        return null;
    }

    public int countEmployees() {
        return empList.size();
    }

    public int countHE() {
        int count = 0;
        for (Employee emp : empList) {
            if (emp instanceof HourlyEmployee) {
                count++;
            }
        }
        return count;
    }

    public int countPWE() {
        int count = 0;
        for (Employee emp : empList) {
            if (emp instanceof PieceWorkerEmployee) {
                count++;
            }
        }
        return count;
    }

    public int countCE() {
        int count = 0;
        for (Employee emp : empList) {
            if (emp instanceof CommissionEmployee && !(emp instanceof BasePlusCommissionEmployee)) {
                count++;
            }
        }
        return count;
    }

    public int countBPCE() {
        int count = 0;
        for (Employee emp : empList) {
            if (emp instanceof BasePlusCommissionEmployee) {
                count++;
            }
        }
        return count;
    }

    public void displayPayroll(int currentMonth) {
        for (Employee emp : empList) {
            double salary = emp.computeSalary(currentMonth);
            boolean bonusApplied = (emp.getBirthDate() != null && emp.getBirthDate().getMonth() == currentMonth);
            String bonusText = bonusApplied ? " (Birthday Bonus Applied)" : "";
            System.out.printf("ID: %d | Name: %-26s | Payout: ₱%,.2f%s%n",
                    emp.getEmpID(), emp.getEmpName(), salary, bonusText);
        }
    }

    public void displayAllEmployees() {
        for (int i = 0; i < empList.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, empList.get(i));
        }
    }
}