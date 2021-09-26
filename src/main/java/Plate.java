public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Итого в тарелке еды: " + food);
    }

    boolean reduceFood(int n) {
        int residual = food - n;
        if (residual < 0) return false;

        food -= n;
        return true;
    }

    public void addFood(int food) {
        this.food += food;
    }

}
