package Lesson4.Homework;

public enum NumOfHttpError {
    INFOERROR(100,101,102),
    SUCCESS(200,201,202),
    REDIRECTION(300,301,302),
    CLIENTERROR(400,401,402);

    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    private NumOfHttpError(int a, int b , int c){
        this.a =a;
        this.b = b;
        this.c = c;
    }
}
