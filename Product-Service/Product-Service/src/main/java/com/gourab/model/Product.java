package com.gourab.model;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "product_table")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_quantity")
    private Integer productQuantity;

    @Column(name = "product_price")
    private float productPrice;

    @Column(name = "product_manufactured_date")
    private Date productManufacturedDate;

    @Column(name = "product_expiry_date")
    private Date productExpiryDate;

    @Column(name = "product_batch_no")
    private String productBatchNo;

}
