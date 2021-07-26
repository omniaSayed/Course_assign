public class Problem2 {
    public static void main(String [] args){
        // Write your code here
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                if (x<100)
                {
                System.out.printf("%-15s",s1);
                System.out.printf("%03d%n",x);
                }
                else
                { 
                    System.out.printf("%-15s",s1);
                    System.out.printf("%d%n",x);
                }
                //Complete this line
            }
            System.out.println("================================");

    }
}
