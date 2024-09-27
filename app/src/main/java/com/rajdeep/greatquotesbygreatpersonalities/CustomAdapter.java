package com.rajdeep.greatquotesbygreatpersonalities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<String> {
    private Context context;

    public CustomAdapter(Context context, String[] items) {
        super(context, R.layout.list_item, items);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View listItemView = inflater.inflate(R.layout.list_item, parent, false);

        TextView textViewItem = listItemView.findViewById(R.id.textViewItem);
        String item = getItem(position);

        textViewItem.setText(item);
        textViewItem.setTextColor(ContextCompat.getColor(context, R.color.black));

        return listItemView;
    }
}

