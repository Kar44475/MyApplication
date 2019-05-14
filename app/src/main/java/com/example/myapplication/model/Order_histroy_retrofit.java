package com.example.myapplication.model;

public class Order_histroy_retrofit
{
    String message;
    String status;
    Orderdetails_model data;

    public Order_histroy_retrofit(String message, String status, Orderdetails_model data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Orderdetails_model getData() {
        return data;
    }

    public void setData(Orderdetails_model data) {
        this.data = data;
    }
}
