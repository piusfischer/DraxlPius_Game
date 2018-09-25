import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        List<Integer> zahlen = new ArrayList<>();

        Random rand=new Random();

        for(int i=1;i<=10;i++)
        {
            zahlen.add(rand.nextInt(100)+1);
        }

        List<Integer> sorZahlen = new ArrayList<>();
        while(zahlen.size()>0)
        {
            int min=zahlen.get(0);
            int index=0;
            for(int i=0; i<zahlen.size();i++)
            {
                int currentNumber = zahlen.get(i);
                if(min>currentNumber)
                {
                    min = currentNumber;
                    index=i;
                }
            }
            zahlen.remove(index);
            sorZahlen.add(min);
        }
        for(int e=0;e<sorZahlen.size();e++)
        {
            System.out.println(sorZahlen.get(e));
        }
    }
}
