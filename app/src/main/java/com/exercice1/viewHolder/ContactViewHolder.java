package com.exercice1.viewHolder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.exercice1.ContactsFragmentDirections;
import com.exercice1.R;
import com.exercice1.model.Contact;
import org.jetbrains.annotations.NotNull;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private Fragment fragment;
    private TextView firstNameTextView, lastnameTextView, phonTextView;
    private Button detailButton;
    private View view;
    public ContactViewHolder(@NonNull @NotNull View itemView, Fragment fragment) {
        this(itemView);
        this.view = itemView;
        this.fragment = fragment;
        firstNameTextView = itemView.findViewById(R.id.firstname_textview_all);
        lastnameTextView = itemView.findViewById(R.id.lastname_textview_all);
        detailButton = itemView.findViewById(R.id.detail_button);
    }

    public ContactViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);
    }

    public void display(Contact contact, int position) {
        firstNameTextView.setText(contact.getPrnm());
        lastnameTextView.setText(contact.getNm());
        detailButton.setOnClickListener((v)-> {
          NavDirections action = ContactsFragmentDirections.actionContactsFragmentToFirstFragment(position);
          NavHostFragment.findNavController(fragment).navigate(action);
        });
    }

    public static ContactViewHolder create(ViewGroup parent, Fragment fragment) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item, parent, false);
        return new ContactViewHolder(view, fragment);
    }
}

