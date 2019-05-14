package com.example.myapplication.model;

public class options_retrofit
{
             String product_option_id;
             String product_option_value_id;
             String product_id;
             String option_id;
             String option_value_id;
             String price;
             String name;
             String type;

    public options_retrofit(String product_option_id, String product_option_value_id, String product_id, String option_id, String option_value_id, String price, String name, String type) {
        this.product_option_id = product_option_id;
        this.product_option_value_id = product_option_value_id;
        this.product_id = product_id;
        this.option_id = option_id;
        this.option_value_id = option_value_id;
        this.price = price;
        this.name = name;
        this.type = type;
    }

    public String getProduct_option_id() {
        return product_option_id;
    }

    public void setProduct_option_id(String product_option_id) {
        this.product_option_id = product_option_id;
    }

    public String getProduct_option_value_id() {
        return product_option_value_id;
    }

    public void setProduct_option_value_id(String product_option_value_id) {
        this.product_option_value_id = product_option_value_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getOption_id() {
        return option_id;
    }

    public void setOption_id(String option_id) {
        this.option_id = option_id;
    }

    public String getOption_value_id() {
        return option_value_id;
    }

    public void setOption_value_id(String option_value_id) {
        this.option_value_id = option_value_id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
