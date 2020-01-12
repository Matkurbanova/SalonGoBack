package kg.salongo.SalonGoBack.entity;

public class ServiceMaster {
private int id;
private int SubTypeServiceId;
private int typeStatus;
private String MasterName;
private String WorkExperienceYear;
private String ImageMaster;
private String price;
public ServiceMaster(){

}
public ServiceMaster(int id,int SubTypeServiceId,int typeStatus,String MasterName,String WorkExperienceYear,String ImageMaster,String price){
    this.id=id;
    this.SubTypeServiceId=SubTypeServiceId;
    this.typeStatus=typeStatus;
    this.MasterName=MasterName;
    this.WorkExperienceYear=WorkExperienceYear;
    this.ImageMaster=ImageMaster;
    this.price=price;

}

    public int getId() {
        return id;
    }

    public int getSubTypeServiceId() {
        return SubTypeServiceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSubTypeServiceId(int subTypeServiceId) {
        SubTypeServiceId = subTypeServiceId;
    }

    public int getTypeStatus() {
        return typeStatus;
    }

    public void setTypeStatus(int typeStatus) {
        this.typeStatus = typeStatus;
    }

    public String getMasterName() {
        return MasterName;
    }

    public String getWorkExperienceYear() {
        return WorkExperienceYear;
    }

    public void setWorkExperienceYear(String workExperienceYear) {
        WorkExperienceYear = workExperienceYear;
    }

    public String getImageMaster() {
        return ImageMaster;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setImageMaster(String imageMaster) {
        ImageMaster = imageMaster;
    }

    public void setMasterName(String masterName) {
        MasterName = masterName;
    }
}


