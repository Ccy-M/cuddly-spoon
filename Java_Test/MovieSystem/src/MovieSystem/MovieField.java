package MovieSystem;

public enum MovieField {
    NAME("电影名"),
    ACTOR("演员"),
    PRICE("价格"),
    SCORE("评分");

    private String name;

    MovieField(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
