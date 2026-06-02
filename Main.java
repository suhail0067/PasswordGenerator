class BookSearch {
    String book[];
    int index;
    String newBook;
    String delete;

    public void Store(String[] book) {
        this.book = book;
        System.out.println("Book stored Successfully" + book);
    }

    public boolean SearchBook(String n, String name, String[] book) {
        boolean found = false;
        for (int i = 0; i < book.length; i++) {
            if (name.equalsIgnoreCase(book[i])) {
                System.out.println("book found");
                return found;
            } else {
                System.out.println("Not Found");
            }
        }
        return found;
    }

    public void Update(int operation, int index, String newBook, String delete, String temp) {
        System.out.println("Select Operation of Update:");
        switch (operation) {
            case (1):
                System.out.println("You Select insert Method");
                this.index = index;
                int n = book.length;
                this.newBook = newBook;
                for (int i = n - 1; i >= index; i--) {
                    book[i] = book[i - 1];
                }
                book[index] = newBook;
                break;

            case (2):
                System.out.println("You Select Delete Method");
                this.delete = delete;
                temp = "";
                for (int i = 0; i < book.length; i++) {
                    for (int j = 0; j < book.length - 1 - i; j++) {
                        if (delete.equalsIgnoreCase(book[j])) {
                            temp = book[j];
                            book[j] = book[j + 1];
                            book[j + 1] = temp;
                        }
                    }
                }
                break;
        }
    }
}

class Main {
    public static void main(String[] args) {
        BookSearch a = new BookSearch();
        String[] myBooks = {"Java", "Python", "Css"};
        a.Store(myBooks);

    }
}
