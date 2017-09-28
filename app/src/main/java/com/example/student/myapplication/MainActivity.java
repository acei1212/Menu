package com.example.student.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        menu.add(0,1,0,"選單1");
//        menu.add(0,2,0,"選單2");
        getMenuInflater().inflate(R.menu.mymenu,menu);


          return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() == 1)
//        {
//            Toast.makeText(MainActivity.this,"選單1被按下",Toast.LENGTH_SHORT).show();
//        }
//        if (item.getItemId() == 2)
//        {
//            Toast.makeText(MainActivity.this,"選單2被按下",Toast.LENGTH_SHORT).show();
//        }

        if(item.getItemId() == R.id.menu1){
            Toast.makeText(MainActivity.this,"新增被按下",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId() == R.id.menu2){
            Toast.makeText(MainActivity.this,"關於被按下",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId() == R.id.menu3){
            Toast.makeText(MainActivity.this,"star被按下",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
