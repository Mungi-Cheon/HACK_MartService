package person;

public class Kiosk {

    private String model;

    public Kiosk() {
        this.model = "키오스크";
    }

    public Kiosk(String model) {
        this.model = model + "번 키오스크";
    }

    public String getModel() {
        return model;
    }
}

