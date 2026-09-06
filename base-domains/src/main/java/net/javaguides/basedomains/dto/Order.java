package net.javaguides.basedomains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 全參數建構子
@NoArgsConstructor  // 無參數建構子
public class Order {
    private String orderId;
    private String name;
    private int qty;
    private double price;
}
