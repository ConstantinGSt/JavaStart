package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger bibop = new Jaeger();
        Jaeger crazyWarrior = new Jaeger("Pulya", "Dark Blue", "Railgun & Sword", 25.3, 45.16, 18, 2,
        88, 6 );

        bibop.setModelName("Bibop tarantas");
        bibop.setColor("brow");
        bibop.setWeapon("Whisky");
        bibop.setHeight(18.4);
        bibop.setTonnage(75.4);
        bibop.setSpeed(34);
        bibop.setRequirePilots(1);
        bibop.setStrenght(125);
        bibop.setArmor(48);

        crazyWarrior.jaegerPrint();
        bibop.jaegerPrint();
    }
}