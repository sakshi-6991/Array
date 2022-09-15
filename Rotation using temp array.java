class Rotation {
    static void rotate(int arr[], int d, int n)
    {
        int temp[] = new int[n];
        int k=0;
        rotating(temp,arr,d,n);
        copy(temp,arr,n);
    }
    static void rotating(int temp[],int arr[],int d,int n)
    {
        int k=d;
        for(int i=0;i<n-d;i++,k++)
        {
            temp[i]=arr[k];
        }
        k=0;
        for(int i=n-d;i<n;i++,k++)
        {
            temp[i]=arr[k];
        }
    }
    static void copy(int temp[],int arr[], int n)
    {
        for(int i=0;i<n;i++)
        {
            arr[i]=temp[i];
        }
    }
    static void print(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 2;
        print(arr,n);
        rotate(arr,d,n);
        System.out.println("After rotation");
        print(arr,n);
    }
} 
