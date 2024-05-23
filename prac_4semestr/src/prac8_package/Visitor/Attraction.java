package prac8_package.Visitor;

// Интерфейс для элементов, которые могут быть посещены посетителем
interface Attraction {
    void accept(Visitor visitor);
}