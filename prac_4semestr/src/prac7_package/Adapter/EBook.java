package prac7_package.Adapter;

interface EBook { // Интерфейс, описывающий работу с электронной книгой
    String getTitle();
    String getAuthor();
    int getPageCount();
    String getFormat();
}
