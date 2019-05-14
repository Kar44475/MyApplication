package com.example.myapplication.model;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.google.gson.Gson;
import com.kaopiz.kprogresshud.KProgressHUD;


import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class fragment1 extends Fragment
{
//    private KProgressHUD hud,hud2;
//    advadapter adv;
//    TextView oldrs_txt;
//    topcategoriesadapter topcate;
//    latestesproductadapter latest;
//    ViewPager viewPager;
//    Dialog pDialog;
//    WormDotsIndicator dotsIndicator;
//    ListView top_brands_list;
//    RecyclerView recyclerView;
//    TextView topbrand,bestselling_txt;
//    GridView grid_latest,grid_categories,grid_best_seller;
//    dashboard_All_data full,best;
//  //  ProgressDialog pd;
//    List<Image_slider_model> banner;
//    List<Category_model> categories;
//    List<Top_brand_model> brand;
//    List<Product_model> product,product2;
//    private static final String TAG = "MainActivity";
//    public BottomNavigationView navigation;
//    RecyclerViewAdapter adapter1;
//    SwipeRefreshLayout pullToRefresh;
//    //////////////////////// for animation ///////////////////////////////////////
//
//    final int speedScroll = 2000;
//    final Handler handler = new Handler();
//
//    int currentPage = 0;
//    Timer timer;
//    final long DELAY_MS = 500;//delay in milliseconds before task is to be executed
//    final long PERIOD_MS = 3000; // time in milliseconds between successive task executions.
//
//
//
//    ////////////////////////////////////////////////////////////////////////////////////
//    //vars
//    private ArrayList<String> mNames = new ArrayList<>();
//    private ArrayList<String> mImageUrls = new ArrayList<>();
//    public fragment1() {
//        // Required empty public constructor
//    }
//
//    public static fragment1 newInstance(String param1, String param2) {
//        fragment1 fragment = new fragment1();
//        Bundle args = new Bundle();
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
//    {
//        // Inflate the layout for this fragment
//        View view= inflater.inflate(R.layout.fragment_fragemnt1, container, false);
//        dotsIndicator = (WormDotsIndicator) view.findViewById(R.id.dots_indicator);
//        viewPager = view.findViewById(R.id.viewpager);
//        recyclerView = view.findViewById(R.id.recyclerView);
//        grid_latest=view.findViewById(R.id.grid_dashboard);
//        grid_categories=view.findViewById(R.id.grid_Topcategories);
//        bestselling_txt=view.findViewById(R.id.bestselling_txt);
//        grid_best_seller=view.findViewById(R.id.grid_dashboard2);
//
//        pullToRefresh   = view.findViewById(R.id.pullToRefresh);
//        pullToRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh()
//            {
//                FragmentTransaction ft = getFragmentManager().beginTransaction();
//                if (Build.VERSION.SDK_INT >= 26) {
//                    ft.setReorderingAllowed(false);
//                }
//                ft.detach(fragment1.this).attach(fragment1.this).commit();
//                pullToRefresh.setRefreshing(false);
//            }
//        });
//
//     //   grid_best_seller.setVerticalScrollBarEnabled(false);
//       // grid_latest.setVerticalScrollBarEnabled(false);
//
//      // pd = new ProgressDialog(getActivity());
//      //  pDialog = new Dialog(getActivity(), R.style.TransparentProgressDialog);
//      // avi.setIndicator(indicator);
//        grid_best_seller.setVerticalScrollBarEnabled(false);
//        grid_latest.setVerticalScrollBarEnabled(false);
//
//        topbrand=view.findViewById(R.id.top_brand);
//        ////////////////////////////////// to enable activity /////////////////////////////////////////
//        navigation= getActivity().findViewById(R.id.navigation);
//        navigation.getMenu().findItem(R.id.navigation_home).setChecked(true);
//
//        grid_categories.setOnItemClickListener(new AdapterView.OnItemClickListener()
//        {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
//            {
//
//                fragment2 nextFrag= new fragment2();
//                getActivity().getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
//                        .addToBackStack(null)
//                        .commit();
//            }
//        });
//
//      bestselling_txt.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View v)
//          {
//              fragment2 nextFrag= new fragment2();
//              getActivity().getSupportFragmentManager().beginTransaction()
//                      .replace(R.id.frame_container, nextFrag, "findThisFragment")
//                      .addToBackStack(null)
//                      .commit();
//          }
//      });
//
//
//
//
//        if (Neededclass.isOnline(getActivity())) {
//            Dashboarddata();
//            bestsellerload();
//
//        } else
//        {
//           Neededclass.NoInternetDialogNew(getActivity());
//        }
/////////////////////////////////////////////////////////////////////////////
//        return view;
//    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//    }
//
//public  void  Dashboarddata()
//{
//    try{
//
//      hud= loading(getActivity());
//      hud.show();
//       // pd.setMessage("loading");
//       // pd.show();
//        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
//        Call<dashboard_model> call = apiService.dashboard();
//        call.enqueue(new Callback<dashboard_model>()
//        {
//            @Override
//            public void onResponse(Call<dashboard_model> call, Response<dashboard_model> response) {
//                if(response.body().getStatus().equals("true")) {
//                    try {
//                        hud.dismiss();
//
//                    }
//                    catch (Exception e)
//                    {
//
//                    }
//                    //    Toast.makeText(getActivity(), "success", Toast.LENGTH_LONG).show();
//                    Log.e("Test Response", "Dashboard" + new Gson().toJson(response.body()));
//                    // Log.e("2.0 getFeed > Ful",new Gson().toJson(response));
//                    full = response.body().getData();
//                    banner = full.getSlider_arr();
//                    categories = full.getCat_arr();
//                    brand = full.getBrand_arr();
//                    product = full.getProd_arr();
//
/////////////////////////////// loading latest product ////////////////////////
//
//
//                    latest = new latestesproductadapter(getActivity(), product);
//                    grid_latest.setAdapter(latest);
//
//
///////////////////////////////////// loading top brand /////////////////////////
//
//                    Log.d(TAG, "initRecyclerView: init recyclerview");
//                    //   LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
//
//                    recyclerView.setLayoutManager(new CustomLinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
//
//                    // recyclerView.setLayoutManager(layoutManager);
//
//                    adapter1 = new RecyclerViewAdapter(getActivity(), brand);
//                    recyclerView.setAdapter(adapter1);
//
//
//                    try {
//                        final Runnable runnable = new Runnable() {
//                            int count = 0;
//                            boolean flag = true;
//
//                            @Override
//                            public void run() {
//                                if (count < adapter1.getItemCount()) {
//                                    if (count == adapter1.getItemCount() - 1) {
//                                        flag = false;
//                                    } else if (count == 0) {
//                                        flag = true;
//                                    }
//                                    if (flag) count++;
//                                    else count--;
//                                    recyclerView.smoothScrollToPosition(count);
//                                    handler.postDelayed(this, speedScroll);
//                                }
//                            }
//                        };
//
//                        handler.postDelayed(runnable, speedScroll);
//
//
//                    }
//                    catch (Exception e)
//                    {
//
//                    }
//
//
//                    //   Toast.makeText(getActivity(),"name="+banner.get(0).getImage(),Toast.LENGTH_LONG).show();
//
//
//////////////////////////// loading top categories  //////////////////////////
//                    topcate = new topcategoriesadapter(getActivity(), categories);
//                    grid_categories.setAdapter(topcate);
//
//
///////////////////////////////// banner /////////////////////////////////////////
//                    adv = new advadapter(getActivity(), banner);
//                    viewPager.setAdapter(adv);
//
//
//                    try {
//
//
//                        final Handler handler = new Handler();
//                        final Runnable Update = new Runnable() {
//                            public void run() {
//                                if (currentPage == banner.size()) {
//                                    currentPage = 0;
//                                }
//                                viewPager.setCurrentItem(currentPage++, true);
//                            }
//                        };
//                        timer = new Timer();
//                        timer.schedule(new TimerTask() {
//                            @Override
//                            public void run() {
//                                handler.post(Update);
//                            }
//                        }, DELAY_MS, PERIOD_MS);
//                    } catch (Exception e) {
//
//                    }
//
//
//                    dotsIndicator.setViewPager(viewPager);
//
//
//                    //  pd.dismiss();
//                }
//            }
//            @Override
//            public void onFailure(Call<dashboard_model> call, Throwable t) {
//try{
//    hud.dismiss();
//}catch (Exception e)
//{
//
//}
//
//
////                Log.e("message","error"+t.getMessage().toString());
//               t.printStackTrace();
//            }
//        });
//
//    }
//    catch (Exception e)
//    {
//        try{
//            hud.dismiss();
//        }catch (Exception ee)
//        {
//
//        }
//   //     Log.e("Error","Error"+e.getMessage().toString());
//    }
//}
//
//
//
//public void bestsellerload()
//{
//    try {
//        hud2= loading(getActivity());
//        hud2.show();
//        // pd.setMessage("loading");
//        // pd.show();
//        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
//        Call<best_selling_retrofit> call = apiService.getbest();
//        call.enqueue(new Callback<best_selling_retrofit>()
//        {
//            @Override
//            public void onResponse(Call<best_selling_retrofit> call, Response<best_selling_retrofit> response) {
//                try{
//                    hud2.dismiss();
//                }catch (Exception e)
//                {
//
//                }
//                Log.e("Test Response","Best seller   :"+ new Gson().toJson(response.body()));
//                if(response.body().getStatus().equals("true")) {
//                    best = response.body().getData();
//                    product2 = best.getProd_arr();
//                    latest = new latestesproductadapter(getActivity(), product2);
//                    grid_best_seller.setAdapter(latest);
//                }
//            }
//            @Override
//            public void onFailure(Call<best_selling_retrofit> call, Throwable t)
//            {
//
//                try{
//                    hud2.dismiss();
//                }catch (Exception e)
//                {
//
//                }
//            }
//        });
//
//
//    }
//    catch (Exception e)
//    {
//
//        try{
//            hud2.dismiss();
//        }catch (Exception er)
//        {
//
//        }
//
//    }
//}


    //loadFragment(new fragment1());

//    private void loadFragment(Fragment fragment)
//    {
//        // load fragment
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.replace(R.id.frame_container, fragment);
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }




//    public void  load()
//    {
//        preferences = getApplicationContext().getSharedPreferences(SHARED_PREFERENCE, MODE_PRIVATE);
//        final Runnable runnable = new Runnable()
//        {
//            String  count =   preferences.getString(cart_count, "");
//            @Override
//            public void run()
//            {
//                if(!count.equals("0"))
//                {
//                    txt_notif_count.setVisibility(View.VISIBLE);
//                    txt_notif_count.setText(count);
//                }
//                else {
//                    txt_notif_count.setVisibility(View.GONE);
//                }
//            }
//        };
//        handler.postDelayed(runnable,speedScroll);
//    }
//}





//    public class cartviewadapter extends RecyclerView.Adapter<cartviewadapter.ViewHolder> {
//        private Context mContext;
//        private List<Added_item_cart> cart_arr;
//
//
//        public cartviewadapter(Context mContext, List<Added_item_cart> cart_arr) {
//            this.mContext = mContext;
//            this.cart_arr = cart_arr;
//        }
//
//        @NonNull
//        @Override
//        public cartviewadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//            View view;
//            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cartview_data, viewGroup, false);
//            return new cartviewadapter.ViewHolder(view);
//        }
//
//        @Override
//        public void onBindViewHolder(@NonNull final cartviewadapter.ViewHolder viewHolder, final int i)
//        {
//            // Log.e("cart_arr1","cart_arr"+cart_arr.get(i).getOption().get(0).getName());
//            if(cart_arr.get(i).getOption().size()==0)
//            {
//                Glide.with(mContext)
//                        .asBitmap()
//                        .load("http://dentocart.in/image/cache/" + cart_arr.get(i).getProduct_image())
//                        .into(viewHolder.image_img);
//                viewHolder.name.setText(cart_arr.get(i).getProduct_name());
//                viewHolder.price_txt.setText(cart_arr.get(i).getUnit_price().substring(0, cart_arr.get(i).getUnit_price().length() - 2));
//                viewHolder.number_picker.setValue(Integer.parseInt(cart_arr.get(i).getQuantity()));
//            }
//            else
//            {
//                Glide.with(mContext)
//                        .asBitmap()
//                        .load("http://dentocart.in/image/cache/" + cart_arr.get(i).getProduct_image())
//                        .into(viewHolder.image_img);
//                viewHolder.name.setText(cart_arr.get(i).getOption().get(0).getName());
//
//                viewHolder.price_txt.setText(  cart_arr.get(i).getOption().get(0).getPrice().substring(0,cart_arr.get(i).getOption().get(0).getPrice().length() - 2));
//                viewHolder.number_picker.setValue(Integer.parseInt(cart_arr.get(i).getQuantity()));
//            }
////            price=price+(viewHolder.number_picker.getValue())*(Double.parseDouble(viewHolder.price_txt.getText().toString()));
////            qun=qun+Double.parseDouble(cart_arr.get(i).getQuantity());
//
//            Log.e("Total price" ,"Total price "+price+"  "+qun);
//
//            viewHolder.img_delete.setOnClickListener(new View.OnClickListener()
//            {
//                @Override
//                public void onClick(View v)
//                {
//                    Log.e("array size after adding","array size after adding  reduce size" +cart_arr.size());
//                    Log.e("array size after adding","array size after adding pointing reduce sizing.."+i);
//
//                    // meMap.remove(i);
//                    try {
//                        deletecart(cart_arr.get(i).getCart_id(), i);
//                    }
//                    catch (Exception e)
//                    {
//                        Log.e("error","error occured please try again");
//                    }
//
////                    price=0.0;
////                   qun=0.0;
////                    for (int y=0;y<cart_arr.size();y++)
////                    {
////
////
////                        // Log.e("yyyyyy","yyyyyyy"+cart_arr.get(y).getQuantity());
////
////                        //  String m=cart_arr.get(y).getQuantity();
////
////                        //  Log.e("yyyyyy","yyyyyyy"+m);
////
////
////
////                        price=price+(Double.parseDouble(cart_arr.get(y).getUnit_price()))*(Double.parseDouble((cart_arr.get(y).getQuantity())));
////                        qun=qun+ Integer.parseInt (cart_arr.get(y).getQuantity().toString());
////                        Log.e("price qun","price qun"+price+"  "+qun);
////
////                    }
//
//
////                    price=0.0;
////                    qun=0.0;
////                    price=price+(viewHolder.number_picker.getValue())*(Double.parseDouble(viewHolder.price_txt.getText().toString()));
////                    qun=qun+Double.parseDouble(cart_arr.get(i).getQuantity());
//
//                    Log.e("Total price" ,"Total price "+price+"  "+qun);
//
//                }
//            });
//
//            viewHolder.number_picker.setListener(new ScrollableNumberPickerListener() {
//                @Override
//                public void onNumberPicked(int value) {
//                    //   if(viewHolder.number_picker.getValue()!=0)
//                    //   {
//                    updatecart(cart_arr.get(i).getCart_id(), value);
//                    Log.e("array size after adding","array size after adding"+cart_arr.size());
//                    Log.e("array size after adding","array size after adding pointing"+i);
//                    //   }else {
//                    //      viewHolder.number_picker.setValue(1);
//                    //   }
//
////                    meMap.put(i+"",value+"");
////
//////                    price=0.0;
//////                    qun=0.0;
//////                    price=price+(viewHolder.number_picker.getValue())*(Double.parseDouble(viewHolder.price_txt.getText().toString()));
//////                    qun=qun+Double.parseDouble(cart_arr.get(i).getQuantity());
////
////                    Log.e("Total price" ,"Total price "+price+"  "+qun);
//                }
//            });
//
//        }
//
//        @Override
//        public int getItemCount()
//        {
//            return cart_arr.size();
//        }
//
//        public class ViewHolder extends RecyclerView.ViewHolder
//        {
//
//            LinearLayout img_delete;
//            ImageView image_img;
//            TextView name, price_txt;
//            ScrollableNumberPicker number_picker;
//
//            public ViewHolder(View itemView)
//            {
//                super(itemView);
//                image_img = itemView.findViewById(R.id.image_img);
//                img_delete = itemView.findViewById(R.id.img_delete);
//                name = itemView.findViewById(R.id.name_txt);
//                number_picker = itemView.findViewById(R.id.number_picker);
//                price_txt = itemView.findViewById(R.id.price_txt);
//                number_picker.setMinValue(1);
//                number_picker.setOnLongPressUpdateInterval(2300);
//                //   number_picker.setOnLongPressUpdateInterval(5000000);
//            }
//        }
//        public void deletecart(String cart_id, final int i)
//        {
//            try {
//                hud5 = loading(mContext);
//                hud5.show();
//                Log.e("show dialog 5","execute show dialog 5");
//                ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
//                Call<cart_delete> call = apiService.cart_delete(cart_id);
//                call.enqueue(new Callback<cart_delete>() {
//                    @Override
//                    public void onResponse(Call<cart_delete> call, Response<cart_delete> response) {
//                        try{
//                            hud5.dismiss();
//                        }catch (Exception e)
//                        {
//
//                        }
//                        String m = response.body().getMessage();
//                        Toast.makeText(mContext, m, Toast.LENGTH_LONG).show();
//
////                        cart_arr.remove(i);
////                        notifyDataSetChanged();
////                        price=0.0;
////                        List<String> position= new ArrayList<String>(meMap.keySet());
////                        List<String> qunatity= new ArrayList<String>(meMap.values());
////                        for (int z=0;z<position.size();z++)
////                        {
////                         price=price+Double.parseDouble( cart_arr.get(Integer.parseInt(position.get(z))).getUnit_price())*Double.parseDouble(qunatity.get(z));
////                        }
////                        Log.e("price","price"+price);
//
//
//                        if (cart_arr.size() == 0) {
//                            cart_empty_txt.setVisibility(View.VISIBLE);
//                            cart_empty_txt.setText("No more Items");
//
//                        } else {
//                            cart_empty_txt.setVisibility(View.GONE);
//                        }
//                        cart_arr.clear();
//                        Loadcartitem();
//                        loadtotal();
//                    }
//
//                    @Override
//                    public void onFailure(Call<cart_delete> call, Throwable t) {
//                        try{
//                            hud5.dismiss();
//                        }catch (Exception e)
//                        {
//
//                        }
//                    }
//                });
//            } catch (Exception e) {
//                try{
//                    hud5.dismiss();
//                }catch (Exception ee)
//                {
//
//                }
//                Toast.makeText(mContext, "Please Check Your Internet Connection", Toast.LENGTH_LONG).show();
//            }
//
//        }
//
//        public void updatecart(String cart_id, final int i) {
//            try {
//                //         hud6 = loading(mContext);
//                //         hud6.show();
//                Log.e("show dialog 6","execute show dialog 6");
//                ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
//                Call<cart_updates> call = apiService.cart_update(cart_id, i);
//                call.enqueue(new Callback<cart_updates>()
//                {
//                    @Override
//                    public void onResponse(Call<cart_updates> call, Response<cart_updates> response)
//                    {
//                        //            hud6.dismiss();
//                        //       Toast.makeText(mContext, response.body().getMessage(), Toast.LENGTH_LONG).show();
//
//
////                        price=0.0;
////                        List<String> position= new ArrayList<String>(meMap.keySet());
////                        for (int z=0;z<position.size();z++)
////                        {
////                            price=price+Double.parseDouble( cart_arr.get(Integer.parseInt(position.get(z))).getUnit_price());
////                            Log.e("price","price"+price);
////                        }
//
//
//
////                        price=0.0;
////                        qun=0.0;
////                        for (int y=0;y<cart_arr.size();y++)
////                        {
////
////
////                            // Log.e("yyyyyy","yyyyyyy"+cart_arr.get(y).getQuantity());
////
////                            //  String m=cart_arr.get(y).getQuantity();
////                            //  Log.e("yyyyyy","yyyyyyy"+m);
////
////
////
//////                            price=price+(Double.parseDouble(price.))*(Double.parseDouble((cart_arr.get(y).getQuantity())));
//////                            qun=qun+ Integer.parseInt (cart_arr.get(y).getQuantity().toString());
//////                            Log.e("price qun","price qun"+price+"  "+qun);
////
////                        }
//
//                        loadtotal();
//                    }
//
//                    @Override
//                    public void onFailure(Call<cart_updates> call, Throwable t) {
//                        //    hud6.dismiss();
//                    }
//                });
//            } catch (Exception e) {
//                //      hud6.dismiss();
//                Toast.makeText(mContext, "Please Check Your Internet Connection", Toast.LENGTH_LONG).show();
//            }
//
//        }
//    }
//}



}

