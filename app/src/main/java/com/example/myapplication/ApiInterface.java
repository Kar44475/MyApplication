package com.example.myapplication;


import com.example.myapplication.model.Order_histroy_retrofit;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface
{


    @GET("order_history_list.php")
    Call<Order_histroy_retrofit>get_order(@Query("customer_id") String customer_id, @Query("index") Integer index);

//    @FormUrlEncoded
//    @POST("reg.php")
//    Call<login_model> signup(@Field("firstname") String firstname,@Field("lastname") String lastname,@Field("custom_field") String custom_field,@Field("email") String email,@Field("telephone") String  telephone,@Field("password") String password);



  //  @Headers("Content-Type: application/json")
  //  @GET("menu.php")
  //  Call<menu_all_retrofit>menu();



//    @POST("cart_multi_add.php")
//    Call<cart_updates>multi_add(@Body JsonObject jsonObject);

}
