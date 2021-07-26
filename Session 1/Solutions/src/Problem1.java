public class Problem1 {
    public static void main(String [] args){
        // Write your code here{
		Scanner cin = new Scanner(System.in); 
		int a = cin.nextInt();
		int b = cin.nextInt();
		boolean flag=true;
		for (int i =1;flag ; i++) 
		{
			a = a*3;
			b = b*2;
			if (a>b)
			{
					System.out.println(i);
				break;
				
			}
			else {
			    continue;
			
			}
		}

    }
}
