class Rotation {
    static void rotate(int array[], int n, int d,int i)
    {
       int temp[] = new int[n];
       copying(array,temp,n-d,0,d);
       copying(array,temp,n,n-d,0);
       copying(temp,array,n,0,0);
    }
    static void copying(int array[], int temp[],int k,int l,int j)
    {
        temp[l]=array[j];
        j++;
        l++;
        if(l<k)
        {
            copying(array,temp,k,l,j);
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
