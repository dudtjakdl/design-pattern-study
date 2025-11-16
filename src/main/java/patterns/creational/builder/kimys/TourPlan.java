package patterns.creational.builder.kimys;

import java.time.LocalDate;
import java.util.List;

public class TourPlan {

    private String title;

    private int nights;

    private int days;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetailPlan> plans;

    public TourPlan(){
    }

    public TourPlan(String title, int nights, int days, LocalDate startDate, String whereToStay, List<DetailPlan> plans) {
        this.title = title;
        this.nights = nights;
        this.days = days;
        this.startDate = startDate;
        this.whereToStay = whereToStay;
        this.plans = plans;
    }

    @Override
    public String toString() {
        return "TourPlan{" +
                "title='" + title + '\'' +
                ", nights=" + nights +
                ", days=" + days +
                ", startDate=" + startDate +
                ", whereToStay='" + whereToStay + '\'' +
                ", plans=" + plans +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setWhereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
    }

    public void setPlans(List<DetailPlan> plans) {
        this.plans = plans;
    }

    public List<DetailPlan> getPlans() {
        return plans;
    }
}
