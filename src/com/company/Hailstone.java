package com.company;

public class Hailstone {
    public static void main(String[] args){
        int input = 17;
        while(true){
            if(input%2==1){
                input = 3*input+1;
            }else{
                input = input/2;
            }
            System.out.println(input);
            if(input==1){
                break;
            }
        }
    }
}
