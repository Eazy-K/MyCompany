/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaproject;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeManager extends BaseManager {
    BaseEmployee[] employees;
    private int size;
    private int capacity;
    public EmployeeManager() throws ParseException {
        size = 0;
        capacity = 1;
        employees = new BaseEmployee[1];
        initilazeTheEmployee();
    }
    public int getSize(){
        return size;
    }
    public void initilazeTheEmployee() throws ParseException {
        AddManagerEmployee("Veli Can","Kahraman",15500,15000,"09/01/2015");
        AddManagerEmployee("Anıl","Akdemir",15500,15000,"09/01/2015");
        AddManagerEmployee("Serhat","Kendiz",7000,1000,"09/02/2015");
        AddManagerEmployee("Kürşad","Küçük",10000,15000,"12/05/2016");
        AddRegularEmployee("Ömer Faruk","Duman",5000,10000,"17/06/2017");
        AddRegularEmployee("Deniz","Murat",5000,10000,"29/01/2018");
        AddPartTimeEmployee("Halil","Cansızer",3500,10000,"05/02/2015");//
        AddPartTimeEmployee("Ömer","Gençay",3000,8000,"07/12/2019");
        AddPartTimeEmployee("Mehmet","Altunkaya",3000,8000,"07/12/2019");
        AddRegularEmployee("Yasin","Genç",4000,4000,"19/10/2018");
        AddManagerEmployee("Anılcan","Turhan",7000,1000,"09/02/2015");
        AddRegularEmployee("Mahmut","Kasap",5500,10000,"13/07/2016");
        AddRegularEmployee("Demir","Bayar",5000,10000,"17/06/2017");
        AddRegularEmployee("Hanifi","Terzi",5200,10000,"29/03/2018");
        AddPartTimeEmployee("Selim","Tüccar",3500,10000,"13/02/2015");//
        AddPartTimeEmployee("Tarık","Sevinç",3000,8000,"30/12/2019");
        AddPartTimeEmployee("Murat","Müştekin",3000,8000,"07/12/2019");
        AddRegularEmployee("Alican","Gönültaş",4000,4000,"19/10/2018");
        AddRegularEmployee("Ahmet","Kaya",5000,15000,"12/05/2016");
        AddRegularEmployee("İbrahim","Aslan",5000,10000,"17/06/2017");
        AddRegularEmployee("Kerimcan","Durmaz",5000,10000,"29/01/2018");
        AddPartTimeEmployee("Saffet","Cansız",3500,10000,"05/02/2015");//
        AddPartTimeEmployee("Tracy","Kolunade",3000,8000,"07/12/2019");
        AddPartTimeEmployee("Jhonssan","Martin",3000,8000,"07/12/2019");
        AddRegularEmployee("Selvi","Kara",4000,4000,"19/10/2018");
        AddRegularEmployee("Ayşen","Deli",5000,15000,"12/05/2016");
        AddRegularEmployee("Kerimhan","Çiçek",5000,10000,"17/06/2017");
        AddRegularEmployee("Tolgacan","Can",5000,10000,"29/01/2018");
        AddPartTimeEmployee("Atayk","Mayk",3500,10000,"05/02/2015");//
        AddPartTimeEmployee("Ömer","Çelebi",3000,8000,"07/12/2019");
        AddPartTimeEmployee("Ramazan","Keskin",3000,8000,"07/12/2019");
        AddRegularEmployee("Erdem","Kahraman",4000,4000,"19/10/2018");
    }
    
    
    
    public void AddPartTimeEmployee(String name, String surname, int salary) {
        Date dateNow = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        if (size == capacity) {
            ensureCapacity();
        }
            employees[size] = new PartTimeEmployee();
            employees[size].setName(name);
            employees[size].setSurname(surname);
            employees[size].setSalary(salary);
            employees[size].setPosition("Part-Time");
            employees[size].setPrimAmount(0);
            employees[size].setId(size+1);
            employees[size].setStartDate(dateFormat.format(dateNow));
            size++;
    }
     //overloading for initializing Employees
    public void AddPartTimeEmployee(String name, String surname, int salary,double prim,String startDate) throws ParseException {
        Date date;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        date = dateFormat.parse(startDate);
        if (size == capacity) {
            ensureCapacity();
        }
        employees[size] = new PartTimeEmployee();
        employees[size].setName(name);
        employees[size].setSurname(surname);
        employees[size].setSalary(salary);
        employees[size].setPosition("Part-Time");
        employees[size].setPrimAmount(prim);
        employees[size].setId(size+1);
        employees[size].setStartDate(dateFormat.format(date));
        size++;
    }
    public void AddRegularEmployee(String name,String surname,int salary){
        Date dateNow = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        if (size == capacity) {
            ensureCapacity();
        }
        employees[size] = new RegularEmployee();
        employees[size].setName(name);
        employees[size].setSurname(surname);
        employees[size].setSalary(salary);
        employees[size].setPosition("Regular");
        employees[size].setPrimAmount(0);
        employees[size].setId(size+1);
        employees[size].setStartDate(dateFormat.format(dateNow));
        size++;
    }
    public void AddRegularEmployee(String name,String surname,int salary,double prim,String startDate) throws ParseException {
        Date date;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        date = dateFormat.parse(startDate);
        if (size == capacity) {
            ensureCapacity();
        }
        employees[size] = new RegularEmployee();
        employees[size].setName(name);
        employees[size].setSurname(surname);
        employees[size].setSalary(salary);
        employees[size].setPosition("Regular");
        employees[size].setPrimAmount(prim);
        employees[size].setId(size+1);
        employees[size].setStartDate(dateFormat.format(date));
        size++;
    }
    public void AddManagerEmployee(String name,String surname,int salary){
        Date dateNow = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        if (size == capacity) {
            ensureCapacity();
        }
        employees[size] = new ManagerEmployee();
        employees[size].setName(name);
        employees[size].setSurname(surname);
        employees[size].setSalary(salary);
        employees[size].setPosition("Manager");
        employees[size].setPrimAmount(0);
        employees[size].setId(size+1);
        employees[size].setStartDate(dateFormat.format(dateNow));
        size++;
    }

    public void AddManagerEmployee(String name,String surname,int salary,double prim,String startDate) throws ParseException {
        Date date;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        date = dateFormat.parse(startDate);
        if (size == capacity) {
            ensureCapacity();
        }
        employees[size] = new ManagerEmployee();
        employees[size].setName(name);
        employees[size].setSurname(surname);
        employees[size].setSalary(salary);
        employees[size].setPosition("Manager");
        employees[size].setPrimAmount(prim);
        employees[size].setId(size+1);
        employees[size].setStartDate(dateFormat.format(date));
        size++;
    }
    public BaseEmployee FindEmployee(String name,String surname){
        boolean isTrue = false;
        BaseEmployee temp = new BaseEmployee();
        for(BaseEmployee employee:employees){
            if(employee.getName().matches(name) && employee.getSurname().matches(surname)){
                temp = employee;
                isTrue = true;
            }
        }
        if(isTrue)
            return temp;
        else
            return null;
    }
    public void changePosition(BaseEmployee employee,String position) throws ParseException{//switch leri değiştir string ile
        BaseEmployee temp;
        temp = employee;
        removeforChangeEmployee(employee.getName(),employee.getSurname());
        switch(position){
            case "Manager":
               AddManagerEmployee(temp.getName(),temp.getSurname(),temp.getSalary(),temp.getPrimAmount(),temp.getStartDate());
               FindEmployee(temp.getName(),temp.getSurname()).setId(temp.getId());
               sortID();
                break;
            case "Regular":
                AddRegularEmployee(temp.getName(),temp.getSurname(),temp.getSalary(),temp.getPrimAmount(),temp.getStartDate());
                FindEmployee(temp.getName(),temp.getSurname()).setId(temp.getId());
                sortID();
                break;
            case "Part-Time":
                AddPartTimeEmployee(temp.getName(),temp.getSurname(),temp.getSalary(),temp.getPrimAmount(),temp.getStartDate());
                FindEmployee(temp.getName(),temp.getSurname()).setId(temp.getId());
                sortID();
                break;
            default:
                System.out.println("Invalid Position,Back to Main Menu");
                break;
        }
    }
    private void removeforChangeEmployee(String name,String surname){
        for (int index = 0; index <= employees.length - 1; index++) {
            if (employees[index].getName().matches(name) && employees[index].getSurname().matches(surname)) {
                for (int tempIndex = index; tempIndex <= employees.length - 1; tempIndex++) {
                    if (tempIndex == employees.length - 1) {
                        employees[tempIndex] = null;
                        reduceCapacity();
                        size--;
                        break;
                    } else
                        employees[tempIndex] = employees[tempIndex + 1];
                }
            }
        }
    }
    @Override
    public void Remove(int id) {
        boolean removed=false;
        for (int index = 0; index < employees.length; index++) {
            if (employees[index].getId()== id) {
                for (int tempIndex = index; tempIndex <= employees.length - 1; tempIndex++) {
                    if (tempIndex == employees.length - 1) {
                        employees[tempIndex] = null;
                        reduceCapacity();
                        size--;
                        break;
                    } else
                        employees[tempIndex] = employees[tempIndex + 1];
                }
                removed = true;
            }
        }
        if(removed)
            System.out.println(" REMOVED");
        else
            System.out.println(" didn't found");
    }
    public void showEmployeePrim(String name,String surname){
        boolean isTrue=false;
        double number;
        for (BaseEmployee employee : employees) {
            if (employee.getName().matches(name) && employee.getSurname().matches(surname)) {
                number = employee.primCalculator(employee.getPrimAmount());
                System.out.println(name + " " + surname + "'s mounthly prim is " + number);
                isTrue = true;
            }
        }
        if(!isTrue)
            System.out.println(name+" "+surname+" didn't found");


    }

    public void sortID() {
        BaseEmployee temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < employees.length - 1; i++) {
                if (employees[i].getId() > employees[i + 1].getId()) {
                    temp = employees[i];
                    employees[i] = employees[i + 1];
                    employees[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public void ShowAllEmployee() {
        for (BaseEmployee employee : employees) {
            employee.getAllCard();
        }
    }
    public void SortofSalary(BaseEmployee[] tempEmployees){
        BaseEmployee temp;
        for(int i=0;i<employees.length;i++)
            tempEmployees[i]=employees[i];
        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i <tempEmployees.length-1 ; i++) {
                if (tempEmployees[i].getSalary() < tempEmployees[i+1].getSalary()) {
                    temp = tempEmployees[i];
                    tempEmployees[i] = tempEmployees[i+1];
                    tempEmployees[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
    @Override
    public void ensureCapacity(){
        BaseEmployee[] tempEmployeeManager = new BaseEmployee[capacity + 1];
        for (int i = 0; i < capacity; i++) {
            tempEmployeeManager[i] = employees[i];
        }
        employees = tempEmployeeManager;
        capacity = capacity + 1;
    }
    @Override
    public void reduceCapacity(){
        BaseEmployee[] tempEmployeeManager = new BaseEmployee[capacity-1];
        for(int i=0;i<capacity-1;i++){
            tempEmployeeManager[i]=employees[i];
        }
        employees=tempEmployeeManager;
        capacity--;
    }
}