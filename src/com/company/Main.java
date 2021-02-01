package com.company;

public class Main {

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        employeeArray[1] = new Employee("Ivanov Ivan1", "Engineer1", "ivivan1@mailbox.com", "1892312312", 40000, 40);
        employeeArray[2] = new Employee("Ivanov Ivan2", "Engineer2", "ivivan2@mailbox.com", "2892312312", 50000, 50);
        employeeArray[3] = new Employee("Ivanov Ivan3", "Engineer3", "ivivan3@mailbox.com", "3892312312", 60000, 60);
        employeeArray[4] = new Employee("Ivanov Ivan4", "Engineer4", "ivivan4@mailbox.com", "4892312312", 70000, 70);

        for (int i = 0; i < employeeArray.length; i++) {
            if(employeeArray[i].GetAge() > 40){
                employeeArray[i].PrintToConsole();
            }
        }
    }

}
