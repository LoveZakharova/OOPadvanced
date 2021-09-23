public class Dog extends Animal {
    final int maxRunDistance = 500;
    final int maxSwimDistance = 10;
    String name;

    @Override
    public void run(int d) {
        if ((d >= 0) && (d <= maxRunDistance)) System.out.println(name + " пробежал " + d + "м");
        else System.out.println("run: false");
    }

    @Override
    public void swim(int d) {
        if ((d >= 0) && (d <= maxSwimDistance)) System.out.println(name + " проплыл " + d + "м");
        else System.out.println(name + " не плавает столько");
    }

    public static int count = 0;

    public static int getCount() {
        return Dog.count;
    }

    public Dog(){
        Dog.count++;
    }


}
