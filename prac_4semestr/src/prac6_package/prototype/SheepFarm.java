package prac6_package.prototype;

public class SheepFarm {
    public static void main(String[] args) {
        // Создаем прототип овцы
        Sheep blackPrototype = new BlackSheep("Baa Baa");
        Sheep whitePrototype = new WhiteSheep("Fleecy");

        // Клонируем овцу по мере необходимости
        Sheep clonedBlackSheep = blackPrototype.clone();
        Sheep clonedWhiteSheep = whitePrototype.clone();

        // Настройка клонированной овцы
        clonedBlackSheep.setName("Midnight");
        clonedWhiteSheep.setName("Snowball");

        // Ваша овцеферма процветает!
        System.out.println("Black sheep: " + clonedBlackSheep.getName());
        System.out.println("White sheep: " + clonedWhiteSheep.getName());
    }
}

/*
В нашем клиентском коде “Овцефермы” мы создаем прототипы овец, клонируем их и настраиваем клонированных овец по мере
необходимости.
*/