package com.jasminelawrence.redmondtourguide;

/**
 * Created by Jasmine on 12/28/17.
 */


public class Location {

    /**
     * Basic information for the location
     */
    private String mName, mAddress, mDescription, mWebsite, mPhoneNumber;

    /** Image resource ID for the location */
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    /** Constant value that represents no image was provided for this location */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Location object with an image.
     *
     * @param name Name of the location
     * @param address   Address of the location
     * @param description   One line description of the location
     * @param website   Website URL of the location
     * @param phoneNumber   Phone Number of the location
     * @param imageResourceId   location of the location's image
     */

    public Location(String name, String address, String description, String website, String phoneNumber, int imageResourceId) {

   mName=name;
   mAddress=address;
   mDescription=description;
   mPhoneNumber = phoneNumber;
   mWebsite=website;
   mImageResourceId=imageResourceId;
    }

    /**
     * Create a new Location object.
     *
     * @param name Name of the location
     * @param address   Address of the location
     * @param description   One line description of the location
     * @param website   Website URL of the location
     * @param phoneNumber   Phone Number of the location
     */

    public Location(String name, String address, String description, String website, String phoneNumber) {

        mName=name;
        mAddress=address;
        mDescription=description;
        mPhoneNumber = phoneNumber;
        mWebsite=website;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }


    @Override
    public String toString() {
        return "Location{" +
                "mName='" + mName + '\'' +
                ", mAddress='" + mAddress + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mWebsite='" + mWebsite + '\'' +
                ", mPhoneNumber='" + mPhoneNumber + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
