package pl.infoshare.structures._4_sets._2_implementations;

import java.util.*;

public class LottoGame {

    private final Random random = new Random();

    public List<LottoBall> listLotto() {
        List<LottoBall> randomNumbers = new ArrayList<>();

        do {
            randomNumbers.add(getNextRandomBall());
        } while (randomNumbers.size() < 8);

        return randomNumbers;
    }

    public Set<LottoBall> hashSetLotto() {
        Set<LottoBall> randomNumbers = new HashSet<>();

        do {
            randomNumbers.add(getNextRandomBall());
        } while (randomNumbers.size() < 8);

        return randomNumbers;
    }

    public Set<LottoBall> treeSetLotto() {
        Set<LottoBall> randomNumbers = new TreeSet<>();

        do {
            randomNumbers.add(getNextRandomBall());
        } while (randomNumbers.size() < 8);

        return randomNumbers;
    }

    public Set<LottoBall> linkedHashSetLotto() {
        Set<LottoBall> randomNumbers = new LinkedHashSet<>();

        do {
            randomNumbers.add(getNextRandomBall());
        } while (randomNumbers.size() < 8);

        return randomNumbers;
    }

    private LottoBall getNextRandomBall() {
        return new LottoBall("Yellow", getNextRandomNumber());
    }

    private Integer getNextRandomNumber() {
        int i = random.nextInt(10);
        System.out.println("Found: " + i);


        return i;
    }



}
