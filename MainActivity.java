package com.example.onelia3823.prova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



        public boolean onCreateOptionsMenu(Menu menu)
        {
            MenuInflater inflater=getMenuInflater();
            inflater.inflate(R.menu.menu,menu);
            return true;
        }




        public boolean onOptionsItemSelected(MenuItem item)
        {
            int id=item.getItemId();
            switch(id)
            {
                case R.id.MENU_1:
                    Toast.makeText(this, "HEY", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.MENU_2:
                    Toast.makeText(this, "OK SORRY", Toast.LENGTH_SHORT).show();
                case R.id.MENU_3:
                    Toast.makeText(this, "NO", Toast.LENGTH_SHORT).show();
            }
            return false;
        }








    }

