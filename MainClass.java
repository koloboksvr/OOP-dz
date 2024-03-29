

// ЗАДАНИЕ

// Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
// Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
// Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
// Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

public class MainClass {
    public static void main(String[] args) {
        Cat[] arrCats = new Cat[3];
        arrCats[0] = new Cat("Мурзик", 20);
        arrCats[1] = new Cat("Барсик", 15);
        arrCats[2] = new Cat("Рыжик", 25);
        

        Plate p = new Plate(50);

        for (Cat cat : arrCats) {
            cat.eat(p);
            cat.info();
        }
        p.info();
        p.addFood(100);
        p.info();
    }
}