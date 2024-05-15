public class Main {
    public static void main(String[] args) {
        System.out.println("Животных просят пробежать и проплыть:");

        Animal[] animals = {
            new Dog("Бобик"),
            new Cat("Кот Мурчик", 0, false),
            new Cat("Кот Пушок", 0, false),
            new Cat("Кот Барсик", 0, false),
            new Cat("Кошка Мурка", 0, false)
        };

        for (Animal animal : animals) {
            animal.run(400);
            animal.swim(5);
        }

        System.out.println("\nИнформация о животных:");
        System.out.println("Все коты изначально голодны.");

        System.out.println("\nВсего имеется: " + Animal.getAnimalCount() + " животных, " +
                           Animal.getDogCount() + " собака, " + Animal.getCatCount() + " кота и кошки.");
        System.out.println("Животным требуется минимум " + Animal.MINIMUM_FOOD_FOR_EATING + " единиц еды, чтобы начать есть.");

        System.out.println("\nИзначально в мисках животных 0 еды.");

        addFoodToDish(animals[1], 15);
        addFoodToDish(animals[2], 8);
        addFoodToDish(animals[3], 12);
        addFoodToDish(animals[4], 10);

        System.out.println("\nЖивотных просят пойти поесть:");
        feedAllAnimals(animals);

        System.out.println("\nИнформация о животных после кормления:");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + ": " + (animal.getFood() >= Animal.MINIMUM_FOOD_FOR_EATING ? "сыт" : "голоден") + ".");
        }
    }

    private static void feedAllAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal.getFood() < Animal.MINIMUM_FOOD_FOR_EATING) {
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
