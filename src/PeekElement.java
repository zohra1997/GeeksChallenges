public class PeekElement {
    public static int peek (int [] array){
        int high = array.length;
        int low=0;
        while(low<=high){
            int mid =  low + (high-low)/2;
            if((mid == 0 || array[mid]>=array[mid-1] )&& (array[mid]>array[mid+1] || mid == array.length-1))
                return array[mid];
            else if (array[mid]<array[mid-1] || mid >0){
                high = mid-1;
            }
            else if (array[mid]<array[mid+1])
                low=array[mid]+1;

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new PeekElement().peek(new int [] {10, 20, 15, 2, 23, 90, 67}));
    }
}
