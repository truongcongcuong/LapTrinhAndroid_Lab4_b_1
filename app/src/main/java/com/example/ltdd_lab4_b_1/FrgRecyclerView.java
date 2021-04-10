package com.example.ltdd_lab4_b_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FrgRecyclerView#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FrgRecyclerView extends Fragment {
    private RecyclerView rclProduct;
    private ProductsAdapter productsAdapter;
    private ArrayList<Product> products = new ArrayList<Product>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FrgRecyclerView() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FrgRecyclerView.
     */
    // TODO: Rename and change types and number of parameters
    public static FrgRecyclerView newInstance() {
        FrgRecyclerView fragment = new FrgRecyclerView();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        Product product = new Product("1","Ca nấu lẩu, nấu mì mini","Devang",R.drawable.ca_nau_lau);
        products.add(product);
        products.add(new Product("2","Đồ chơi dạng mô hình","World Toy",R.drawable.do_choi_dang_mo_hinh));
        products.add(new Product("3","1KG GÀ BƠ TỎI","Food Mall",R.drawable.ga_bo_toi));
        products.add(new Product("4","Sách Hiểu Lòng Trẻ Con","C Book",R.drawable.hieu_long_con_tre));products.add(new Product("2","Đồ chơi dạng mô hình","World Toy",R.drawable.do_choi_dang_mo_hinh));
        products.add(new Product("3","1KG GÀ BƠ TỎI","Food Mall",R.drawable.ga_bo_toi));
        products.add(new Product("4","Sách Hiểu Lòng Trẻ Con","C Book",R.drawable.hieu_long_con_tre));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_frg_recycler_view, container, false);
        rclProduct = view.findViewById(R.id.rcvRecycler);

        productsAdapter = new ProductsAdapter(view.getContext(),products);

        rclProduct.setAdapter(productsAdapter);

        rclProduct.setLayoutManager(new LinearLayoutManager(view.getContext()));
        return view;
    }
}