package prac8_package.Mediator;

// Интерфейс Посредника
interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}