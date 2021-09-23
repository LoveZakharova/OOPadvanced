public class Lesson6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat1.name = "Васька";
        cat2.name = "Рыжик";
        cat3.name = "Хвост";
        cat1.run(150);
        cat2.swim(10);
        System.out.println("Всего котов " + Cat.getCount());

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        dog1.name = "Барбос";
        dog2.name = "Бим";
        dog3.name = "Рекс";
        dog4.name = "Бобик";
        dog1.run(300);
        dog2.swim(40);
        System.out.println("Всего собак " + Dog.getCount());
    }




}
