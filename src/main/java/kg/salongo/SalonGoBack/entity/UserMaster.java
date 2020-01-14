package kg.salongo.SalonGoBack.entity;

public class UserMaster {
    private int id;
    private int typeStatus;
    private String login;
    private String name;
    private String password;
    private String phone;
    private String workExperienceYear;
    private String ImageMaster;
    private String Instagram;
     public UserMaster(){

     }
    public UserMaster(int id, int typeStatus, String login,String name,String password,String phone,String workExperienceYear,
                      String ImageMaster,String Instagram){
        this.id=id;
        this.typeStatus=typeStatus;
        this.login=login;
        this.name=name;
        this.password=password;
        this.phone=phone;
        this.workExperienceYear=workExperienceYear;
        this.ImageMaster=ImageMaster;
        this.Instagram=Instagram;

}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTypeStatus() {
        return typeStatus;
    }

    public void setTypeStatus(int typeStatus) {
        this.typeStatus = typeStatus;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getInstagram() {
        return Instagram;
    }

    public void setInstagram(String instagram) {
        Instagram = instagram;
    }

    @Override
    public String toString() {
        return "UserMaster{" +
                "id=" + id +
                ", typeStatus=" + typeStatus +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", workExperienceYear='" + workExperienceYear + '\'' +
                ", ImageMaster='" + ImageMaster + '\'' +
                ", Instagram='" + Instagram + '\'' +
                '}';
    }
}
