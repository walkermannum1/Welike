package com.example.user.welike;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by user on 2016/8/3.
 */
public class TitleFragment extends Fragment {

    private ImageButton mButton;
    @SuppressLint("NewApi")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.title_fragment, container, false);
        mButton = (ImageButton)view.findViewById(R.id.id_title_left_btn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "It's a title work!", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
