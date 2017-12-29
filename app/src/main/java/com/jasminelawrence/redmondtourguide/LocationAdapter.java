package com.jasminelawrence.redmondtourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jasmine on 12/28/17.
 */

public class LocationAdapter extends ArrayAdapter<Location> {
    private int mBackgroundColor;

    /**
     *
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param location   A List of location objects to display in a list
     *
     */


    public LocationAdapter(Activity context, ArrayList<Location> location) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, location);
    }

    public LocationAdapter(Activity context, ArrayList<Location> location, int backgroundColor) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, location);
        mBackgroundColor = backgroundColor;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentLocation.getName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        descriptionTextView.setText(currentLocation.getDescription());


       /* // Find the TextView in the list_item.xml layout with the ID version_number
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        addressTextView.setText(currentLocation.getAddress());


        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView websiteTextView = (TextView) listItemView.findViewById(R.id.website);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        websiteTextView.setText(currentLocation.getWebsite());


        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView phoneNumberTextView = (TextView) listItemView.findViewById(R.id.phone_number);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        phoneNumberTextView.setText(currentLocation.getPhoneNumber());*/

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentLocation.hasImage()) {
            // Find the ImageView in the list_item.xml layout with the ID list_item_icon

            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView
            iconView.setImageResource(currentLocation.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);


        } else {

            iconView.setVisibility(View.GONE);
        }

        View background = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mBackgroundColor);

        background.setBackgroundColor(color);



        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
