package inandout.RandomAccessFile;

public class Person {
    private String name;
    private String phone;
    private String num;
    private String cost;

    public Person(String name, String phone, String num, String cost) {
        this.name = name;
        this.phone = phone;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", num='" + num + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}
