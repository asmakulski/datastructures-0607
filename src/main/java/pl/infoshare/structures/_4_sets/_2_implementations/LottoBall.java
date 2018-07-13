package pl.infoshare.structures._4_sets._2_implementations;

public class LottoBall implements Comparable<LottoBall> {

    private final String color;
    private final Integer value;

    public LottoBall(String color, Integer value) {
        this.color = color;
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public Integer getValue() {
        return value;
    }


    @Override
    public int compareTo(LottoBall o) {
        return value.compareTo(o.value);
    }
}
