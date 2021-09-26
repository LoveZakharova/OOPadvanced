import com.sun.webkit.dom.RangeImpl;

public class Cat {

    private String name;
    private int appetite;
    private boolean hungry;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    void info() {
        String isHungry = !hungry ? "поел и сыт" : "голоден";
        System.out.println(name + " " + isHungry);
    }

    void eat(Plate plate) {
        if (hungry && plate.reduceFood(appetite))
        hungry = false;
    }


}
