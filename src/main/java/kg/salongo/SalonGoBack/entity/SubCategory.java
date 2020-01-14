package kg.salongo.SalonGoBack.entity;

public class SubCategory {
private int id;
private int CategoryId;
private String name;


public SubCategory(){

}
public SubCategory(int id, int CategoryId,String name){
this.id=id;
this.CategoryId=CategoryId;
this.name=name;
}
public int getId(){
return id;
}
public void setId(int id) {
    this.id = id;

}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "SubCategory{" +
                "id=" + id +
                "CategoryId"+CategoryId +
                ", name='" + name +
                '}';
    }
}

