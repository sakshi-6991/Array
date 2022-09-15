class Rotation {
    static void rotate(int array[], int n, int d,int i)
    {
        int last = array[0];
        rotating(array,n,0);
        array[n-1]=last;
        i++;
        if(i<d)
        {
            rotate(array,n,d,i);
        }
    }
    static void rotating(int array[], int n, int i)
    {
        array[i]=array[i+1];
        i++;
        if(i<n-1)
        {
            rotating(array,n,i);
        }
    }
    static void display(int array[],int n,int i)
    {
        System.out.println(array[i]);
        i++;
        if(i<n)
        {
            display(array,n,i);
        }
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int n = array.length;
        int d = 2;
        display(array,n,0);
        rotate(array,n,d,0);
        System.out.println("After Rotation");
        display(array,n,0);
    }
} 
