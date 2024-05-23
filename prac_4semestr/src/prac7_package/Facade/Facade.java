package prac7_package.Facade;

// Фасад, предоставляющий упрощенный интерфейс для работы с подсистемами
class Facade {
    private Database database;
    private DataProcessor processor;
    private Presentation presentation;

    public Facade() {
        this.database = new Database();
        this.processor = new DataProcessor();
        this.presentation = new Presentation();
    }

    public void processDataAndDisplay() {
        database.connect();
        processor.processData();
        presentation.displayData();
        database.disconnect();
    }
}
