package kg.salongo.SalonGoBack.entity;

import javax.persistence.Column;

public class Category {
    private int id;
    @Column(name = "nameCategory")
    private String nameCategory;
    private String image;



    public Category(){

    }
    public Category(int id, String nameCategory, String image){
        this.id=id;
        this.nameCategory=nameCategory;
        this.image=image;
    }
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;

    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getImage(){
        return image;
    }
    public void  setImage(String image){
        this.image=image;
    }
    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", nameCategory='" + nameCategory + '\'' +
                ", image='" + image +
                '}';
    }
}
