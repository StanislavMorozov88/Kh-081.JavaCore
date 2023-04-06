package PracticalTask._10.LessonTask;

class Product implements Comparable<Product> {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product \"" + name + "\"";
    }


    @Override
    public int compareTo(Product product) {
        return this.name.compareTo(product.name);
    }
}
