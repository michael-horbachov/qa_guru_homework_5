package data;

import java.util.Random;

public enum Gender {

    Male,
    Female,
    Other;

    public static Gender getRandomGender() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

}