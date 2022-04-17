package main.java.employee.MovieBuy;

import java.util.Date;

/*
    电影类
 */
public class Movie {
    private String movieNmae; // 电影名称
    private String lead;      // 主演
    private double score;     // 评分
    private double longTime;  // 时长
    private double price;     // 价格
    private int number;       // 余票
    private Date startTime;   // 放映时间

    public Movie() {
    }

    public Movie(String movieNmae, String lead, double score, double longTime, double price, int number, Date startTime) {
        this.movieNmae = movieNmae;
        this.lead = lead;
        this.score = score;
        this.longTime = longTime;
        this.price = price;
        this.number = number;
        this.startTime = startTime;
    }

    public String getMovieNmae() {
        return movieNmae;
    }

    public void setMovieNmae(String movieNmae) {
        this.movieNmae = movieNmae;
    }

    public String getLead() {
        return lead;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getLongTime() {
        return longTime;
    }

    public void setLongTime(double longTime) {
        this.longTime = longTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return movieNmae + "    " +
                lead + "    " +
                score + "    " +
                longTime + "    " +
                price + "    " +
                number + "    " +
                startTime;
    }
}
