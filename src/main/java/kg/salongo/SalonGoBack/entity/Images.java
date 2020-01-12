package kg.salongo.SalonGoBack.entity;

public class Images {
    private int id;
    private int ServiceId;
    private String Image;
    public Images(){

    }
    public Images(int id,int ServiceId,String Image){
        this.id=id;
        this.ServiceId=ServiceId;
        this.Image=Image;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getServiceId() {
        return ServiceId;
    }

    public void setServiceId(int serviceId) {
        ServiceId = serviceId;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
    @Override
    public String toString() {
        return "Images{" +
                "id=" + id +
                "ServiceId=" + ServiceId +
                ", Image='" + Image +
                '}';
    }
}
