package com.codedemonbr;

public class BasePlus
{
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Lewis", "Hamilton", "326-595-959-78", 5000, 0.04, 300);

        System.out.println("Information obtained by get methods:\n");

        System.out.println("First name: " + employee.getFirstName());
        System.out.println("Last name: " + employee.getLastName());
        System.out.println("Social security number: " + employee.getSocialSecurityNumber());
        System.out.println("Gross sales: " + employee.getGrossSales());
        System.out.println("Commission rate:" + employee.getComissionRate());
        System.out.println("Base salary: " + employee.getBaseSalary());

        employee.setBaseSalary(1000);

        System.out.println("Employee information update obtained through toString:\n" + employee.toString());

    }
}
