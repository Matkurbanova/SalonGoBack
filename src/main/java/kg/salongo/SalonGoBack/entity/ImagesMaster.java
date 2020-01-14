package kg.salongo.SalonGoBack.entity;

public class ImagesMaster {
    private int id;
    private int ServiceMasterId;
    private String Image;
    public ImagesMaster(){

    }
    public ImagesMaster(int id, int ServiceMasterId, String Image){
        this.id=id;
        this.ServiceMasterId=ServiceMasterId;
        this.Image=Image;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getServiceMasterId() {
        return ServiceMasterId;
    }

    public void setServiceMasterId(int serviceMasterId) {
        ServiceMasterId = serviceMasterId;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    @Override
    public String toString() {
        return "ImagesMaster{" +
                "id=" + id +
                ", ServiceMasterId=" + ServiceMasterId +
                ", Image='" + Image + '\'' +
                '}';
    }
}
