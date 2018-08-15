package com.codedemonbr;

public class BasePlusCommissionEmployee
{
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        this.grossSales = grossSales;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    public void setComissionRate(double comissionRate) {
        if (comissionRate <= 0.0 || comissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Comission rate must be > 0.0 and  < 1.0");
        }
        this.comissionRate = comissionRate;
    }
    public double getBaseSalary() {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }



    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double comissionRate;

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double comissionRate, double baseSalary)
    {
        if(grossSales < 0.0)
        {
            throw new IllegalArgumentException("Gross sales must be > = 0");
        }

        if (comissionRate <= 0.0 || comissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Comission rate must be > 0.0 and  < 1.0");
        }

        if (baseSalary < 0.0)
        {
            throw new IllegalArgumentException("Base Salary must be > 0.0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.comissionRate = comissionRate;
        this.baseSalary = baseSalary;
    }

    public double Earnings()
    {
        return baseSalary + (comissionRate * grossSales);
    }

    @Override
    public String toString()
    {
        //This is a cumbersome but clear way to override the toString method
        String str = "\nBase-salaried commission employee: " + firstName + " " + lastName;
        str += "\nSocial security number: " + socialSecurityNumber;
        str += "\nGross sales: " + grossSales;
        str += "\nCommission rate: " + comissionRate;
        str += "\nBase salary: " + baseSalary;
        return str;
    }
}
