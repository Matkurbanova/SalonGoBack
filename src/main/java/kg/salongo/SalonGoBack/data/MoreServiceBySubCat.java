package kg.salongo.SalonGoBack.data;

import kg.salongo.SalonGoBack.entity.ImagesMaster;
import kg.salongo.SalonGoBack.entity.ServiceSalon;
import kg.salongo.SalonGoBack.entity.WorkTime;

import java.awt.*;
import java.util.List;

public class MoreServiceBySubCat extends ServiceSalon {
    String name;
    String address;
    String phone;
    String Description;
    int typeStatus;
    List<WorkTime> workTimes;

    @Override
    public String getDescription() {
        return Description;
    }

    @Override
    public void setDescription(String description) {
        Description = description;
    }

    public int getTypeStatus() {
        return typeStatus;
    }

    public void setTypeStatus(int typeStatus) {
        this.typeStatus = typeStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<WorkTime> getWorkTimes() {
        return workTimes;
    }

    public void setWorkTimes(List<WorkTime> workTimes) {
        this.workTimes = workTimes;
    }



}
