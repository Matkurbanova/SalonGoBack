package kg.salongo.SalonGoBack.entity;

public class WorkTime {
    private int SalonId;
    private int day;
    private String time_begin;
    private String time_end;

    public WorkTime() {

    }

    public WorkTime(int SalonId, int day, String time_begin, String time_end) {
        this.SalonId = SalonId;
        this.time_begin = time_begin;
        this.time_end = time_end;
    }

    public int getSalonId() {
        return SalonId;
    }

    public void setSalonId(int salonId) {
        SalonId = salonId;
    }

    @Override
    public String toString() {
        return "WorkTime{" +
                "SalonId=" + SalonId +
                ", day='" + day + '\'' +
                "  time_begin=" + time_begin +
                ", time_end='" + time_end +
                '}';
    }
}


