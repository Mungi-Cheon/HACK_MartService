package person;

public class Cashier implements Calculable {

    private Person person;

    public Cashier(final Person person) {
        this.person = person;
    }

    @Override
    public void introduce() {
        System.out.printf("\n🙍‍ 안녕하세요. 계산원 %s입니다.\n", person.getName());
    }
}
