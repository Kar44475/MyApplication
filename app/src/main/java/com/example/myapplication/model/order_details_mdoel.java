package com.example.myapplication.model;

public class order_details_mdoel
{
                 String customer_id;
                 String order_id;
                 String date_added;
                 String total;
                 String payment_method;
                 String shipping_method;
                 String payment_address_1;
                 String shipping_address_1;

    public order_details_mdoel(String customer_id, String order_id, String date_added, String total, String payment_method, String shipping_method, String payment_address_1, String shipping_address_1) {
        this.customer_id = customer_id;
        this.order_id = order_id;
        this.date_added = date_added;
        this.total = total;
        this.payment_method = payment_method;
        this.shipping_method = shipping_method;
        this.payment_address_1 = payment_address_1;
        this.shipping_address_1 = shipping_address_1;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getShipping_method() {
        return shipping_method;
    }

    public void setShipping_method(String shipping_method) {
        this.shipping_method = shipping_method;
    }

    public String getPayment_address_1() {
        return payment_address_1;
    }

    public void setPayment_address_1(String payment_address_1) {
        this.payment_address_1 = payment_address_1;
    }

    public String getShipping_address_1() {
        return shipping_address_1;
    }

    public void setShipping_address_1(String shipping_address_1) {
        this.shipping_address_1 = shipping_address_1;
    }
}
