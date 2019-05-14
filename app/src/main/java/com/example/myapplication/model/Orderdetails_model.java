package com.example.myapplication.model;

import java.util.List;

public class Orderdetails_model
{
  List <fullorderdetails_model> order_details;

    public Orderdetails_model(List<fullorderdetails_model> order_details) {
        this.order_details = order_details;
    }

    public List<fullorderdetails_model> getOrder_details() {
        return order_details;
    }

    public void setOrder_details(List<fullorderdetails_model> order_details) {
        this.order_details = order_details;
    }
}
