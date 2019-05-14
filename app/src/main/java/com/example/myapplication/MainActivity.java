package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



//     if (meMap.size() != 0)
//    {
//        compose = new JsonObject();
//        try {
//            compose.addProperty("customer_id", customer_id);
//            compose.addProperty("session_id", session_id);
//            compose.addProperty("product_id", prod_arr.get(0).getProduct_id());
////
//            JsonArray items = new JsonArray();
//            for (int i = 0; i < meMap.size(); i++) {
//                Log.e("data", option_arr.get(i).getOption_id());
//                // Log.e("type", ar_type.get(i));
//                //   Log.e("name", ar_name.get(i));
//                JsonObject attachment = new JsonObject();
//                List<String> values = new ArrayList<String>(meMap.values());
//                List<String> position = new ArrayList<String>(meMap.keySet());
//                attachment.addProperty("product_option_id", option_arr.get(Integer.parseInt(position.get(i))).getProduct_option_id());
//                attachment.addProperty("product_option_value_id", option_arr.get(Integer.parseInt(position.get(i))).getProduct_option_value_id());
//                attachment.addProperty("quantity", values.get(i));
//                items.add(attachment);
//            }
//            compose.add("attachment", items);
//            Log.e("Compose_Teacher", "json values" + compose.toString());
//        } catch (JsonIOException e)
//        {
//            e.printStackTrace();
//        }
//        //  param.put("", compose);
//        addmultcart();
//    }
//                else
//    {
//        Toast.makeText(getApplicationContext(),"Please select an item",Toast.LENGTH_LONG).show();
//    }
//}
//


//    public void addmultcart  ()
//    {
//        try {
//            hud = loading(productdescription.this);
//            hud.show();
//            ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
//            Call<cart_updates> call = apiService.multi_add(compose);
//            call.enqueue(new Callback<cart_updates>() {
//                @Override
//                public void onResponse(Call<cart_updates> call, Response<cart_updates> response)
//                {
//                    Log.e("Test Response","response"+new Gson().toJson(response.body()));
//                    String message= response.body().getMessage();
//                    try{
//                        hud.dismiss();
//                    }catch (Exception e)
//                    {
//
//                    }
//                    loadingcart();
//                    Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
//                }
//
//                @Override
//                public void onFailure(Call<cart_updates> call, Throwable t)
//                {
//                    Toast.makeText(getApplicationContext(),"Please remove the current option from cart and add again",Toast.LENGTH_LONG).show();
//                    Log.e("test","test"+t.getMessage());
//                    try{
//                        hud.dismiss();
//                    }catch (Exception e)
//                    {
//
//                    }
//                }
//            });
//        }
//        catch (Exception e)
//        {
//            try{
//                hud.dismiss();
//            }catch (Exception ee)
//            {
//
//            }
//            Log.e("test","test"+e.getMessage());
//            Toast.makeText(getApplicationContext(),"Please Check Your Internet Connection",Toast.LENGTH_LONG).show();
//        }
//    }

}
