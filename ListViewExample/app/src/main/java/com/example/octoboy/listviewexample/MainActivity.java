package com.example.octoboy.listviewexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList< String > list = new ArrayList< String >( );

        list.add ( "Captain America" );
        list.add ( "Iron Man" );
        list.add ( "Hawkeye" );
        list.add ( "Thor" );
        list.add ( "The Hulk" );
        list.add ( "Black Widow" );

        ArrayAdapter < String > dataAdapter = new ArrayAdapter< String >( this, android.R.layout.simple_list_item_1, list );

        ListView listview = (ListView) this.findViewById ( R.id.listView );

        listview.setAdapter ( dataAdapter );
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
}
