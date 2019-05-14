package com.example.myapplication.database;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    private DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DatabaseHelper(this);
        createNote("test");
        viewnote();
    }



    private void createNote(String note) {
        // inserting note in db and getting
        // newly inserted note id
        note="please mmore daata";
        long id = db.insertNote(note);

        // get the newly inserted note from db
        Note n = db.getNote(id);

        Toast.makeText(getApplicationContext(),n.getNote(),Toast.LENGTH_LONG).show();

//        if (n != null) {
//            // adding new note to array list at 0 position
//            notesList.add(0, n);
//
//            // refreshing the list
//            mAdapter.notifyDataSetChanged();
//
//            toggleEmptyNotes();
//        }
    }

    private void  viewnote() {
        // inserting note in db and getting
        // newly inserted note id



//        if (n != null) {
//            // adding new note to array list at 0 position
//            notesList.add(0, n);
//
//            // refreshing the list
//            mAdapter.notifyDataSetChanged();
//
//            toggleEmptyNotes();
//        }
    }



}
