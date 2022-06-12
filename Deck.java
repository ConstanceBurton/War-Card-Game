package com.promineotech.war;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
  
  private List<Card> cards = new ArrayList<Card>();
  
  public Deck() {
    String Rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String Suit[] = {"Spades", "Clubs", "Diamonds", "Hearts"};
    
    for (int i = 0; i < 4; i++) {
      for(int j = 0; j < 13; j++) {
        String name = Rank[j] + "of" + Suit[i];
        Card card = new Card(name, j + 1);
        cards.add(card);
      }
    }
  }
  public void shuffle() {
    Random random = new Random();
    for (int i = 1; i < 52; i++ ) {
      int j = random.nextInt(52 - i) + 1;
      Card tmp = cards.get(i - 1);
      cards.set(i -1, cards.get(j));
      cards.set(j, tmp);
    }
  }
  public Card draw() {
    Card topCard = cards.get(cards.size()- 1);
    cards.remove(topCard);
    return topCard;
  }
}
