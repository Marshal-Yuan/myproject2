package com.marshal;

public class ScoringNG {
    public static void main(String[] args){

        int[] englishs = {75, 80 , 88, 45, 78};
        int[] maths = {80, 90, 100, 66 , 77};
        String[] name = {"Jack", "Hank", "Jane", "Elva", "Steve"};
        for(int i = 0; i<5; i++){
            System.out.println(name[i] +  "\t" + englishs[i] + "\t" + maths[i]);
        }
    }
}
