public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10, Firstnum = 0, Secondnum = 1;

        for(int i=1;i<=n;i++)
        {
            System.out.println(Firstnum + ",");
            int nextnum = Firstnum + Secondnum;
            Firstnum = Secondnum;
            Secondnum = nextnum;
        }


    }
}
