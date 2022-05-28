package main.java.JDBCDemo.pojo;

public class score {
    private int id;
    private int user_id;
    private String name;
    private String score;

    public score() {
    }

    public score(int id, int user_id, String name, String score) {
        this.id = id;
        this.user_id = user_id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "score{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", name='" + name + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
