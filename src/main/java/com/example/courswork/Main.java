package com.example.courswork;

public class Main {

        public static Employee[] employees = new Employee[10];

        public static void main(String[] args) {
            employees[0] = new Employee("Петров Андрей Игоревич", 1, 35000);
            employees[1] = new Employee("Семенов Антон Петрович", 3, 40000);
            employees[2] = new Employee("Андреев Анатолий егорович", 4, 55000);
            employees[3] = new Employee("Иванов Анатолий Владимирович", 2, 50000);
            employees[4] = new Employee("Сергеев Сергей Николаевич", 2, 60000);
            employees[5] = new Employee("Михайлов Алексей Петрович", 3, 450000);
            employees[6] = new Employee("Горбачев Михаил Андреевич", 5, 90000);
            employees[7] = new Employee("Киров Алексей Сергеевич", 4, 40000);
            employees[8] = new Employee("Слунев Генадий Евгеньевич", 4, 60000);
            employees[9] = new Employee("Кондаков Сергей Андреевич", 5, 100000);
            for (Employee employee : employees) {
                System.out.println(employee);
            }
            System.out.println("Сумма зарплат: " + printTotalSalary());
            System.out.println("Максимальная зарплата: " + findMaxSalary());
            System.out.println("Минимальная зарплата: " + findMinSalary());
            System.out.println("Средняя зарплата: " + findAverageSalary());
            System.out.println(printFullsNames());

        }

        public static int printTotalSalary() {
            int totalSalary = 0;
            for (Employee employee : employees) {
                totalSalary = totalSalary + employee.getSalary();
            }
            return totalSalary;
        }

        public static Employee findMaxSalary() {
            int maxSalary = 0;
            Employee employee = null;
            for (Employee emp : employees) {
                if (emp.getSalary() > maxSalary) {
                    maxSalary = emp.getSalary();
                    employee = emp;
                }
            }
            return employee;
        }

        public static Employee findMinSalary() {
            int minSalary = 1000000;
            Employee employee = null;
            for (Employee emp : employees) {
                if (emp.getSalary() < minSalary) {
                    minSalary = emp.getSalary();
                    employee = emp;
                }
            }
            return employee;
        }

        public static double findAverageSalary() {
            int totalSalary = 0;
            for (Employee employee : employees) {
                totalSalary = totalSalary + employee.getSalary();
            }
            return totalSalary / (double) employees.length;
        }

        public static String printFullsNames() {
            for (Employee employee : employees) {
                System.out.println(employee.getFullName());
            }
            return null;
        }
    }

