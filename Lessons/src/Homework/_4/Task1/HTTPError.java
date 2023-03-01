package Homework._4.Task1;


public enum HTTPError{
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

    HTTPError(int err, String name) {
        this.err=err;
        this.name=name;
    }

    public static HTTPError getError(int err) throws Exception{
        switch (err){
            case 400 ->{
                return BadRequest;
            }case 401 ->{
                return Unauthorized;
            }case 402 ->{
                return PaymentRequest;
            }case 403 ->{
                return Forbidden;
            }case 404 ->{
                return NotFound;
            }case 405 ->{
                return MethodNotAllowed;
            }case 406 ->{
                return NotAcceptable;
            }case 407 ->{
                return ProxyAuthenticationRequired;
            }default ->{
                System.err.println("Use HTTP errors from 400 to 407");
                throw new Exception("Use HTTP errors from 400 to 407");
            }
        }
    }


    public int getErr() {
        return err;
    }
    public String getName() {
        return name;
    }


}