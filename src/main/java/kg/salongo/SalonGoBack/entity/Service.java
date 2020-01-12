package kg.salongo.SalonGoBack.entity;

public class Service {
private int Id;
private int SalonId;
private int SubTypeServiceId;
private String Price;
private String Description;
private String Image;
    public Service(){

    }
    public Service(int Id,int SalonId,int SubTypeServiceId,String Price,String Description,String Image){
        this.Id=Id;
        this.SalonId=SalonId;
        this.SubTypeServiceId=SubTypeServiceId;
        this.Price=Price;
        this.Description=Description;
        this.Image=Image;   }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getSalonId() {
        return SalonId;
    }

    public void setSalonId(int salonId) {
        SalonId = salonId;
    }

    public int getSubTypeServiceId() {
        return SubTypeServiceId;
    }

    public void setSubTypeServiceId(int subTypeServiceId) {
        SubTypeServiceId = subTypeServiceId;
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
        return "Service{" +
                "Id=" + Id +
                ", SalonId='" + SalonId + '\'' +
                "  SubTypeServiceId=" + SubTypeServiceId +
                ", Price='" + Price + '\'' +
                "  Description=" + Description +
                ", Image='" + Image +
                '}';
    }
}
