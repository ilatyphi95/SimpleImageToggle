package com.ilatyphi95.simpleimagetoggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mImgDisplay;
    private Button mBtnToggleImage;
    private Boolean mImageState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImgDisplay = findViewById(R.id.img_display);
        mBtnToggleImage = findViewById(R.id.btn_toggle_image);

        mImageState = true;
        mBtnToggleImage.setText(getString(R.string.hide_image));

        mBtnToggleImage.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();

        switch(viewId) {
            case R.id.btn_toggle_image:
                if(mImageState) {
                    mImgDisplay.setVisibility(View.INVISIBLE);
                    mBtnToggleImage.setText(getString(R.string.show_image));
                    mImageState = false;
                } else {
                    mImgDisplay.setVisibility(View.VISIBLE);
                    mBtnToggleImage.setText(getString(R.string.hide_image));
                    mImageState = true;
                }
        }
    }
}
