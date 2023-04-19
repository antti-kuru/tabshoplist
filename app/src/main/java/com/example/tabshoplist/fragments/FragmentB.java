package com.example.tabshoplist.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.tabshoplist.Item;
import com.example.tabshoplist.R;
import com.example.tabshoplist.Storage;


public class FragmentB extends Fragment {
    private EditText itemName;
    private EditText itemNotes;
    private CheckBox checkBox;
    private Button button;




    public FragmentB() {
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
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        itemName = view.findViewById(R.id.txtItem);
        itemNotes = view.findViewById(R.id.txtNotes);
        checkBox = view.findViewById(R.id.cbImportant);
        button = view.findViewById(R.id.buttonAdd);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Item item = new Item(itemName.getText().toString(), itemNotes.getText().toString());
                Storage.getInstance().addItem(item);

                if (checkBox.isChecked()){
                    Storage.getInstance().addImportantItem(item);
                }
                itemName.setText("");
                itemNotes.setText("");
                if (Storage.getInstance().getImportantItems().size() != 0) {
                    System.out.println("Tärkeksi merkityt tuotteet");
                    for (Item i : Storage.getInstance().getImportantItems()) {
                        System.out.println(i.getName());
                    }
                }


            }
        });
        // Inflate the layout for this fragment
        return view;
    }




}