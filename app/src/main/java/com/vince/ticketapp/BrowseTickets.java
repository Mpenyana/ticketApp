package com.vince.ticketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class BrowseTickets extends AppCompatActivity {

    TextView logoutText;
    ListView mListView;
    MyListAdapter mArrayAdapter;
    Button viewTickets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_tickets);

        ArrayList<Event> upcomingEvents = new ArrayList<>();

        upcomingEvents.add(new Event("Peter Pan On Ice", "From R140", "Wed, 18 DEC 19",
                R.drawable.peter_pan_event));
        upcomingEvents.add(new Event("WLive South Africa", "From R405", "Wed, 29 APR 20",
                R.drawable.wwlive_event));
        upcomingEvents.add(new Event("Alice In Wonderland", "From R150", "Thu, 19 DEC 19",
                R.drawable.alice_in_wonderland_event));
        upcomingEvents.add(new Event("Rock Horror Show", "From R100", "Thu, 19 DEC 19",
                R.drawable.rocky_horror_show));
        upcomingEvents.add(new Event("Lang Storie Kort", "From R160", "Fri, 20 DEC 19",
                R.drawable.lang_storie_kort));

        mArrayAdapter = new MyListAdapter(this, upcomingEvents);
        mListView = findViewById(R.id.events_listView);
        logoutText = findViewById(R.id.logout_text);
        viewTickets = findViewById(R.id.view_tickets_button);


        mListView.setAdapter(mArrayAdapter);


        logoutText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        viewTickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BrowseTickets.this, MyTickets.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
