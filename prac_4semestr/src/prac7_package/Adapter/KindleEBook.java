package prac7_package.Adapter;

class KindleEBook implements EBook { // Класс, представляющий реализацию работы с электронной книгой
    private String title;
    private String author;
    private int pageCount;
    private String format;

    public KindleEBook(String title, String author, int pageCount, String format) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.format = format;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String getFormat() {
        return format;
    }
}
