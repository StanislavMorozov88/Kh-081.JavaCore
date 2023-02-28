package edu04.practical;

public class task4 {
    public static void main(String[] args) {
        int price1 = Product.Cap.getPrice();
        int price2 = Product.tShirt.getPrice();
        int price3 = Product.Jeans.getPrice();
        int price4 = Product.Sneakers.getPrice();

        System.out.println("The name and quantity of the most expensive item:");

        if(price1 > price2 & price1 > price3 & price1 > price4){
            System.out.println(Product.Cap.getName() + " " + Product.Cap.getQuantity());
        } else if(price2 > price1 & price2 > price3 & price2 > price4){
            System.out.println(Product.tShirt.getName() + " " + Product.tShirt.getQuantity());
        } else if(price3 > price1 & price3 > price2 & price3 > price4){
            System.out.println(Product.Jeans.getName() + " " + Product.Jeans.getQuantity());
        } else if (price4 > price1 & price4 > price2 & price4 > price3){
            System.out.println(Product.Sneakers.getName() + " " + Product.Sneakers.getQuantity());
        }

        int quantity1 = Product.Cap.getQuantity();
        int quantity2 = Product.tShirt.getQuantity();
        int quantity3 = Product.Jeans.getQuantity();
        int quantity4 = Product.Sneakers.getQuantity();

        System.out.println();
        System.out.println("The name of the items, which has the biggest quantity:");
        if(quantity1 > quantity2 & quantity1 > quantity3 & quantity1 > quantity4){
            System.out.println(Product.Cap.getName());
        } else if(quantity2 > quantity1 & quantity2 > quantity3 & quantity2 > quantity4){
            System.out.println(Product.tShirt.getName());
        } else if(quantity3 > quantity1 & quantity3 > quantity2 & quantity3 > quantity4){
            System.out.println(Product.Jeans.getName());
        } else if (quantity4 > quantity1 & quantity4 > quantity2 & quantity4 > quantity3){
            System.out.println(Product.Sneakers.getName());
        }
    }
}
