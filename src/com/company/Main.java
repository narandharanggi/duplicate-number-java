package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int a[];
        int tmp;
        int ukuran;
        List<Integer> addNumber = new ArrayList<Integer>();
        int jumlahOut=0;

        Scanner input = new Scanner(System.in);
        System.out.println("size of array");
        ukuran = input.nextInt();

        a = new int[ukuran];

        for (int i=0; i<a.length; i++){
            System.out.println("input element");
            a[i] = input.nextInt();
        }

        System.out.println("list of elements");
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

        for(int i=0; i<a.length; i++){
            for (int j=0; j<(a.length-1); j++){
                if (a[j]>a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }

        for (int i=0; i<a.length; i++){
            for (int j=i+1; j<a.length;j++){
                if(a[i] == a[j]){
                    jumlahOut++;
                }
            }

            if (jumlahOut>=3){
                addNumber.add(a[i]);
                jumlahOut=0;
            }
        }

        for(int i=0; i<addNumber.size();i++){
                    for (int j=i+1; j<addNumber.size();j++){
                        if(addNumber.get(i) == addNumber.get(j)){
                            addNumber.remove(j);
                        }
                    }

            System.out.println("This is duplicate number");
            System.out.println(addNumber.get(i));

            }
        }

    }

