package com.company;

public class Main {

    public static void main(String[] args) {
	int[] a = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};
    int n = 5;
    int f =-1;
    for(int i=0; i<a.length; i++){
        if(a[i]==n){
            f=i;
        }
    }
    System.out.println(f);
    }
}
