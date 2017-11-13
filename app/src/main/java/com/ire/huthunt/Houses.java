package com.ire.huthunt;

import java.util.ArrayList;

/**
 * Created by Ire Olaniyan on 10/14/17.
 */

class Houses {
    ArrayList<Card> houseCard = new ArrayList<>();

    Houses() {
        int[] image = new int[]{
                R.mipmap.house6,
                R.mipmap.house9
        };

        Card card = new Card(image[0], "N1m", "Victoria Island", "2 sitting", "4 bed", "4 bath");
        houseCard.add(card);

        card = new Card(image[1], "N1.3m", "Phase 1, Lekki", "2 sitting", "5 bed", "5 bath");
        houseCard.add(card);
    }
}
