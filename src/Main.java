
public class Main
{        
    public static int myRandom(int a, int b)
    {
        int randInt = (int) (Math.random() * (b - a + 1) + a);
        return randInt;
    }
        public static int mySmallRandom(int a, int b)
    {
        return (int) (Math.random() * (b - a - 1) + (a + 1));
    }
    public static void main(String[] args)
    {
       System.out.println(mySmallRandom(2, 5));

    }
}
