package com.kodilla.hibernate3.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
public class Item {
    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;

    public Item(){
    }

    public Item(BigDecimal price, int quantity, BigDecimal value){
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ITEM_ID", unique = true)
    public int getId(){
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "PODUCT_ID")
    public Product getProduct(){
        return product;
    }

    @NotNull
    @Column(name = "PRICE")
    public BigDecimal getPrice(){
        return price;
    }

    @NotNull
    @Column(name = "QUANTITY")
    public int getQuantity(){
        return quantity;
    }

    @NotNull
    @Column(name = "VALUE")
    public BigDecimal getValue(){
        return value;
    }

    @ManyToOne
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice(){
        return invoice;
    }

    private void setInvoice(Invoice invoice){
        this.invoice = invoice;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setProduct(Product product) {
        this.product = product;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }
}
