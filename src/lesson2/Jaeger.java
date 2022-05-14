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

    Jaeger() {
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
    
    public void jaegerPrint() {
        System.out.println("Model: " + modelName + "\n" + "Color: " + color + "\n" + "Weapon: " + 
        weapon + "\n" + "Height: " + height + "\n" + "Weight: "+ tonnage + "\n" + "Speed: " + speed + "\n" +
        "Pilots: " + requirePilots + "\n" + "Strenght: " + strenght + "\n" + "Armor: " + armor +"\n");
    }
    
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

     public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

   public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setRequirePilots(int requirePilots) {
        this.requirePilots = requirePilots;
    }

    public int getRequirePilots() {
        return requirePilots;
    }

     public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void run(int time) {
        distance = speed * time;
    }

    public double getDistance() {
        return distance;
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
