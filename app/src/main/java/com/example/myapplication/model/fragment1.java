package com.example.myapplication.model;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
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
import android.widget.ListView;
import android.widget.TextView;


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



}

