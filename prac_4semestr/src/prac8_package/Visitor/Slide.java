package prac8_package.Visitor;

// Конкретный элемент: аттракцион "Горка"
class Slide implements Attraction {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // Метод, характеризующий аттракцион "Горка"
    String slide() {
        return "Прокатиться с горки";
    }
}