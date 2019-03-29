package com.abc.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TableLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout_activity);
    }

    public void goVerticalLinearLayout(View view) {
        Intent intent = new Intent(this, VerticalLinearLayoutActivity.class);
        startActivity(intent);
    }

    public void goHorizontalLayout(View view) {
        Intent intent = new Intent(this, HorizontalLinearLayoutActivity.class);
        startActivity(intent);
    }

    public void goConstraintLayout(View view) {
        Intent intent = new Intent(this, ConstraintLayoutActivity.class);
        startActivity(intent);
    }

    public void goFrameLayout(View view) {
        Intent intent = new Intent(this, FrameLayout.class);
        startActivity(intent);
    }
}
