package com.example.tabshoplist.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tabshoplist.Item;
import com.example.tabshoplist.ItemListAdapter;
import com.example.tabshoplist.R;
import com.example.tabshoplist.Storage;


public class FragmentA extends Fragment {

    private Context context;
    private Storage storage;
    private RecyclerView recyclerView;

    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        storage = Storage.getInstance();
        recyclerView = view.findViewById(R.id.rvItemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        ItemListAdapter itemListAdapter = new ItemListAdapter(getActivity().getApplicationContext(), storage.getItems());
        recyclerView.setAdapter(itemListAdapter);
        itemListAdapter.notifyDataSetChanged();
    }
}