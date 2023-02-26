package pract03;

public class MainProduct {
    public static void main(String[] args) {

        Products p1 = new Products("Computer", 65000, 10);
        Products p2 = new Products("Furniture", 250, 23);
        Products p3 = new Products("Table", 15000, 6);
        Products p4 = new Products("Chair", 3000, 25);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        //розв'язала це завдання не повністю, як треба було. Порівнюю Price першого продукта з кожним наступним,
        // якщо всі true - тоді виводжу дані про нього
        System.out.println(p1.mostExpensive(p2));
        System.out.println(p1.mostExpensive(p3));
        System.out.println(p1.mostExpensive(p4));

        if ((p1.mostExpensive(p2)) && (p1.mostExpensive(p3)) && (p1.mostExpensive(p4))) {
            System.out.println(p1);
        }

        //Порівнюю Йгфтешен першого продукта з кожним наступни
        // і виводжу значення, яке отримую при порівнянні (true/false)
        System.out.println(p1.mostPopular(p2));
        System.out.println(p1.mostPopular(p3));
        System.out.println(p1.mostPopular(p4));

    }
}
