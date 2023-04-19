package com.example.tabshoplist;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    TextView itemName, itemNotes;
    CheckBox checkBox;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        itemName = itemView.findViewById(R.id.txtItem);
        itemNotes = itemView.findViewById(R.id.txtItemNotes);
    }
    public TextView getItemName(){
        return itemName;
    }
    public TextView getItemNotes(){
        return itemNotes;
    }
}
