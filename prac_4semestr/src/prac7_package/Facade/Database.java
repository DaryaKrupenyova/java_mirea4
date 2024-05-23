package prac7_package.Facade;

// Подсистема для работы с базой данных
class Database {
    public void connect() {
        System.out.println("Подключение к базе данных");
    }

    public void disconnect() {
        System.out.println("Отключение от базы данных");
    }
}
