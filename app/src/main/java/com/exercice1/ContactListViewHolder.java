package com.exercice1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

public class ContactListViewHolder extends RecyclerView.ViewHolder {
    private Fragment fragment;
    private View view;
    private RecyclerView ContactListRecyclerView;
    public ContactListViewHolder(@NonNull @NotNull View itemView, Fragment fragment) {
        this(itemView);
        this.fragment = fragment;
        this.view = itemView;
        ContactListRecyclerView = itemView.findViewById(R.id.contact_list_item_content);

    }
    public ContactListViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);
    }

//    public void display() {
//        ContactListRecyclerView.();
//    }


    public static ContactListViewHolder create(ViewGroup parent, Fragment fragment) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list, parent, false);
        return new ContactListViewHolder(view, fragment);
    }
}

