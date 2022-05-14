public class Jaeger {
    
    private String modelName;
    private String color;
    private String weapon;
    private double height;
    private double tonnage;
    private double speed;
    private int requirePilots;
    private int strenght;
    private int armor;
    private double distance;

    Jaeger(){
    }

    Jaeger(String modelName, String color, String weapon, double height, double tonnage, double speed,
        int requirePilots, int strenght, int armor) {
        this.modelName = modelName;
        this.color = color;
        this.weapon = weapon;
        this.height = height;
        this.tonnage = tonnage;
        this.speed = speed;
        this.requirePilots = requirePilots;
        this.strenght = strenght;
        this.armor = armor;
    }

    public String setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void getModelName() {
        return modelName;
    }

    public String setColor(String color) {
        this.color = color;
    }

    public void getColor() {
        return color;
    }

    public String setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void getWeapon() {
        return weapon;
    }

    public double setHeight(double height) {
        this.height = height;
    }

    public void getWeight() {
        return weight;
    }

     public double setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public void getTonnage() {
        return tonnage;
    }

   public double setSpeed(double speed) {
        this.speed = speed;
    }

    public void getSpeed() {
        return speed;
    }

    public int setRequirePilots(int requirePilots) {
        this.requirePilots = requirePilots;
    }

    public void getRequirePilots() {
        return requirePilots;
    }

     public int setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public void getStrenght() {
        return strenght;
    }

    public int setArmor(int armor) {
        this.armor = armor;
    }

    public void getArmor() {
        return armor;

    public int getDistance() {
        return distance;
    }

    public void run(int time) {
        distance = speed * time;
    }
    
    public void eat() {
        System.out.println(modelName + " scan area");
    }
    
    public void sleep() {
        System.out.println(modelName + " seet");
    }
    
    public void learningJava() {
        System.out.println(modelName + " Fight");
    }
}
