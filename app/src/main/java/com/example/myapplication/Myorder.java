package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.myapplication.model.Order_histroy_retrofit;
import com.example.myapplication.model.Orderdetails_model;
import com.example.myapplication.model.fullorderdetails_model;
import com.google.gson.Gson;
import com.kaopiz.kprogresshud.KProgressHUD;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class Myorder extends AppCompatActivity
{
    TextView empty_order;

    ImageView img_back;
    Myorderadapter adapter;
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    int  totalItemCount;
    KProgressHUD hud;
    String customer_id;
    Boolean b=true;
    int Index=0;
    Orderdetails_model order_details;
   List<fullorderdetails_model> fullorder;
    String were="0";
    int nextitemcount=20;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myorderlist);
        recyclerView=findViewById(R.id.recyclerView);
       // img_back=findViewById(R.id.img_back);
        empty_order=findViewById(R.id.empty_order);
        //hud=loading(Myorder.this);

        try
        {
            were=getIntent().getStringExtra("myself");
            were.equals("25");
        }
        catch (Exception E)
        {
            were="0";
        }
      //  SharedPreferences prefs = getSharedPreferences(SHARED_PREFERENCE, MODE_PRIVATE);
        customer_id = "12";//"No name defined" is the default value.
//        img_back.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                onBackPressed();
//            }
//        });
        layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        loadMoreItems();
        new MyAsyncTask().execute();
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener()
        {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState)
            {
                super.onScrollStateChanged(recyclerView, newState);
                if (!recyclerView.canScrollVertically(1))
                {
                    // Toast.makeText(getApplicationContext(), "Last", Toast.LENGTH_LONG).show();
                    totalItemCount = layoutManager.getItemCount();
                   if(totalItemCount==nextitemcount)
                   {
                       loadMoreItems();
                       nextitemcount=nextitemcount+20;
                    //   Index++;
                   }
                }
            }
        });
    }
    public void loadMoreItems()


        // if (Integer.parseInt(total_count)>totalItemCount)
        {
            Log.e("Load more ", "loading more data" + "occurede");
          //  categoires();
        }




    public class MyAsyncTask extends AsyncTask
    {


        @Override
        protected Object doInBackground(Object[] objects)
        {
            Index++;
            categoires();

            return null;
        }

        @Override
        protected void onPostExecute(Object o)
        {
            super.onPostExecute(o);

if(b=true)
{
    new MyAsyncTask().execute();
}

        }
    }


public void categoires()
{
    try
    {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<Order_histroy_retrofit> call = apiService.get_order(customer_id, Index);
        call.enqueue(new Callback<Order_histroy_retrofit>()
        {
            @Override
            public void onResponse(Call<Order_histroy_retrofit> call, Response<Order_histroy_retrofit> response)
            { try
                {

                }
                catch (Exception e)
                {
                }
                if ((response.body().getStatus()=="false"))
                    b=false;
                if (response.body().getStatus().equals("true"))
                {
                    Log.e("My Order", "My Order" + new Gson().toJson(response.body()));
                    order_details = response.body().getData();

                    if(order_details.getOrder_details().isEmpty())
                    {
                        empty_order.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        empty_order.setVisibility(View.GONE);
                    }

                    if (Index == 1)
                    {    fullorder = order_details.getOrder_details();

                        adapter = new Myorderadapter(getApplicationContext(),fullorder);
                        recyclerView.setAdapter(adapter);
                    }
                    else
                     {
                        if(!fullorder.containsAll(order_details.getOrder_details()))
                         fullorder.addAll(order_details.getOrder_details());
                         adapter.notifyDataSetChanged();
                        }

                }
                else {
                    Toast.makeText(getApplicationContext(),"No more order available",Toast.LENGTH_LONG).show();
                }

            }
            @Override
            public void onFailure(Call<Order_histroy_retrofit> call, Throwable t)
            {
              Log.e("My order","My Order"+t.getMessage());
                try
                {
                    hud.dismiss();
                }
                catch (Exception e)
                {

                }
            }
        });

    }
    catch (Exception e)
    {
        Log.e("My order","My Order"+e.getMessage());
        try{
            hud.dismiss();
        }catch (Exception ee)
        {

        }
    }
}
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        if(were.equals("25"))
        {
        }
        else
            {
            finish();
            }
    }
}
