package com.greencoder.daggerdiptest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.greencoder.daggerdiptest.model.Music;
import com.greencoder.daggerdiptest.service.IMusicService;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Inject
    IMusicService mIMusicService;

    @Bind(R.id.helloTextView)TextView mHelloTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ((MyApplication) getApplication()).getApplicationComponent().inject(this);

        mIMusicService.storeMusic(new Music(1, "Imagine", "John Lemon", "Dream"));
        mHelloTextView.setText(mHelloTextView.getText()+"\n"+mIMusicService.getMusic(1).toString());
    }
}
