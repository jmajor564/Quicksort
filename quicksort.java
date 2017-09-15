public class quicksort
{
    public static void main(String args[])
    {
        int[] array = {540253262, 5436, -43125624,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        quicksort newNode = new quicksort();
        newNode.sort(array);
        for (int i = 0; i < array.length; i++)
        {
             if (i != array.length-1)
                 System.out.print(array[i] + ", ");
             else
                 System.out.println(array[i]);
        }
    }
    public void sort(int[] array)
    {
       int size = array.length;
       qsort(array, 0, size-1);
    }
    
    public void qsort(int[] array, int i, int j)
    {
         int pivot = findPivot(i, j);
         swap(array, pivot, j);
         
         int k = partition(array, i-1, j, array[j]);
         swap(array, k, j);
         if ((k-i) > 1)
             qsort(array, i, k-1);
         if ((j-k) > 1)
             qsort(array, k+1, j);
    }
    public int findPivot(int i, int j)
    {
        return (i+j)/2;
    }
    public void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public int partition(int[] array, int l, int r, int pivot)
    {
        do {
            while ((array[++l] - (pivot)) < 0);
            while ((r != 0) && ((array[--r] - (pivot)) > 0));
            swap(array, l, r);
        } while (l < r);
        swap(array, l, r);
        return l;                       
    }             
                                 
}