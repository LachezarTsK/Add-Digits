
public class Soltuion {

    public int addDigits(int num) {
        return (num > 0) ? (1 + (num - 1) % 9) : 0;
    }
}
