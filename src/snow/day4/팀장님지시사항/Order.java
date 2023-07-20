package snow.day4.팀장님지시사항;

import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private String orderDate;
    private String status;
    private List<OrderItem> orderItems;

    public Order(int id, Customer customer, String orderDate, String status, List<OrderItem> orderItems) {
        this.id = id;
        this.customer = customer;
        this.orderDate = orderDate;
        this.status = status;
        this.orderItems = orderItems;
    }

    public String getOrderStatus() {
        if (status.equals("PAID")) {
            return "주문 완료";
        } else if (status.equals("SHIPPED")) {
            return "배송 완료";
        } else if (status.equals("DELIVERED")) {
            return "배송 완료";
        } else {
            return "주문 처리 중";
        }
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public Customer getCustomer() {return customer;}
}