package assignments.assessmentsweek3.problem1;

public class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    protected boolean isAvailable = true;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LibraryItem(int itemId, String title, String author) {
        if (itemId <= 0) {
            throw new IllegalArgumentException("Kindly add the missing field, itemId");
        }
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Kindly add the missing field title.");
        }
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Kindly add the missing field author.");
        }

        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }


    public void checkOut() {
        if (!isAvailable) {
            throw new IllegalStateException("Sorry, the Library Item is not available currently.");
        }
            isAvailable = false;
    }

    public void returnItem() {
        isAvailable = true;
    }

    public void displayDetails() {
        System.out.println("ITEM ID: "+ getItemId());
        System.out.println("TITLE: "+ getTitle());
        System.out.println("AUTHOR: "+ getAuthor());
    }
}
