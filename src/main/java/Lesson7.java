public class Lesson7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Матроскин", 3),
                new Cat("Кот в сапогах", 4),
                new Cat("Степан", 5),
                new Cat("Мурка", 3)
        };
        Plate plate = new Plate(10);
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
        plate.addFood(10);
        plate.info();
    }




}
