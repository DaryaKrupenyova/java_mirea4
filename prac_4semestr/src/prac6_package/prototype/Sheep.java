package prac6_package.prototype;

public interface Sheep {
    Sheep clone();
    String getName();
    void setName(String name);
}

/*
Шаблон проектирования Прототип (Prototype) — это шаблон, который помогает создавать новые объекты путем копирования
существующего объекта. Прототип особенно полезен при создании сложных или ресурсоемких объектов. Чтобы лучше понять
принцип работы этого шаблона, давайте рассмотрим его на примере овцефермы.

Представьте, что у вас есть виртуальная овцеферма, и вам нужно создать несколько овец со схожими характеристиками.
Вместо того, чтобы создавать каждую овцу с нуля, вы можете использовать шаблон Prototype для клонирования существующих
овец. Каждая клонированная овца сохранит общие атрибуты, но при этом она поддерживает индивидуальную настройку.

Сначала мы определяем интерфейс Sheep, который служит прототипом для наших объектов-овец. Этот интерфейс объявляет
метод clone для создания копий овец.
*/