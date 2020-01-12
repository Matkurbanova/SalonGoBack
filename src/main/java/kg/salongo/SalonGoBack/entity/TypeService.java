package kg.salongo.SalonGoBack.entity;

public class TypeService {
    private int id;
    private String nameService;
    private String image;
    public TypeService(){

    }
    public TypeService(int id,String nameService,String image){
        this.id=id;
        this.nameService=nameService;
        this.image=image;
    }
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;

    }
    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameServicee) {
        this.nameService = nameServicee;
    }
    public String getImage(){
        return image;
    }
    public void  setImage(String image){
        this.image=image;
    }
    @Override
    public String toString() {
        return "TypeService{" +
                "id=" + id +
                ", nameService='" + nameService + '\'' +
                ", image='" + image +
                '}';
    }
}
