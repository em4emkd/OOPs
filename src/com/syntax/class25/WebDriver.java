package com.syntax.class25;

public interface WebDriver {
    /*
    Create a WebDriver Interface that will have the following unimplemented
    behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and
    FirefoxDriver.
     */
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class FireforxDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Open the Firefox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close the Firefox Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the Firefox Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find the Element using FireFox Browser");
    }
}
class WebDriverTester {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.openBrowser();
        driver.maximizeWindow();
        driver.findElement();
        driver.closeBrowser();

        System.out.println("-----------");

       WebDriver[] webDrivers={new ChromeDriver(), new FireforxDriver()};

       for(WebDriver w:webDrivers){
           w.openBrowser();
           w.maximizeWindow();
           w.maximizeWindow();
           w.closeBrowser();
       }
    }
}
