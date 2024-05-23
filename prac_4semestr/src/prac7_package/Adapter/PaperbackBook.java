package prac7_package.Adapter;

class PaperbackBook implements Book {  // Класс, представляющий реализацию работы с книгой
    private String title;
    private String author;
    private int pageCount;

    public PaperbackBook(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
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
}
