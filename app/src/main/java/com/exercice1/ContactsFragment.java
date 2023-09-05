package com.exercice1;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.exercice1.databinding.FragmentContactsBinding;
import com.exercice1.service.ContactService;
import org.jetbrains.annotations.NotNull;

public class ContactsFragment extends Fragment {

    private FragmentContactsBinding binding;

    private ContactAdapter adapter;
    public ContactsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContactsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new ContactAdapter(new ContactAdapter.ContactDiff(), this);
        binding.contactRecyclerview.setAdapter(adapter);
        binding.contactRecyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.submitList(ContactService.getInstance().getContacts());
    }
}