package data;

import java.util.Random;

public enum Hobby {

    Sports,
    Reading,
    Music;

    public static Hobby getRandomHobby() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

}