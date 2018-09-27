package com.codem.mahadi.listviiewdemo.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.codem.mahadi.listviiewdemo.R;

import java.util.ArrayList;

public class ListViewCustomAdapter extends ArrayAdapter<String> {

    private final Context context;
    private ArrayList<String> myFamily;

    public ListViewCustomAdapter(Context context, ArrayList<String> myFamily) {
        super(context, R.layout.list_view, myFamily);

        this.context = context;
        this.myFamily = myFamily;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_view, parent, false);

        TextView name = (TextView) rowView.findViewById(R.id.name);
        TextView designation = (TextView) rowView.findViewById(R.id.designation);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        name.setText(myFamily.get(position));
        designation.setText("A");
        // Change the icon for Windows and iPhone
        String s = myFamily.get(position);
        if (s.startsWith("Windows7") || s.startsWith("iPhone")
                || s.startsWith("Solaris")) {
            imageView.setImageResource(R.drawable.ic_launcher_background);
        } else {
            imageView.setImageResource(R.drawable.ic_launcher_background);
        }

        return rowView;
    }
}
