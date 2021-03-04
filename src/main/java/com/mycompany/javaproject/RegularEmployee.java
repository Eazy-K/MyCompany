/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaproject;


public class RegularEmployee extends BaseEmployee {
    private int salary;

    @Override
    public void setSalary(int salary) {
        if(salary<3000) {
            this.salary=3000;
        }
        else if(salary>7000){
            this.salary=7000;
        }
        else
            this.salary=salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public double primCalculator(double primAmount) {
        return primAmount*10/100;
    }

}

