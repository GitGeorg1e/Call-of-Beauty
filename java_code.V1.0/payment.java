public class payment {
    private String cardNumber;
    private String cvsCode;
    private String cardHolderName;
    private String expirationDate;

    public payment(String cardNumber, String cvsCode, String cardHolderName, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cvsCode = cvsCode;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCvsCode() {
        return cvsCode;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "Payment [Card Number: " + cardNumber + ", Card Holder: " + cardHolderName + ", Expiration Date: " + expirationDate + "]";
    }
}
