package com.example.number;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    class Number {
        int no;

        public boolean isTraingular() {
            int x = 1;
            int tnumber = 1;

            while (tnumber < no) {
                x++;
                tnumber = tnumber + x;
            }

            if (tnumber == no)
                return true;
            else
                return false;
        }

        public boolean isSquare() {
            double squareRoot = Math.sqrt(no);
            if (squareRoot == Math.floor(squareRoot)) {
                return true;
            } else
                return false;
        }
    }
    public void test(View view) {
        EditText number=(EditText) findViewById(R.id.edit);

        int no=Integer.parseInt(number.getText().toString());

        Number obj=new Number();
        obj.no=no;

        if(obj.isTraingular()  && obj.isSquare())
            Toast.makeText(MainActivity.this,no+" "+"is Both Traingular and Square Number",Toast.LENGTH_SHORT).show();
        else if(obj.isSquare())
            Toast.makeText(MainActivity.this,no+" "+"is Square Number",Toast.LENGTH_SHORT).show();
        else if(obj.isTraingular())
            Toast.makeText(MainActivity.this,no+" "+"is Traingular Number",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(MainActivity.this,no+" "+"is Neither traingular and square Number",Toast.LENGTH_SHORT).show();
    }
}
