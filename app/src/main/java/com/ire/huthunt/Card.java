package com.ire.huthunt;

/**
 * Created by Ire Olaniyan on 10/14/17.
 */

class Card {
    private int mImage;
    private String mPriceTag;
    private String mAddress;

    Card(int image, String priceTag, String address) {
        mImage = image;
        mPriceTag = priceTag;
        mAddress = address;
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
}
