class Rotation {
   static void rotate(int array[], int n, int d)
   {
       int p = 1;
       while(p<=d)
       {
           int last = array[0];
           for(int i =0;i<n-1;i++)
           {
               array[i]=array[i+1];
           }
           array[n-1]=last;
           p++;
       }
   }
   static void print(int array[],int n)
   {
       for(int i=0;i<n;i++)
       {
           System.out.println(array[i]);
       }
   }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7};
        int n = array.length;
        int d=2;
        print(array,n);
        rotate(array,n,d);
        System.out.println("After Rotation");
        print(array,n);
    }
} 
