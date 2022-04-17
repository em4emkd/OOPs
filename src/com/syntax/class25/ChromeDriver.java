package com.syntax.class25;

public class ChromeDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Chrome Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find the Element using Chrome Browser");
    }
}
