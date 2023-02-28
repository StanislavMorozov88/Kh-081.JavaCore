package edu04.homework;

public enum HTTPError {
    HTTPError400("Bad Request"), HTTPError401("Unauthorized"), HTTPError402("Payment Required"),
    HTTPError403("Forbidden"), HTTPError404("Not Found"), HTTPError405("Method Not Allowed");

    private final String name;

    HTTPError(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
