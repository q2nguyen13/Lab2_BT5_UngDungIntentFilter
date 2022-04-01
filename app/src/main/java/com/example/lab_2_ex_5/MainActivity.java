package com.example.lab_2_ex_5;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public Button show_me;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show_me = (Button) findViewById(R.id.Show_me);

        show_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/"));
                startActivity(intent);
            }
        });
    }

    private void call_api(int id)
    {
        ApiService.apiService.lay_url(id).enqueue(new Callback<image>() {
            @Override
            public void onResponse(Call<image> call, Response<image> response) {
                Toast.makeText(MainActivity.this,"call api successful",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<image> call, Throwable t) {

            }
        });
    }
}