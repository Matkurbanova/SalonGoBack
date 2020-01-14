package kg.salongo.SalonGoBack.entity;

public class ServiceMaster {
    private int id;
    private int UserMasterId;
    private String Price;
    private String Description;
    private String Image;

public ServiceMaster() {

}
    public ServiceMaster(int id,int UserMasterId,String Price,String Description,String Image){
    this.id=id;
    this.UserMasterId=UserMasterId;
    this.Price=Price;
    this.Description=Description;
    this.Image=Image;


}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserMasterId() {
        return UserMasterId;
    }

    public void setUserMasterId(int userMasterId) {
        UserMasterId = userMasterId;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    @Override
    public String toString() {
        return "ServiceMaster{" +
                "id=" + id +
                ", UserMasterId=" + UserMasterId +
                ", Price='" + Price + '\'' +
                ", Description='" + Description + '\'' +
                ", Image='" + Image + '\'' +
                '}';
    }
}
