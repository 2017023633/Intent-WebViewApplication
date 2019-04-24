package com.example.intentapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(android.view.View view){
        EditText text=(EditText)findViewById(R.id.text);
        url=text.getText().toString();
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.putExtra("signal",url);
        startActivity(intent);
    }
}
