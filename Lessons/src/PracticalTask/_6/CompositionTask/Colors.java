package PracticalTask._6.CompositionTask;

public enum Colors {

    RESET ( "\033[0m", "None"),
    BLACK ( "\033[0;30m", "Black"),
    RED ("\033[0;31m", "Red"),
    GREEN ("\033[0;32m", "Green"),
    YELLOW ("\033[0;33m", "Yellow"),
    BLUE ("\033[0;34m", "Blue"),
    PURPLE ("\033[0;35m", "Purple"),
    CYAN ("\033[0;36m", "Cyan"),
    WHITE ("\033[0;37m", "White");

    final String code;
    final String name;

    Colors(String s, String name) {
        this.code = s;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.code;
    }
}
