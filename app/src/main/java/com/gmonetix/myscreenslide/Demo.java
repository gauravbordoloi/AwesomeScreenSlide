package com.gmonetix.myscreenslide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Demo extends Fragment {

    private View view;

    private ImageView imageView;
    private TextView textView;

    private int imageId;
    private String text;

    public Demo() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_demo, container, false);

        imageView = (ImageView) view.findViewById(R.id.imageView);
        textView = (TextView) view.findViewById(R.id.textView);

        imageView.setImageResource(imageId);
        textView.setText(text);

        return view;
    }

    public void getData(int imageId, String text) {
        this.imageId = imageId;
        this.text = text;
    }

}
