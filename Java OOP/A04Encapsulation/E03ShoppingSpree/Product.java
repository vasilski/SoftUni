package A04Encapsulation.E03ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    public String getName() {
        return this.name;
    }
    private void setName(String name) {
        if (Validator.isValidateName(name)){
            this.name = name;
        }
    }

    public double getCost() {
        return this.cost;
    }

    private void setCost(double cost) {
        if (Validator.isValidateMoney(cost)) {
            this.cost = cost;
        }
    }


}
