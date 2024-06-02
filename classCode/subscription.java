public class subscription {
    private String type; // Monthly, 6-Months, Yearly

    public subscription(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Subscription Type: " + type;
    }
}
