package snru.hompa.tawatchai.snrurun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // Main Method นี่คือ เมท็อด

    public void clickSignUpMain(View view) {
        startActivity(new Intent(MainActivity.this,SignUp.class));
    }
} // Main class นี่คือ คลาสหลัก
