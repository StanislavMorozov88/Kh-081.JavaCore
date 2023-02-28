package homework03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HTTPError {

   public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter HTTP error code ");
        String code = br.readLine();

        switch (HTTPErrorCode.valueOf(code)) {
            case E_400:
                System.out.println("Bad Request");
                break;
            case E_401:
                System.out.println("Unauthorized");
                break;
            case E_402:
                System.out.println("Payment Required");
                break;
            case E_403:
                System.out.println("Forbidden");
                break;
            default:
                System.out.println("Server error");
            br.close();
        }


    }
}
