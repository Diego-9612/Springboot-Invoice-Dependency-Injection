package com.diego.springboot.di.factura.springboot_difactura.models;

public class Product {

    private String nameProduct;
    private Integer price;

    public Product() {
    }

    public Product(String nameProduct, Integer price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
