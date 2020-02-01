package kg.salongo.SalonGoBack.data;

import kg.salongo.SalonGoBack.entity.ServiceMaster;

public class ServiceMasterBySubCat extends ServiceMaster {
String name;
String phone;
String workExperienceYear;
String ImageMaster;
String Description;
String Instagram;
int typeStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWorkExperienceYear() {
        return workExperienceYear;
    }

    public void setWorkExperienceYear(String workExperienceYear) {
        this.workExperienceYear = workExperienceYear;
    }

    public String getImageMaster() {
        return ImageMaster;
    }

    public void setImageMaster(String imageMaster) {
        ImageMaster = imageMaster;
    }

    @Override
    public String getDescription() {
        return Description;
    }

    @Override
    public void setDescription(String description) {
        Description = description;
    }

    public String getInstagram() {
        return Instagram;
    }

    public void setInstagram(String instagram) {
        Instagram = instagram;
    }

    public int getTypeStatus() {
        return typeStatus;
    }

    public void setTypeStatus(int typeStatus) {
        this.typeStatus = typeStatus;
    }
}

