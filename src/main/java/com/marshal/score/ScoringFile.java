package com.marshal.score;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("score.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null){
                String[] token = line.split(",");
                String name = token[0];
                int english = Integer.parseInt(token[1]);
                int math = Integer.parseInt(token[2]);
                Student stu = new Student(name, english, math);
                stu.print();
                line = reader.readLine();
            }
//            int data = fileReader.read();
//            while(data != -1){
//                System.out.print((char)data);
//                data = fileReader.read();

        }catch(FileNotFoundException e){
            System.out.println("檔案讀取錯誤");
        }catch(IOException e){
            System.out.println("資料讀取錯誤");
        }
        System.out.println("Continuing");
    }
}
