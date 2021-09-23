public abstract class Animal {
    public String name;
    final int maxRunDistance;
    final int maxSwimDistance;
    public int d;

    protected Animal() {
        maxRunDistance = 0;
        maxSwimDistance = 0;
    }

    /*public Animal(String name){
        this.name = name;
    }*/


   public abstract void run(int d);

   public abstract void swim(int d);

   public static int count = 0;

    public static void setCount(int count) {
        Animal.count = count;
    }


}
