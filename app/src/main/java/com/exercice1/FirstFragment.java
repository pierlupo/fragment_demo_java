package com.exercice1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.exercice1.databinding.FragmentFirstBinding;
import org.jetbrains.annotations.NotNull;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;

    public FirstFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if(getArguments() != null) {
            FirstFragmentArgs args = FirstFragmentArgs.fromBundle(getArguments());
            binding.prnmTextView.setText(args.getPrnm());
            binding.nmTextView.setText(args.getNm());
            binding.phonTextView.setText(args.getPhon());
        }
    }

}