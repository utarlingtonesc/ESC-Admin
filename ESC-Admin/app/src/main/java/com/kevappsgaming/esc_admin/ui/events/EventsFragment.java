package com.kevappsgaming.esc_admin.ui.events;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.kevappsgaming.esc_admin.R;
import com.kevappsgaming.esc_admin.ui.activities.EventsActivity;

public class EventsFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_events, container, false);
        FloatingActionButton create_new_event = (FloatingActionButton) root.findViewById(R.id.floating_action_button);

        create_new_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(), "Click", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity().getBaseContext(), EventsActivity.class);
                getActivity().startActivity(intent);
            }
        });

        return root;
    }
}
