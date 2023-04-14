package threads15;

public class MainBasket {
    public static void main(String[] args) {
        Basket basket = new Basket();
        new Producer(basket);
        new Consumer(basket);
    }
}
