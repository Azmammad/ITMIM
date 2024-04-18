package Task7_Product;

public class Product {
    private String name;
    private int count;
    private double price;



    private double salary;

    public Product(String name,int count,double price){
        this.name = name;
        this.count = count;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
