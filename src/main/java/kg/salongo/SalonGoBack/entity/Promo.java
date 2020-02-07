package kg.salongo.SalonGoBack.entity;

public class Promo {
    private int id;
    private int UserId;
    private String newPrice;
    private String oldPrice;
    private String promoDescription;
    private String productInfo;
    private String promoImage;

    public Promo(){

    }
    public Promo(int id, int UserId,String newPrice,String oldPrice,String promoDescription,String productInfo,
                 String promoImage){
        this.id=id;
        this.UserId =UserId;
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

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
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
                ", UserMasterId=" + UserId +
                ", newPrice='" + newPrice + '\'' +
                ", oldPrice='" + oldPrice + '\'' +
                ", promoDescription='" + promoDescription + '\'' +
                ", productInfo='" + productInfo + '\'' +
                ", promoImage='" + promoImage + '\'' +
                '}';
    }
}
