package prac6_package.abstractFactory;

public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

/*
Абстрактная фабрика предоставляет интерфейс создания всех имеющихся продуктов (объектов семейства).
У абстрактной фабрики, как правило, есть несколько реализаций. Каждая из них отвечает за создание продуктов одной из
вариаций.
*/

