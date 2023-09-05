package com.exercice1;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.exercice1.model.Contact;
import com.exercice1.viewHolder.ContactViewHolder;
import org.jetbrains.annotations.NotNull;

public class ContactAdapter extends ListAdapter<Contact, ContactViewHolder> {

    private Fragment fragment;

    public ContactAdapter(@NonNull @NotNull DiffUtil.ItemCallback<Contact> diffCallback, Fragment fragment) {
        super(diffCallback);
        this.fragment = fragment;
    }

    @NonNull
    @NotNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return ContactViewHolder.create(parent, fragment);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ContactViewHolder holder, int position) {
        Contact contact = getItem(position);
        holder.display(contact, position);
    }

    public static class ContactDiff extends DiffUtil.ItemCallback<Contact> {



        @Override
        public boolean areItemsTheSame(@NonNull @NotNull Contact oldItem, @NonNull @NotNull Contact newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull @NotNull Contact oldItem, @NonNull @NotNull Contact newItem) {
            return oldItem.getPrnm().equals(newItem.getNm()) && oldItem.getNm().equals(newItem.getNm()) && oldItem.getPhon().equals(newItem.getPhon());
        }
    }
}
