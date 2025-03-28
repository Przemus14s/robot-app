package example.com;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Example6 {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(1000);

        String url = "https://www.google.com";
        typeText(robot, url);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        System.out.println("Nowa karta została otwarta i załadowano Google!");
    }

    public static void typeText(Robot robot, String text) {
        for (char c : text.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            if (KeyEvent.CHAR_UNDEFINED == keyCode) {
                continue;
            }
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
            robot.delay(100);
        }
    }
}