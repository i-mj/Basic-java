import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static void main (String[] args) {
        // Your code here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []arr=new int[n];
        // array of postion of cards
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        // sort the array
        Arrays.sort(arr);
        long max=0,min=Long.MAX_VALUE;
        long m1,m2;
        m1=(arr[n-1]-arr[1])-(n-2);
        m2=(arr[n-2]-arr[0])-(n-2);
        max=Math.max(m1,m2);

        int i=0,j=0;
        long size,stones;
        while(j<n)
        {
            size=arr[j]-arr[i]+1;
            stones=j-i+1;
            if(size>n)
                ++i;
            else
            {
                if(size==n-1 && stones==n-1)
                    min=Math.min(min,2);
                else
                    min=Math.min(min,n-stones);

                ++j;
            }
        }

        System.out.println(min+" "+max);
    }
}
