package com.exercice1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DiffUtil;
import org.jetbrains.annotations.NotNull;

public class ContactAdapter {

    private Fragment fragment;
//    public ContactAdapter(@NonNull @NotNull DiffUtil.ItemCallback<String> diffCallback, Fragment fragment) {
//        super(diffCallback);
//        this.fragment = fragment;
//    }

//    @NonNull
//    @NotNull
//    @Override
//    public ContactListViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
//        return ContactListViewHolder.create(parent, fragment);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull @NotNull ContactListViewHolder holder, int position) {
//        String contact = getItem(position);
//        holder.display(contact);
//    }

    public static class ContactDiff extends DiffUtil.ItemCallback<String> {

        @Override
        public boolean areItemsTheSame(@NonNull @NotNull String oldItem, @NonNull @NotNull String newItem) {
            return oldItem.equals(newItem);
        }

        @Override
        public boolean areContentsTheSame(@NonNull @NotNull String oldItem, @NonNull @NotNull String newItem) {
            return oldItem.equals(newItem);
        }
    }
}
