package kg.salongo.SalonGoBack.entity;

public class Saved {
    private int UserId;
    private int ServiceId;

    public Saved(){

    }
    public Saved(int UserId,int ServiceId){
        this.UserId=UserId;
        this.ServiceId=ServiceId;

    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getServiceId() {
        return ServiceId;
    }

    public void setServiceId(int serviceId) {
        ServiceId = serviceId;
    }
    @Override
    public String toString() {
        return "Saved{" +
                "UserId=" + UserId +
                ", ServiceId='" + ServiceId +
                '}';
    }
}
