package com.example.casestudy4_springboot.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "bill_detail")
public class Bill_detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "bill_product", joinColumns = @JoinColumn(name = "bill_detail_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Product> productSet;

    private int quantity;

    private double totalMoney;

    @ManyToOne
    @JoinColumn(name = "detail_bill_id")
    private Bill bill;

}
