package com.syntax.class24;

public abstract class Phone {

    void makePhoneCall(){
        System.out.println("Making a phone call");
    }

    void sendText(){
        System.out.println("Sending a text");
    }

    abstract void displayPicture();

    abstract void unlockPhone();


}
class Iphone extends Phone {

    @Override
    void displayPicture() {

    }

    @Override
    void unlockPhone() {
        System.out.println("Use the face to open this phone");
    }
}
class Samsung extends Phone {

    @Override
    void displayPicture() {
        System.out.println("Use gallery to display pics");
    }

    @Override
    void unlockPhone() {
        System.out.println("Can use unlock using faceId and fingerPrint");
    }
}
