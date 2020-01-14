package kg.salongo.SalonGoBack.entity;

public class ImagesSalon {
    private int id;
    private int ServiceSalonId;
    private String Image;
    public ImagesSalon(){

    }
    public ImagesSalon(int id, int ServiceSalonId, String Image){
        this.id=id;
        this.ServiceSalonId=ServiceSalonId;
        this.Image=Image;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getServiceSalonId() {
        return ServiceSalonId;
    }

    public void setServiceSalonId(int serviceSalonId) {
        ServiceSalonId = serviceSalonId;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    @Override
    public String toString() {
        return "ImagesSalon{" +
                "id=" + id +
                ", ServiceSalonId=" + ServiceSalonId +
                ", Image='" + Image + '\'' +
                '}';
    }
}
