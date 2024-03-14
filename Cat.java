public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;//сытость
    
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }
    
    void info() {
        System.out.println(name + " аппетит " + appetite + ".\n" + name + " кушает.");
        String isHungry = !satiety ? " сыт" : " в тарелке мало еды.";
        System.out.println(name + isHungry);
    }
    
    public void eat(Plate p) {
        if (satiety == true && p.decreaseFood(appetite) == true) {
            satiety = false;
        }
           }
    
}
