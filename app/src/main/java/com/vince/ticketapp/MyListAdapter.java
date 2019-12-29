package com.vince.ticketapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapter extends BaseAdapter {

    private Activity mActivity;
    private ArrayList<Event> mEvents;

    public MyListAdapter(Activity activity, ArrayList<Event> events) {
        mActivity = activity;
        mEvents = events;
    }

    private static class ViewHolder{
        private TextView date;
        private TextView price;
        private TextView eventName;
        private ImageView eventPoster;

    }

    @Override
    public int getCount() {
        return mEvents.size();
    }

    @Override
    public Event getItem(int position) {
        return mEvents.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.coming_events_row, parent, false);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.date = convertView.findViewById(R.id.event_date_textView);
            viewHolder.eventName = convertView.findViewById(R.id.event_name_text);
            viewHolder.eventPoster = convertView.findViewById(R.id.event_image);
            viewHolder.price = convertView.findViewById(R.id.price_text_view);

            convertView.setTag(viewHolder);
        }

        ViewHolder viewHolder = (ViewHolder) convertView.getTag();
        Event event = getItem(position);

        String eventPrice = event.getEventPrice();
        viewHolder.price.setText(eventPrice);
        String eventDate = event.getEventDate();
        viewHolder.date.setText(eventDate);
        String eventName = event.getEventName();
        viewHolder.eventName.setText(eventName);
        int eventPoster = event.getEventPoster();
        viewHolder.eventPoster.setImageResource(eventPoster);


        return convertView;
    }
}
