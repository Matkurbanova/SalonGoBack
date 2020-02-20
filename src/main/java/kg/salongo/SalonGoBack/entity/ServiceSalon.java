package kg.salongo.SalonGoBack.entity;

public class ServiceSalon {
private int Id;
private int SalonId;
private int SubCategoryId;
private String Price;
private String Description;
private String Image;

    public ServiceSalon(){

    }
    public ServiceSalon(int Id, int SalonId, int SubCategoryId, String Price, String Description, String Image){
        this.Id=Id;
        this.SalonId=SalonId;
        this.SubCategoryId=SubCategoryId;
        this.Price=Price;
        this.Description=Description;
        this.Image=Image;   }

    public int getSubCategoryId() {
        return SubCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        SubCategoryId = subCategoryId;
    }

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
        return "ServiceSalon{" +
                "Id=" + Id +
                ", SalonId='" + SalonId + '\'' +
                "  SubCategoryId=" + SubCategoryId +
                ", Price='" + Price + '\'' +
                "  Description=" + Description +
                ", Image='" + Image +
                '}';
    }
}
