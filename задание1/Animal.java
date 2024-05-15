public abstract class Animal {
    protected static int animalCount = 0;

    protected String name;
    protected int runLimit;
    protected int swimLimit;
    protected int food;
    protected static final int MINIMUM_FOOD_FOR_EATING = 10;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit > 0 ? runLimit : 500;
        this.swimLimit = swimLimit > 0 ? swimLimit : 10;
        this.food = 0;
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.printf("%s пробежал %d м.%n", name, distance);
        } else {
            System.out.printf("%s не смог пробежать %d м, так как это превышает его лимит в %d м.%n",
                              name, distance, runLimit);
        }
    }

    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.printf("%s проплыл %d м.%n", name, distance);
        } else {
            System.out.printf("%s не смог проплыть %d м, так как это превышает его лимит в %d м.%n",
                              name, distance, swimLimit);
        }
    }

    public String getName() {
        return name;
    }

    public int getFood() {
        return food;
    }

    public void addFood(int amount) {
        this.food += amount;
    }

    public abstract boolean eat();

    public static int getAnimalCount() {
        return animalCount;
    }

    public static int getDogCount() {
        return Dog.getDogCount();
    }

    public static int getCatCount() {
        return Cat.getCatCount();
    }
}
