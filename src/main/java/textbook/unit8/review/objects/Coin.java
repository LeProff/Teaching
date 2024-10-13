package textbook.unit8.review.objects;


import tech.lpdev.utils.MathUtil;

public class Coin {
    private int faceUp;

    public Coin() {
        flipCoin();
    }

    public int showFace() {
        return faceUp;
    }

    public void flipCoin() {
        faceUp = MathUtil.random(0, 1);
    }
}
