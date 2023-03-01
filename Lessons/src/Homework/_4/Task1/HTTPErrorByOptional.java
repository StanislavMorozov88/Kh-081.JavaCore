package Homework._4.Task1;

import java.util.Arrays;
import java.util.Optional;

public enum HTTPErrorByOptional {
    BadRequest(400, "Bad request"),
    Unauthorized(401, "Unauthorized"),
    PaymentRequest(402, "Payment request"),
    Forbidden(403, "Forbidden"),
    NotFound(404, "Not found"),
    MethodNotAllowed(405, "Method not allowed"),
    NotAcceptable(406, "Not acceptable"),
    ProxyAuthenticationRequired(407, "Proxy authentication required");

    final int err;
    final String name;

    HTTPErrorByOptional(int err, String name) {
        this.err=err;
        this.name=name;
    }

    public int getErr() {
        return err;
    }
    public String getName() {
        return name;
    }

    public static Optional<HTTPErrorByOptional> get(int err) {
        return Arrays.stream(HTTPErrorByOptional.values())
                .filter(env -> env.err == err)
                .findFirst();
    }
}
