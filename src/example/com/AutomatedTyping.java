package example.com;

import java.awt.*;
import java.awt.event.KeyEvent;

public class AutomatedTyping {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        robot.delay(3000);

        String text = "Automatyczne pisanie z użyciem klasy Robot!";

        typeText(robot, text);
        System.out.println("Tekst został wpisany automatycznie!");
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

