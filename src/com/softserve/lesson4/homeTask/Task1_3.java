package com.softserve.lesson4.homeTask;

import java.util.Scanner;

public class Task1_3 {

    private enum HTTPError {
        BAD_REQUEST("BadRequest", 400),
        UNAUTHORIZED("Unauthorized", 401),
        PAYMENT_REQUIRED("Payment required", 402),
        FORBIDDEN("Forbidden", 403);

        private final int CODE;
        private final String NAME;


        HTTPError(String name, int code) {
            NAME = name;
            CODE = code;
        }

        @Override
        public String toString() {
            return "HTTPError {NAME = " + NAME + "}";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of error(400 - 403): ");
        int number = sc.nextInt();
        for(HTTPError code: HTTPError.values()){
            if (code.CODE == number) {
                System.out.println(code);
            }
        }

    }

}
