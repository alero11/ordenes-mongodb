package org.service.orden.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class OrderRequest {

    private String customerName;
    private String product;
    private int quantity;
    private LocalDateTime orderDate;
}
