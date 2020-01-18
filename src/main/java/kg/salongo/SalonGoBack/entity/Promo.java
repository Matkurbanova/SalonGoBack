package kg.salongo.SalonGoBack.entity;

public class Promo {
    private int id;
    private int SalonId;
    private int UserMasterId;
    private String newPrice;
    private String oldPrice;
    private String promoDescription;
    private String productInfo;
    private String promoImage;

    public Promo(){

    }
    public Promo(int id, int SalonId, int UserMasterId,String newPrice,String oldPrice,String promoDescription,String productInfo,
                 String promoImage){
        this.id=id;
        this.SalonId=SalonId;
        this.UserMasterId=UserMasterId;
        this.newPrice=newPrice;
        this.oldPrice=oldPrice;
        this.promoDescription=promoDescription;
        this.productInfo=productInfo;
        this.promoImage=promoImage;


}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalonId() {
        return SalonId;
    }

    public void setSalonId(int salonId) {
        SalonId = salonId;
    }

    public int getUserMasterId() {
        return UserMasterId;
    }

    public void setUserMasterId(int userMasterId) {
        UserMasterId = userMasterId;
    }

    public String getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getPromoDescription() {
        return promoDescription;
    }

    public void setPromoDescription(String promoDescription) {
        this.promoDescription = promoDescription;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getPromoImage() {
        return promoImage;
    }

    public void setPromoImage(String promoImage) {
        this.promoImage = promoImage;
    }

    @Override
    public String toString() {
        return "Promo{" +
                "id=" + id +
                ", SalonId=" + SalonId +
                ", UserMasterId=" + UserMasterId +
                ", newPrice='" + newPrice + '\'' +
                ", oldPrice='" + oldPrice + '\'' +
                ", promoDescription='" + promoDescription + '\'' +
                ", productInfo='" + productInfo + '\'' +
                ", promoImage='" + promoImage + '\'' +
                '}';
    }
}
