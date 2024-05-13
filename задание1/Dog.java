public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name, 500, 10);
        dogCount++;
    }

    @Override
    public boolean eat() {
        return true;
    }

    public static int getDogCount() {
        return dogCount;
    }

    public static void setDogCount(int count) {
        dogCount = count;
    }
}
