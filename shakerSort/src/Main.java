import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static ArrayList<Integer> getRandomList(int size)
    {
        Random rand=new Random();
        ArrayList<Integer> zahlen =new ArrayList<>();
        for(int i=0;i<size; i++)
        {
            zahlen.add(rand.nextInt(500)+1);
        }
        return zahlen;
    }


    public static void main(String[] args) {


        ArrayList<Integer> zahlen = getRandomList(100);



        int x=0;
        int y=0;

        long startTime=System.nanoTime();
        int s=zahlen.size()-1;
        for(int b=0;b<s;b++) {


            for (int a = 0; a <s; a++) {
                if (zahlen.get(a) > zahlen.get(a + 1)) {
                    x = zahlen.get(a);
                    zahlen.set(a,zahlen.get(a+1));
                    zahlen.set(a + 1,x);
                }
            }
            for(int a=s;a>0;a--)
            {
                if(zahlen.get(a)<zahlen.get(a-1))
                {
                    y=zahlen.get(a);
                    zahlen.set(a,zahlen.get(a-1));
                    zahlen.set(a-1,y);
                }

            }
        }
        long stopTime= System.nanoTime();
        long lapTime=stopTime-startTime;

        for(int e=0;e<zahlen.size();e++)
        {
            System.out.println(zahlen.get(e));
        }
        System.out.println("Die benötigte Zeit war: "+lapTime);



    }
}
