package com.company.model;

public class Employee {

        /**
         * Employee : the Pojo which defines the prroperties and behaviour of thhe employee
         */

        private String name;
        private int salary;
        private int uniqueIdentifier;
        private int age;

        public int getAge() {
            return age;
        }

        public Employee(String name, int salary, int uniqueIdentifier, int age) {
            this.name = name;
            this.salary = salary;
            this.uniqueIdentifier = uniqueIdentifier;
            this.age=age;
        }

        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }

        public int getUniqueIdentifier() {
            return uniqueIdentifier;
        }
        public void displayInformation(){
            System.out.println(this.name+"  "+this.age+"  "+this.uniqueIdentifier+"  "+this.salary);
        }

        public void update(String name,int salary,int age)
        {
            this.name=name;
            this.salary=salary;
            this.age=age;
        }
    }

