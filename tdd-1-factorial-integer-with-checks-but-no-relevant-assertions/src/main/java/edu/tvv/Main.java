package edu.tvv;

import edu.tvv.service.Service;

public class Main {
    public static void main(String[] args) {
        int number = 12;
        System.out.println(new Service().factorialInteger(number));
    }
}