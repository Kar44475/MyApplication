package com.example.myapplication.model;

import java.util.List;

public class product_details_retrofit {
    String order_product_id;
    String product_id;
    String name;
    String model;
    String quantity;
    String price;
    String total;
    String image;
    String  option;
   List <options_retrofit_single> option_arr;

    public product_details_retrofit(String order_product_id, String product_id, String name, String model, String quantity, String price, String total, String image, String option, List<options_retrofit_single> option_arr) {
        this.order_product_id = order_product_id;
        this.product_id = product_id;
        this.name = name;
        this.model = model;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.image = image;
        this.option = option;
        this.option_arr = option_arr;
    }

    public String getOrder_product_id() {
        return order_product_id;
    }

    public void setOrder_product_id(String order_product_id) {
        this.order_product_id = order_product_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public List<options_retrofit_single> getOption_arr() {
        return option_arr;
    }

    public void setOption_arr(List<options_retrofit_single> option_arr) {
        this.option_arr = option_arr;
    }
}