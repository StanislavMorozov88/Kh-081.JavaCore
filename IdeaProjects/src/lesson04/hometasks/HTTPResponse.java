package lesson04.hometasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HTTPResponse {
    private static final Scanner SC = new Scanner(System.in);

    private enum HTTPError {
        BAD_REQUEST("Bad request", 400),
        UNAUTHORIZED("Unauthorized", 401),
        PAYMENT_REQUIRED("Payment required", 402),
        FORBIDDEN("Forbidden", 403),
        NOT_FOUND("Not found", 404);

        private final String HTTTP_ERRORS;
        private final int STATUS_CODE;

        private HTTPError(String error, int status) {
            HTTTP_ERRORS = error;
            STATUS_CODE = status;
        }

        public String toString() {
            return "HTTP Error: " + HTTTP_ERRORS;
        }
    }

    public static void printErrorInfo() {
        boolean isValid = true;
        while (isValid) {
            isValid = false;
            System.out.println("enter a number between 400 and 404 inclusive:");
            int number = readNumber();
            for (HTTPError error : HTTPError.values()) {
                if (error.STATUS_CODE == number) {
                    System.out.println(error + "\n");
                    isValid = true;
                }
            }
        }
        if (!isValid) {
            System.out.println("Goodbye!");
        }
    }

    private static int readNumber() {
        while (true) {
            try {
                return SC.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("It's not a number");
                SC.nextLine();
            }
        }
    }
}
