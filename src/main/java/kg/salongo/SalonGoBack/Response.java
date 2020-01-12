package kg.salongo.SalonGoBack;

public class Response<T> {
    public int status = 0;
    public String message = "";
    public T data;

    public Response(T data) {
        this.data = data;
    }

    public Response(int status) {
        this.status = status;
    }

    public Response(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
