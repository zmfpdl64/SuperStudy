package 네이버클라우드.과제.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DeliveryDriver {
    private String driverName;
    private long revenue;
    private long deliveryPrice;

    public DeliveryDriver(String driverName, long revenue, long deliveryPrice, long deliveryTime) {
        this.driverName = driverName;
        this.revenue = revenue;
        this.deliveryPrice = deliveryPrice;
        this.deliveryTime = deliveryTime;
    }

    private long deliveryTime = 3L;

    public long getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(long deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public long getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(long deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public String arriveDeliveryTime(Guest guest) {
        LocalDateTime arriveTime = LocalDateTime.now().plusDays(this.deliveryTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        return formatter.format(arriveTime);
    }


}
