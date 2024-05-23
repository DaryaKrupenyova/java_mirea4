package prac7_package.Adapter;

class EBookAdapter implements Book { // Адаптер, который позволяет работать с электронными книгами через интерфейс книги
    private EBook ebook;

    public EBookAdapter(EBook ebook) {
        this.ebook = ebook;
    }

    @Override
    public String getTitle() {
        return ebook.getTitle();
    }

    @Override
    public String getAuthor() {
        return ebook.getAuthor();
    }

    @Override
    public int getPageCount() {
        return ebook.getPageCount();
    }
}
