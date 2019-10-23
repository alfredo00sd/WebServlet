package models;

//Museum pojo, java plain object
public class Museum {

    private int id;
    private String title;
    private String description;
    private static int counter = 0;

    public Museum(){

    }

    public Museum(String title, String description) {
        this.id = counter++;
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
