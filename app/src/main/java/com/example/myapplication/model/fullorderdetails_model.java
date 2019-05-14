package com.example.myapplication.model;

public class fullorderdetails_model
{
    			String customer_id;
    			String order_id;
    			String order_status_id;
    			String date_added;
    			String total;
    			String firstname;
    			String lastname;
    			String no_of_product;
    			String status;

    public fullorderdetails_model(String customer_id, String order_id, String order_status_id, String date_added, String total, String firstname, String lastname, String no_of_product, String status) {
        this.customer_id = customer_id;
        this.order_id = order_id;
        this.order_status_id = order_status_id;
        this.date_added = date_added;
        this.total = total;
        this.firstname = firstname;
        this.lastname = lastname;
        this.no_of_product = no_of_product;
        this.status = status;
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

    public String getOrder_status_id() {
        return order_status_id;
    }

    public void setOrder_status_id(String order_status_id) {
        this.order_status_id = order_status_id;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNo_of_product() {
        return no_of_product;
    }

    public void setNo_of_product(String no_of_product) {
        this.no_of_product = no_of_product;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
