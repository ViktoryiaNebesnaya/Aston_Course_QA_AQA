public class Cat extends Animal {
    private static int catCount = 0;
    private static final int MINIMUM_FOOD_FOR_EATING = 10;
    private boolean isFull;

    public Cat(String name, int food, boolean isFull) {
        super(name, 200, 0);
        this.food = food;
        this.isFull = isFull;
        catCount++;
    }

    @Override
    public boolean eat() {
        if (food >= MINIMUM_FOOD_FOR_EATING) {
            food -= MINIMUM_FOOD_FOR_EATING;
            isFull = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean getIsFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }

    public static void setCatCount(int count) {
        catCount = count;
    }
}
