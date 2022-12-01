public class Book {
    public String title;
    public String author;
    public double isbn;
    public int pages;
    public BookType type;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("Autor: %s\n", this.author));
        stringBuilder.append(String.format("Titol: %s\n", this.title));
        stringBuilder.append(String.format("Pagines: %s\n", this.pages));
        stringBuilder.append(String.format("ISBN: %s\n", this.isbn));
        stringBuilder.append(String.format("Tipus: %s\n", this.type));

        return stringBuilder.toString();
    }
}
