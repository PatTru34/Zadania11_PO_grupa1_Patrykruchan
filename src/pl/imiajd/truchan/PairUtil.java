package pl.imiajd.truchan;

public class PairUtil {
    public static Pair swap(Pair para)
    {
        return new Pair (para.getSecond(),para.getFirst());
    }
}