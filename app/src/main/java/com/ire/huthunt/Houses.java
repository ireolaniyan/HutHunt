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
                R.mipmap.house
        };

        Card card = new Card(image[0], "N750, 000", "Victoria Island");
        houseCard.add(card);

        card = new Card(image[1], "N1.2m", "Phase 1, Lekki");
        houseCard.add(card);
    }
}
