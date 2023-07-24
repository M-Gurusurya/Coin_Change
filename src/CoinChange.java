import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        int total_amount=scanner.nextInt();

        System.out.println(findCoinChange(array,size,total_amount));
    }
    public static int findCoinChange(int array[],int size,int total_amount)
    {
        int sum=0;
        Arrays.sort(array);
        int count=0;
        int number=size-1;
        while (sum!=total_amount && number>=0)
        {
            if(sum+array[number]<=total_amount)
            {
                sum+=array[number];
                count++;
            }
            else
                number--;
        }
        if(sum==total_amount)
        {
            return count;
        }
        else
        {
            return -1;
        }
    }
}
