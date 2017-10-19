package com.ire.huthunt;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Ire Olaniyan on 10/14/17.
 */

class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardHolder> {
    private Context mContext;
    private ArrayList<Card> mCardList;

    static class CardHolder extends RecyclerView.ViewHolder {
        private ImageView mHouseImage, mLivingrooomImage, mBedroomImage, mBathroomImage;
        private TextView mPriceTv;
        private TextView mAddressTv;

        CardHolder(View itemView) {
            super(itemView);

            mHouseImage = itemView.findViewById(R.id.house_image);
            mPriceTv = itemView.findViewById(R.id.price_tv);
            mAddressTv = itemView.findViewById(R.id.address_tv);
            mLivingrooomImage = itemView.findViewById(R.id.living_room_image);
            mBedroomImage = itemView.findViewById(R.id.bedroom_image);
            mBathroomImage = itemView.findViewById(R.id.bathroom_image);
        }
    }

    CardAdapter(Context context, ArrayList<Card> cardList) {
        mContext = context;
        mCardList = cardList;
    }

    @Override
    public CardHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.card_list_item, parent, false);
        return new CardHolder(v);
    }

    @Override
    public void onBindViewHolder(CardHolder holder, int position) {
        Card card = mCardList.get(position);

        holder.mHouseImage.setImageResource(card.getmImage());
        holder.mPriceTv.setText(card.getmPriceTag());
        holder.mAddressTv.setText(card.getmAddress());
        holder.mLivingrooomImage.setImageResource(R.drawable.readability);
        holder.mBedroomImage.setImageResource(R.drawable.ic_bed);
        holder.mBathroomImage.setImageResource(R.drawable.hot_tub);
    }

    @Override
    public int getItemCount() {
        return mCardList.size();
    }

}
