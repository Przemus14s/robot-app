package example.com;

import java.awt.*;
import java.awt.event.KeyEvent;

public class AutoCloseWindow {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        System.out.println("Zamykanie aktywnego okna za 3 sekundy...");
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_ALT);

        System.out.println("Okno zostało zamknięte automatycznie!");
    }
}
