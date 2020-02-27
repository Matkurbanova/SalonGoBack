package kg.salongo.SalonGoBack.entity;

public class ServiceMaster {
    private int id;
    private int UserMasterId;
    private int subCategoryId;
    private String Price;
    private String workExperienceYear;
    private String Description;
    private String Image;

    public ServiceMaster() {

    }

    public ServiceMaster(int id, int UserMasterId, String Price, String workExperienceYear, String Description, String Image) {
        this.id = id;
        this.UserMasterId = UserMasterId;
        this.Price = Price;
        this.workExperienceYear=workExperienceYear;
        this.Description = Description;
        this.Image = Image;
    }

    public String getWorkExperienceYear() {
        return workExperienceYear;
    }

    public void setWorkExperienceYear(String workExperienceYear) {
        this.workExperienceYear = workExperienceYear;
    }

    public int getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        this.subCategoryId = subCategoryId;
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
                ", subCategoryId=" + subCategoryId +
                ", Price='" + Price + '\'' +
                ", workExperienceYear='" + workExperienceYear + '\'' +
                ", Description='" + Description + '\'' +
                ", Image='" + Image + '\'' +
                '}';
    }
}
