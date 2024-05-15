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
    
    @Override
    public void swim(int distance) {
        super.swim(distance);
    }

    public static int getDogCount() {
        return dogCount;
    }
}
