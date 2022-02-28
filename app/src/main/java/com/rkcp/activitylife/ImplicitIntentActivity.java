package com.rkcp.activitylife;

import android.os.Bundle;

import androidx.annotation.Nullable;

public class ImplicitIntentActivity extends BaseActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);
    }
}
