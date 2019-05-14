package com.example.myapplication.model;

public class options_retrofit_single
{

          String order_option_id;
          String order_id;
          String order_product_id;
          String product_option_id;
          String product_option_value_id;
          String name;
          String value;
          String type;

    public options_retrofit_single(String order_option_id, String order_id, String order_product_id, String product_option_id, String product_option_value_id, String name, String value, String type) {
        this.order_option_id = order_option_id;
        this.order_id = order_id;
        this.order_product_id = order_product_id;
        this.product_option_id = product_option_id;
        this.product_option_value_id = product_option_value_id;
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public String getOrder_option_id()
    {
        return order_option_id;
    }

    public void setOrder_option_id(String order_option_id)
    {
        this.order_option_id = order_option_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id)
    {
        this.order_id = order_id;
    }

    public String getOrder_product_id()
    {
        return order_product_id;
    }

    public void setOrder_product_id(String order_product_id)
    {
        this.order_product_id = order_product_id;
    }

    public String getProduct_option_id()
    {
        return product_option_id;
    }

    public void setProduct_option_id(String product_option_id)
    {
        this.product_option_id = product_option_id;
    }

    public String getProduct_option_value_id() {
        return product_option_value_id;
    }

    public void setProduct_option_value_id(String product_option_value_id)
    {
        this.product_option_value_id = product_option_value_id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}
