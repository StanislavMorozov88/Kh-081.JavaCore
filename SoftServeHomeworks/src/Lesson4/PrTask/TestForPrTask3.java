package Lesson4.PrTask;

public class TestForPrTask3 {
    public static void main(String[] args) {
        String ctr = "USA";
        if(ctr.equals(Continent.AFRICA.getContry1()) ){
            System.out.println(Continent.AFRICA);
        } else if (ctr.equals(Continent.AFRICA.getContry2())) {
            System.out.println(Continent.AFRICA);
        }else if(ctr.equals(Continent.AFRICA.getContry3())) {
            System.out.println(Continent.AFRICA);
        }else if(ctr.equals(Continent.EUROPE.getContry3())) {
            System.out.println(Continent.EUROPE);
        }else if(ctr.equals(Continent.EUROPE.getContry2())) {
                System.out.println(Continent.EUROPE);
        }else if(ctr.equals(Continent.EUROPE.getContry1())) {
            System.out.println(Continent.EUROPE);
        }else if(ctr.equals(Continent.SOUTH_AMERICA.getContry3())) {
            System.out.println(Continent.SOUTH_AMERICA);
        }else if(ctr.equals(Continent.SOUTH_AMERICA.getContry2())) {
            System.out.println(Continent.SOUTH_AMERICA);
        }else if(ctr.equals(Continent.SOUTH_AMERICA.getContry1())) {
            System.out.println(Continent.SOUTH_AMERICA);
        }else if(ctr.equals(Continent.NORTH_AMERICA.getContry2())) {
            System.out.println(Continent.NORTH_AMERICA);
        }else if(ctr.equals(Continent.NORTH_AMERICA.getContry1())) {
            System.out.println(Continent.NORTH_AMERICA);
        }else if(ctr.equals(Continent.ASIA.getContry3())) {
            System.out.println(Continent.ASIA);
        }else if(ctr.equals(Continent.ASIA.getContry2())) {
            System.out.println(Continent.ASIA);
        }else if(ctr.equals(Continent.ASIA.getContry1())) {
            System.out.println(Continent.ASIA);
        }else if(ctr.equals(Continent.AUSTRALIA.getContry1())) {
            System.out.println(Continent.AUSTRALIA);
        }else System.out.println("We haven't this country");
    }}

