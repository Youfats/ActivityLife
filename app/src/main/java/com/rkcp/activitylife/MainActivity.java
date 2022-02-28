package com.rkcp.activitylife;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "onNewIntent: ");
    }

    public void jumpToSecondActivity(View view) {
        Intent intent = new Intent(this,TwoActivity.class);
        startActivity(intent);
    }

    public void jumpToSingleTopActivity(View view) {
        Intent intent = new Intent(this,SingleTopActivity.class);
        startActivity(intent);
    }

    public void jumpToSingleTaskActivity(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void jumpToSingleInstanceActivity(View view) {
        Intent intent = new Intent(this,SingleInstanceActivity.class);
        startActivity(intent);
    }
    public void jumpToImplicitIntentActivity(View view) {
        Intent intent = new Intent();
        intent.setAction("com.rkcp.activitylife.implicit");
//        intent.addCategory(Intent.CATEGORY_DEFAULT);
        startActivity(intent);
    }

    public void jumpToSaveInstanceStateActivity(View view) {
        Intent intent = new Intent(this,SaveInstanceStateActivity.class);
        startActivity(intent);
    }

}