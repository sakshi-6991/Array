import java.util.*;

class Rearrangement {
    int array[];
    Rearrangement(int n)
    {
        array = new int[n];
    }
    void insert(int n, int i, Scanner sc)
    {
        array[i] = sc.nextInt();
        i++;
        if(i<n)
            insert(n,i,sc);
        return;
    }
    void arrangement(int i, int j, int n)
    {
        rearrange(i,j,n);
        i++;
        if(i<n)
        arrangement(i,0,n);
      return;
    }
    void rearrange(int i, int j, int n)
    {
        int temp = 0;
        if(array[j]==i)
        {
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
        j++;
        if(j<n)
          rearrange(i,j,n);  
      return;
    }
    void display(int i,int n)
    {
        System.out.println(array[i]);
        i++;
        if(i<n)
            display(i,n);
        return;
    }
    public static void main(String[] args) {
        int n = 10;
        Rearrangement ra = new Rearrangement(n);
        System.out.println("Enter the number of array");
        Scanner sc = new Scanner(System.in);
        ra.insert(n,0,sc);
        ra.display(0,n);
        ra.arrangement(0,0,n);
        ra.display(0,n);
    }
}
