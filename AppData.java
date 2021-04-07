package NewLesson5;

public class AppData {
    private String brand;
    private String name;

    public AppData(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
