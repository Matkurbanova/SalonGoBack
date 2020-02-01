package kg.salongo.SalonGoBack.entity;
//ALT+INS=Getter Setter...
public class UserSalon {
    private int id;
    private String login;
    private String name;
    private String password;
    private String phone;
    private String address;
    private String description;
    private String instaLogin;
    private String logoSalon;
    private int typeStatus;
    private String token;

    public UserSalon() {
    }

    public UserSalon(String login, String name, String password, String phone, String address, String description, String instaLogin, String logoSalon,int typeStatus,String token){
        this.login=login;
        this.name=name;
        this.password=password;
        this.phone=phone;
        this.address=address;
        this.description=description;
        this.instaLogin=instaLogin;
        this.logoSalon=logoSalon;
        this.typeStatus=typeStatus;
        this.token=token;
    }
    public UserSalon(int id,String login,String name,String password,String phone,String address,String description,String instaLogin,String logoSalon,int typeStatus,String token){
        this.id=id;
        this.login=login;
        this.name=name;
        this.password=password;
        this.phone=phone;
        this.address=address;
        this.description=description;
        this.instaLogin=instaLogin;
        this.logoSalon=logoSalon;
        this.typeStatus=typeStatus;
        this.token=token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;

    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name=name;

    }
    public String getPassword(){
        return password;

    }
    public void setPassword(String password){
        this.password=password;
    }

public String getPhone(){
        return  phone;
}

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstaLogin() {
        return instaLogin;
    }

    public void setInstaLogin(String instaLogin) {
        this.instaLogin = instaLogin;
    }

    public String getLogoSalon() {
        return logoSalon;
    }

    public void setLogoSalon(String logoSalon) {
        this.logoSalon = logoSalon;
    }

    public int getTypeStatus() {
        return typeStatus;
    }

    public void setTypeStatus(int typeStatus) {
        this.typeStatus = typeStatus;
    }

    @Override
    public String toString() {
        return "UserSalon{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                ", instaLogin='" + instaLogin + '\'' +
                ", logoSalon='" + logoSalon + '\'' +
                ", typeStatus=" + typeStatus +
                ", token='" + token + '\'' +
                '}';
    }
}
