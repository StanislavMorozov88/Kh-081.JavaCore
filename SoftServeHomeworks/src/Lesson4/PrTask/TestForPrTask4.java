package Lesson4.PrTask;

public class TestForPrTask4 {
    public static void main(String[] args) {
        int max = 0;
        int[] maxPriceArray = new int[]{Product.COLA.getPrice(), Product.FANTA.getPrice(), Product.PEPSI.getPrice(), Product.SPRITE.getPrice()};
        int maxPrice = 0;

        for (int i = 0; i <maxPriceArray.length ; i++) {
            if(maxPriceArray[i] >= maxPrice){
                maxPrice = maxPriceArray[i];
            }
        }
        if(Product.COLA.getPrice() == maxPrice){
            System.out.println("The biggest price has " + Product.COLA.getName() + " It costs " + Product.COLA.getPrice() + " UAH");
        }
        if (Product.FANTA.getPrice() == maxPrice) {
            System.out.println("The biggest price has " + Product.FANTA.getName() + " It costs  " + Product.FANTA.getPrice() + " UAH");
        }
        if (Product.PEPSI.getPrice()== maxPrice) {
            System.out.println("The biggest price has " + Product.PEPSI.getName() + " It costs " + Product.PEPSI.getPrice() + " UAH");
        }
        if (Product.SPRITE.getPrice()== maxPrice){
            System.out.println("The biggest price has " + Product.SPRITE.getName() + " It costs " + Product.SPRITE.getPrice() + " UAH");
        }







        if(Product.COLA.getQuantity() >= max){
            max = Product.COLA.getQuantity();
        }
         if (Product.FANTA.getQuantity() >= max) {
            max = Product.FANTA.getQuantity();
        }
         if (Product.PEPSI.getQuantity()>= max) {
            max = Product.PEPSI.getQuantity();
        }
         if (Product.SPRITE.getQuantity()>= max){
            max = Product.SPRITE.getQuantity();
        }

        if(Product.COLA.getQuantity() == max){
            System.out.println("The biggest quantity has " + Product.COLA.getName() + " There are " + Product.COLA.getQuantity() + " pieces");
        }
        if (Product.FANTA.getQuantity() == max) {
            System.out.println("The biggest quantity has " + Product.FANTA.getName() + " There are " + Product.FANTA.getQuantity() + " pieces");
        }
        if (Product.PEPSI.getQuantity()== max) {
            System.out.println("The biggest quantity has " + Product.PEPSI.getName() + " There are " + Product.PEPSI.getQuantity() + " pieces");
        }
        if (Product.SPRITE.getQuantity()== max){
            System.out.println("The biggest quantity has " + Product.SPRITE.getName() + " There are " + Product.SPRITE.getQuantity() + " pieces");
        }
    }
}
