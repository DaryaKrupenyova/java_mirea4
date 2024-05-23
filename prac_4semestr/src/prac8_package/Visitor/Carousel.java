package prac8_package.Visitor;

// Конкретный элемент: аттракцион "Карусель"
class Carousel implements Attraction {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // Метод, характеризующий аттракцион "Карусель"
    String ride() {
        return "Покататься на карусели";
    }
}