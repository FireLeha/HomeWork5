package com.company;

public class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Employee(String getName, String getPosition, String getEmail, String getPhone, int getSalary, int getAge){
        fullName = getName;
        position = getPosition;
        email = getEmail;
        phone = getPhone;
        salary = getSalary;
        age = getAge;
    }

    public int GetAge(){
        return age;
    }

    void PrintToConsole(){
        System.out.println(fullName + " " + position + " " + email  + " " + phone  + " " + salary + " " + age);
    }
}
