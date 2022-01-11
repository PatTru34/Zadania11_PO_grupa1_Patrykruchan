import pl.imiajd.truchan.Pair;
import pl.imiajd.truchan.PairUtil;

import java.util.ArrayList;

public class PairUtilDemo {
    public static void main(String[] args)
    {
        Pair para1=new Pair(3,4);

        System.out.print(para1.getFirst());
        System.out.print(para1.getSecond());
        para1=PairUtil.swap(para1);
        System.out.print(para1.getFirst());
        System.out.print(para1.getSecond());
    }

}