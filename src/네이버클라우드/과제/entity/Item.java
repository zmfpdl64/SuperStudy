package 네이버클라우드.과제.entity;

public class Item {
    private String itemName;
    private long price;
    private long stockQuantity;

    private String advantage;

    public Item(String itemName, long price, long stockQuantity, String advantage) {
        this.itemName = itemName;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.advantage = advantage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(long stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }
}
