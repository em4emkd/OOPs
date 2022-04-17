package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public abstract class Card {
    /*
    Create a Card class that will have implemented  and unimplemented methods and a constructor
    that will initialize credit card type.  Create 3 subclasses of a Card card.
    Create 3 objects of different card and store them into LinkedList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
    */
    String cardType;
    abstract String cardType(String cardType);

    public String cardRewards(){
        return cardType+" is a rewards card";
    }
    public Card(String cardType) {
        this.cardType = cardType;
    }
}
class Card1 extends Card {

    @Override
    String cardType(String cardType) {
        return "This is a "+cardType;
    }

    public Card1(String cardType) {
        super(cardType);
    }
}
class Card2 extends Card {

    @Override
    String cardType(String cardType) {
        return "This is a "+cardType;
    }

    public Card2(String cardType) {
        super(cardType);
    }
}
class Card3 extends Card {

    @Override
    String cardType(String cardType) {
        return "This is a "+cardType;
    }

    public Card3(String cardType) {
        super(cardType);
    }
}
class TesterCard {
    public static void main(String[] args) {

        Card1 card1=new Card1("Master Card");
        Card1 card2=new Card1("Visa Card");
        Card1 card3=new Card1("Discovery Card");

        LinkedList<String> cards=new LinkedList<>();
        cards.add(card1.cardType);
        cards.add(card1.cardRewards());
        cards.add(card2.cardType);
        cards.add(card2.cardRewards());
        cards.add(card3.cardType);
        cards.add(card3.cardRewards());

        for (int i = 0; i < cards.size(); i++) {
            System.out.println(cards.get(i));
        }
        System.out.println("---------------------");
        for(String c:cards){
            System.out.println(c);
        }
        System.out.println("---------------------");
        Iterator iterator=cards.iterator();
        while ((iterator.hasNext())){
            System.out.println(iterator.next());
        }
    }

}