package com.eso.wsalny.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.eso.wsalny.R;
import com.eso.wsalny.ui.activities.customer.CustomerLoginRegisterActivity;
import com.eso.wsalny.ui.activities.driver.DriverLoginRegisterActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void GoToDriver(View view) {
        startActivity(new Intent(WelcomeActivity.this, DriverLoginRegisterActivity.class));
        finish();
    }

    public void GoToCustomer(View view) {
        startActivity(new Intent(WelcomeActivity.this, CustomerLoginRegisterActivity.class));
        finish();
    }
}
