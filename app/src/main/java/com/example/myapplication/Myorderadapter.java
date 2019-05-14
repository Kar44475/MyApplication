package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.myapplication.model.fullorderdetails_model;

import java.util.List;

public class Myorderadapter extends RecyclerView.Adapter<Myorderadapter.ViewHolder>
{
    Context context;
    List<fullorderdetails_model> fullorder;

    public Myorderadapter(Context context, List<fullorderdetails_model> fullorder)
    {
        this.context = context;
        this.fullorder = fullorder;
    }

    @NonNull
    @Override
    public Myorderadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View view;

        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.myorderlistdata_new, viewGroup, false);
        return new Myorderadapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i)
    {
       viewHolder.status_txt.setText("Status: "+fullorder.get(i).getStatus());
       viewHolder.rupees_total_txt.setText("Rs :"+fullorder.get(i).getTotal().substring(0, fullorder.get(i).getTotal().length() - 2));
       viewHolder.data_txt.setText(fullorder.get(i).getDate_added());
       viewHolder.qty_txt.setText("Quantity :"+fullorder.get(i).getNo_of_product());
       viewHolder.order_id.setText("Order Id: "+fullorder.get(i).getOrder_id());

        viewHolder.orderstatus_ln.setOnClickListener(new View.OnClickListener()
        {
            String s= fullorder.get(i).getOrder_id();
            @Override
            public void onClick(View v)
            {
//                Intent i = new Intent(context, Orderstatus.class);
//                i.putExtra("order_id",s);
//                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                context.startActivity(i);
            }
        });
      // viewHolder.payment_method_txt.setText(fullorder.get(i).);
    }



    @Override
    public int getItemCount() {
        return fullorder.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        LinearLayout orderstatus_ln;

        TextView data_txt,rupees_total_txt,payment_method_txt,qty_txt,units_txt,order_id,status_txt,courier_name_txt;
        // CircleImageView image;
        //  TextView name;

        public ViewHolder(View itemView)
        {
            super(itemView);

            //   image = itemView.findViewById(R.id.image_view);
            //  name = itemView.findViewById(R.id.name);

            orderstatus_ln=itemView.findViewById(R.id.orderstatus_ln);
            data_txt=itemView.findViewById(R.id.data_txt);
            rupees_total_txt=itemView.findViewById(R.id.total_txt);
         //   payment_method_txt=itemView.findViewById(R.id.payment_method_txt);
            qty_txt=itemView.findViewById(R.id.qty_txt);
       //     units_txt=itemView.findViewById(R.id.units_txt);
            order_id=itemView.findViewById(R.id.order_id);
            status_txt=itemView.findViewById(R.id.status_txt);
         //   courier_name_txt=itemView.findViewById(R.id.courier_name_txt);


        }
    }
}
