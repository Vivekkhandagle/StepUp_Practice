package com.example.oops.ComparableAndComparator;

public class Employee implements Comparable<Employee> {

            int employeeId;
            String employeeName;
            String employeeDepartment;
            int employeeSalary;

            Employee(int employeeId, String employeeName,
                     String employeeDepartment,
                     int employeeSalary)
            {
                this.employeeId=employeeId;
                this.employeeName=employeeName;
                this.employeeDepartment=employeeDepartment;
                this.employeeSalary=employeeSalary;
            }

            @Override
            public String toString() {
                return "Employee{" +
                        "employeeId=" + employeeId +
                        ", employeeName='" + employeeName + '\'' +
                        ", employeeDepartment='" + employeeDepartment + '\'' +
                        ", employeeSalary=" + employeeSalary +
                        '}';
            }


    @Override
    public int compareTo(Employee o) {
        return this.employeeName.compareTo(o.employeeName);
    }
}
