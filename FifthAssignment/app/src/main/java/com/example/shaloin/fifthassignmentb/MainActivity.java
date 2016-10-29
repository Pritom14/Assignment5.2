package com.example.shaloin.fifthassignmentb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case R.id.comp:
                Toast.makeText(getApplicationContext(),"Computer Clicked",Toast.LENGTH_LONG).show();
                return true;
            case R.id.game:
                Toast.makeText(getApplicationContext(),"Gamepad Clicked",Toast.LENGTH_LONG).show();
                return true;
            case R.id.camera:
                Toast.makeText(getApplicationContext(),"Camera Clicked",Toast.LENGTH_LONG).show();
                return true;
            case R.id.video:
                Toast.makeText(getApplicationContext(),"Video Clicked",Toast.LENGTH_LONG).show();
                return true;
            case R.id.email:
                Toast.makeText(getApplicationContext(),"Email Clicked",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
