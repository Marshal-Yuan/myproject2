package com.marshal.score;


public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack", 25, 80);
        Student marshal = new Student("marshal", 60, 70);
        GraduateStudent jane =
                new GraduateStudent("Jane", 60, 70, 85);
        jack.print();
        marshal.print();
        jane.print();
    }
}

