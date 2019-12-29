package com.vince.ticketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyTickets extends AppCompatActivity {

    private ArrayList<Ticket> mTickets;
    private MyTicketsAdapter mMyTicketsAdapter;
    private ListView mListView;
    private TextView logoutText;
    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_tickets);

        mTickets = new ArrayList<>();
        logoutText = findViewById(R.id.logout_text);
        backButton = findViewById(R.id.back_button);

        mTickets.add(new Ticket(R.drawable.qrcode, R.drawable.peter_pan_event));
        mTickets.add(new Ticket(R.drawable.qr_code_pontsho, R.drawable.alice_in_wonderland_event));
        mTickets.add(new Ticket(R.drawable.third_ticket_qr, R.drawable.rocky_horror_show));

        mListView = findViewById(R.id.events_listView);
        mMyTicketsAdapter = new MyTicketsAdapter(this, mTickets);
        mTickets = new ArrayList<>();

        logoutText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyTickets.this, BrowseTickets.class);
                startActivity(intent);
                finish();
            }
        });

        mListView.setAdapter(mMyTicketsAdapter);
    }
}
