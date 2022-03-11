package com.marshal;

public class Student {
    String name;
    int english;
    int math;

    public Student(String name){ //Constructor
        this.name=name;
    }
    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public Student() { //Default Constructor

    }
    public void print(){
        int average = (english+math)/2;
        System.out.print(name + "\t" + english +
                "\t" +math + "\t" + average);
        if(average < 60){
            System.out.print("*");
        }
        System.out.println();

        }
    }
