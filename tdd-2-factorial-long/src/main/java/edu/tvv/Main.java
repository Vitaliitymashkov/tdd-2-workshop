package edu.tvv;

import edu.tvv.service.Service;

public class Main {
    public static void main(String[] args) {
        int number = 21;
        System.out.println(new Service().factorialLong(number));
    }
}