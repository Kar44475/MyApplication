package com.example.myapplication.model;

import java.util.List;

public class order_details_retrofit
{

    order_details_mdoel order_details;
   List <product_details_retrofit> product_details;

    public order_details_retrofit(order_details_mdoel order_details, List<product_details_retrofit> product_details) {
        this.order_details = order_details;
        this.product_details = product_details;
    }

    public order_details_mdoel getOrder_details() {
        return order_details;
    }

    public void setOrder_details(order_details_mdoel order_details) {
        this.order_details = order_details;
    }

    public List<product_details_retrofit> getProduct_details() {
        return product_details;
    }

    public void setProduct_details(List<product_details_retrofit> product_details) {
        this.product_details = product_details;
    }
}
