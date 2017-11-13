package com.ire.huthunt;

/**
 * Created by Ire Olaniyan on 10/14/17.
 */

class Card {
    private int mImage;
    private String mPriceTag, mAddress, mNumSittingrooms, mNumBedrooms, mNumBathrooms;

    Card(int image, String priceTag, String address, String sittingrooms, String bedrooms, String bathrooms) {
        mImage = image;
        mPriceTag = priceTag;
        mAddress = address;
        mNumSittingrooms = sittingrooms;
        mNumBedrooms = bedrooms;
        mNumBathrooms = bathrooms;
    }

    int getmImage() {
        return mImage;
    }

    String getmPriceTag() {
        return mPriceTag;
    }

    String getmAddress() {
        return mAddress;
    }

    public String getmNumSittingrooms() {
        return mNumSittingrooms;
    }

    public String getmNumBedrooms() {
        return mNumBedrooms;
    }

    public String getmNumBathrooms() {
        return mNumBathrooms;
    }
}
