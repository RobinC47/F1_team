package F1_team;

public class part {
    private String name;
    private String reference;
    private double price;

    public part(String name, String reference, double price) {
        this.name = name;
        this.reference = reference;
        this.price = price;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

