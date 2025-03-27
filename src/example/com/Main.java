package example.com;

import java.util.Random;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        random.setSeed(1000);
        for (int i = 0; i < 5; i++){
            random.nextInt();
            System.out.println(random.nextInt(100));
        }

    }
}