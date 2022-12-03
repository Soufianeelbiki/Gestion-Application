package com.example.iwimapplication.Activity;


import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.iwimapplication.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class ManageTimetable extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "ManageTimetable";

    ImageView back;
    FirebaseUser user;
    String userId;
    ListView menu;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_timetable);

        back = findViewById(R.id.ab_back);

        back.setOnClickListener(this);

        user = FirebaseAuth.getInstance().getCurrentUser();
        userId = user.getUid();

        menu = findViewById(R.id.timetableMenu);
        menu.setDivider(null);
        menu.setDividerHeight(20);


        String titres[] = {"Ajouter un emploi du temps", "Consulter l'emploi du temps"};
        int images[] = {R.drawable.addtimetable, R.drawable.timetable};

        myAdapter adapter = new myAdapter(this, titres, images);

        menu.setAdapter(adapter);
        menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(getApplicationContext(), AddTimetable.class));
                } else if (position == 1) {
                    //startActivity(new Intent(getApplicationContext(), ));
                }
            }
        });
    }

    @Override
    
	class mmy test extends ArrayAdapter<String>{
        Context context;
        String titles[];
        int icons[];


    class myAdapter extends ArrayAdapter<String>{
        Context context;
        String titles[];
        int icons[];

      

}


