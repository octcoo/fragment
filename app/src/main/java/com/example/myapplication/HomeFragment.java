package com.example.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    private RecyclerView rvBts;
    private ArrayList<BtsesModel> listBts = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvBts = view.findViewById(R.id.rv_bts);
        rvBts.setHasFixedSize(true);

        listBts.addAll(BtsesData.getBtsList());

        showRecyclerList();
    }


    private void showRecyclerList() {
        rvBts.setLayoutManager(new LinearLayoutManager(getActivity()));
        BtsesAdapter btsesAdapter = new BtsesAdapter(getActivity());
        btsesAdapter.setListBts(listBts);
        rvBts.setAdapter(btsesAdapter);
    }

}

