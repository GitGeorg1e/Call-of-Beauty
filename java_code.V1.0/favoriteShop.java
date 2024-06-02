public class favoriteShop {
    private String shopName;
    private String shopAddress;

    public favoriteShop(String shopName, String shopAddress) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    @Override
    public String toString() {
        return shopName + " - " + shopAddress;
    }
}
