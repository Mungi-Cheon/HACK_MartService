package person;

import java.util.Map;
import java.util.Random;

public class Kiosk implements Calculable {

    private String model;
    private final int number;


    public Kiosk() {
        this.model = "키오스크";
        this.number = (int) (Math.random() * 10);
        this.model = number + "번 키오스크";
    }

    @Override
    public void introduce() {
        System.out.println("\n🤖 " + this.model + "에서 계산을 도와드리겠습니다.\n");
    }
}

