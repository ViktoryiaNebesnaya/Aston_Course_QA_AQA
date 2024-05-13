public class Main {
    public static void main(String[] args) {
        System.out.println("Животных просят пробежать и проплыть:");

        Animal dogBobik = new Dog("Бобик");
        dogBobik.run(400);
        dogBobik.swim(5);

        Animal catMurchik = new Cat("Кот Мурчик", 0, false);
        catMurchik.run(150);
        catMurchik.swim(0);

        Animal[] animals = {
            new Cat("Кот Пушок", 0, false),
            new Cat("Кот Барсик", 0, false),
            new Cat("Кошка Мурка", 0, false)
        };

        System.out.println("\nИнформация о животных:");
        System.out.println("Все коты изначально голодны.");

        System.out.println("\nВсего имеется: " + Animal.getAnimalCount() + " животных, " +
                           Animal.getDogCount() + " собака, " + Animal.getCatCount() + " кота и кошка.");
        System.out.println("Животным требуется минимум " + Cat.MINIMUM_FOOD_FOR_EATING + " единиц еды, чтобы начать есть.");

        System.out.println("\nИзначально в мисках животных 0 еды.");

        addFoodToDish(catMurchik, 15);
        addFoodToDish(animals[0], 8);
        addFoodToDish(animals[1], 12);
        addFoodToDish(animals[2], 10);

        System.out.println("\nЖивотных просят пойти поесть:");
        feedAllAnimals(animals);

        System.out.println("\nИнформация о животных после кормления:");
        System.out.println(catMurchik.getName() + ": " + (catMurchik.getFood() >= Cat.MINIMUM_FOOD_FOR_EATING ? "сыт" : "голоден") + ".");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + ": " + (animal.getFood() >= Cat.MINIMUM_FOOD_FOR_EATING ? "сыт" : "голоден") + ".");
        }
    }

    private static void feedAllAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal.getFood() < Cat.MINIMUM_FOOD_FOR_EATING) {
                System.out.println(animal.getName() + ": отказывается есть, недостаточно еды в миске.");
            } else if (!animal.eat()) {
                System.out.println(animal.getName() + ": остался голодным.");
            } else {
                System.out.println(animal.getName() + ": покушал.");
            }
        }
    }

    private static void addFoodToDish(Animal animal, int amount) {
        animal.addFood(amount);
        System.out.printf("\nВ миску %s добавлено %d ед. Стало %d.%n",
                          animal.getName(), amount, animal.getFood());
    }
}
