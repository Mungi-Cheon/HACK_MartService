package person;

public class Kiosk {

    private String model;
    private int number;

    public Kiosk() {
        this.model = "키오스크";
    }

    public Kiosk(int number) {
        this.model = number + "번 키오스크";
    }

    public String getModel() {
        return model;
    }
}

