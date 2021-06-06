package data;

import java.util.Random;

public enum Subject {

    Accounting,
    Arts,
    Biology,
    Chemistry,
    Civics,
    Commerce,
    Computer,
    Economics,
    English,
    Hindi,
    History,
    Maths,
    Physics,
    Social;

    public static Subject getRandomSubject() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

}