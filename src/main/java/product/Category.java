package product;

// 불필요한 클래스는 삭제

//TODO
public enum Category {
    Dairy("유제품", 1),
    Meat("육류", 2),
    Produce("과일채소류", 3);

    final String name;
    final int id;

    Category(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

//Q: enum 데이터로 객체를 가질 수 있나? (e.g. Product)
//Q. enum 키값으로 숫자올 수 있나?