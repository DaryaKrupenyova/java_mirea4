package prac8_package.Visitor;

// Интерфейс посетителя
interface Visitor {
    void visit(Carousel carousel);
    void visit(Slide slide);
}