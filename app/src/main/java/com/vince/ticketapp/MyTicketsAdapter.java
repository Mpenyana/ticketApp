package com.vince.ticketapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class MyTicketsAdapter extends BaseAdapter {

    private Activity mActivity;
    private ArrayList<Ticket> mTickets;

    public MyTicketsAdapter(Activity activity, ArrayList<Ticket> tickets) {
        mActivity = activity;
        mTickets = tickets;
    }

    private static class ViewHolder{
        private ImageView eventPoster;
        private ImageView qrCode;

    }

    @Override
    public int getCount() {
        return mTickets.size();
    }

    @Override
    public Ticket getItem(int position) {
        return mTickets.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.my_tickets_row, parent, false);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.eventPoster = convertView.findViewById(R.id.event_image);
            viewHolder.qrCode = convertView.findViewById(R.id.qr_code);

            convertView.setTag(viewHolder);
        }

        ViewHolder viewHolder = (ViewHolder) convertView.getTag();
        Ticket event = getItem(position);

        int eventPoster = event.getPoster();
        viewHolder.eventPoster.setImageResource(eventPoster);
        int ticketQrCode = event.getQRCode();
        viewHolder.qrCode.setImageResource(ticketQrCode);


        return convertView;
    }
}
