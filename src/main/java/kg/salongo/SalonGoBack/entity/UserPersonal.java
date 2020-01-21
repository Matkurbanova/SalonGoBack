package kg.salongo.SalonGoBack.entity;

public class UserPersonal {
    private int id;
    private String login;
    private String password;
    private String phone;
    private String name;
    private String avatarimages;

    public UserPersonal() {

    }

    public UserPersonal(int id, String login,String password,String phone, String name,String avatarimages) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.phone = phone;
        this.name = name;
        this.avatarimages=avatarimages;
    }

    public UserPersonal(String login,String password,String phone, String name,String avatarimages) {
        this.login = login;
        this.password = password;
        this.phone = phone;
        this.name = name;
        this.avatarimages=avatarimages;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarimages() {
        return avatarimages;
    }

    public void setAvatarimages(String avatarimages) {
        this.avatarimages = avatarimages;
    }
    @Override
    public String toString() {
        return "UserPersonal{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", avatarimages=" + avatarimages +
                '}';
    }
}