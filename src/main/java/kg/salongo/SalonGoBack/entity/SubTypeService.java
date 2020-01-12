package kg.salongo.SalonGoBack.entity;

public class SubTypeService {
private int id;
private String name;


public SubTypeService(){

}
public SubTypeService(int id, String name){
this.id=id;
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
        return "SubTypesService{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }
}

