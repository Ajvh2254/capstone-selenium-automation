package capstonefactory.utilities.utils;

import capstonefactory.base.BasePage;

public class Waits extends BasePage {

    public Waits() {
        super();
    }

    public void sleep() {
        System.out.println("Waits for 3 seconds");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
