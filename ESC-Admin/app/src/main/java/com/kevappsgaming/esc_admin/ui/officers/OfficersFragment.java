package com.kevappsgaming.esc_admin.ui.officers;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.kevappsgaming.esc_admin.R;
import com.kevappsgaming.esc_admin.ui.activities.OfficersActivity;

public class OfficersFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_officers, container, false);
        FloatingActionButton add_officers = (FloatingActionButton) root.findViewById(R.id.floating_action_button);

        add_officers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(), "Click", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity().getBaseContext(), OfficersActivity.class);
                getActivity().startActivity(intent);
            }
        });

        return root;
    }
}

