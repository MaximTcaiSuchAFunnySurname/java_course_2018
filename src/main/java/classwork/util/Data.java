package classwork.util;

public class Data {
    private Day day;
    private Month month;

    public Data(Day day, Month month) {
        this.day = day;
        this.month = month;
    }

    @Override
    public String toString() {
        return "Data{" +
                "day=" + day +
                ", month=" + month +
                '}';
    }

}
