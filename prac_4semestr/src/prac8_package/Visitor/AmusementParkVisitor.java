package prac8_package.Visitor;

// Конкретный посетитель: посетитель парка развлечений
class AmusementParkVisitor implements Visitor {
    @Override
    public void visit(Carousel carousel) {
        System.out.println("Посетитель выбирает: " + carousel.ride());
    }

    @Override
    public void visit(Slide slide) {
        System.out.println("Посетитель выбирает: " + slide.slide());
    }
}