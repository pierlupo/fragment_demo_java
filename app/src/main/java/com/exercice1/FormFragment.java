package com.exercice1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;
import com.exercice1.databinding.FragmentFormBinding;
import com.exercice1.service.ContactService;
import org.jetbrains.annotations.NotNull;

public class FormFragment extends Fragment {

    private FragmentFormBinding binding;
    private Button btn1;

    public FormFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFormBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        binding.btn.setOnClickListener((v) -> {
            ContactService.getInstance().addContact(binding.prnm.getText().toString(), binding.nm.getText().toString(), binding.phon.getText().toString());
            NavDirections action = FormFragmentDirections.actionFormFragmentToContactsFragment();
            NavHostFragment.findNavController(FormFragment.this).navigate(action);

        });
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               onBackPressed();
//            }
//        });

    }


}
