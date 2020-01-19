package ro.siit;

public class Customer {
    private String name;
    private int age;
    private double balance;
    public static final String AGE_RESTRICTION_NONE="none";
    public static final String AGE_RESTRICTION_TEENAGER="teenager";
    public static final String AGE_RESTRICTION_ADULT="adult";

    public Customer(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }
}
