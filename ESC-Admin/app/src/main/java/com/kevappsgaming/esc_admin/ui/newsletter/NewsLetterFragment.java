package com.kevappsgaming.esc_admin.ui.newsletter;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kevappsgaming.esc_admin.R;

public class NewsLetterFragment extends Fragment {

    private NewsLetterViewModel mViewModel;

    public static NewsLetterFragment newInstance() {
        return new NewsLetterFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_newsletter, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(NewsLetterViewModel.class);
        // TODO: Use the ViewModel
    }

}
