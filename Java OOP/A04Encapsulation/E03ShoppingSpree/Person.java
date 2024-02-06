package A04Encapsulation.E03ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        Validator.isValidateName(name);
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    private void setMoney(double money) {
        Validator.isValidateMoney(money);
        this.money = money;
    }

    public void buyProduct(Product product) {
        if (!hasEnoughMoney(product)) {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
        }
        this.money -= product.getCost();
        this.products.add(product);
    }

    private boolean hasEnoughMoney(Product product) {
        return this.money >= product.getCost();
    }
}
