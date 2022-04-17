package com.syntax.class24;

public class BrowserTester {
    public static void main(String[] args) {
//        GoogleChrome chrome=new GoogleChrome();
//        chrome.openBrowser();
//        chrome.loadPage("www.google.com");
//        chrome.testThePage();
//        chrome.closeBrowser();
//
//        FireFox fireFox=new FireFox();
//        fireFox.openBrowser();
//        fireFox.loadPage("www.google.com");
//        fireFox.testThePage();
//        fireFox.closeBrowser();


        Browser[] browsers={new GoogleChrome(), new FireFox(), new Safari(), new IE()};

        for(Browser b:browsers){
            b.openBrowser();
            b.loadPage("www.google.com");
            b.testThePage();
            b.closeBrowser();
        }

    }
}
