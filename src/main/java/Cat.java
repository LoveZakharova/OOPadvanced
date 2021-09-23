import com.sun.webkit.dom.RangeImpl;

public class Cat extends Animal {

    String name;
    final int maxRunDistance = 200;
    final int maxSwimDistance;

    {
        maxSwimDistance = 0;
    }

    @Override
    public void run(int d) {
        if ((d >= 0) && (d <= maxRunDistance))
            System.out.println(name + " пробежал " + d + "м");
        else System.out.println(name + " не бегает столько");
    }

    @Override
    public void swim(int d) {
        System.out.println(name + " не плавает");
    }

    public static int count = 0;

    public static int getCount() {
        return Cat.count;
    }

    public Cat(){
        Cat.count++;
    }


}
