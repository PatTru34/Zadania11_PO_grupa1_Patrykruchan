import pl.imiajd.truchan.Pair;

public class PairDemo {

    public static  void main(String[] args)
    {
        Pair para=new Pair(3,4);
        System.out.print(para.getFirst());
        System.out.print(para.getSecond());

        para.Swap();
        System.out.print(para.getFirst());
        System.out.print(para.getSecond());
    }

}