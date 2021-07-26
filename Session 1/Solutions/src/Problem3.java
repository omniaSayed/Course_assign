public class Problem3 {
    public static void main(String [] args){
        // Write your code here
canner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int k=0;k<t;k++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int i=0;i<n;i++)
            {   int j =0;
                int s = a + b*(int)Math.pow(2,i);
                while(j!=i)
                {
                  s = s + b*(int)Math.pow(2,j);
                  j++;
                }    
                System.out.print(s);
                System.out.print(" ");    
            }
           
            System.out.print("\n");
        }
    }
}
