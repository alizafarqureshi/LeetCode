public class LC_3 {
    public static void main(String[] args) {
        int[] nums1={1,3};
        int[] nums2={2};
        int length = nums2.length + nums1.length;
        int[] newArr = new int [length];
        int pos= 0;

        for (int i : nums1){
            newArr[pos] = i;
            pos++;
        }

        for(int i: nums2){
            newArr[pos] = i;
            pos++;
        }

        int temp = 0;
// for sorting
        for (int i= 0; i<newArr.length; i++){
            for (int j = i +1 ; j< newArr.length;j++){
                if(newArr[i] > newArr[j]) {
                    temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] =temp;
                }
            }
        }

        int indexOfMedian;
        float med;
        if(newArr.length % 2 == 0){
            indexOfMedian= newArr.length/2;
            med = newArr[indexOfMedian] + (newArr[indexOfMedian - 1]);
            med = med / 2;
        }else {
            indexOfMedian = newArr.length/2;
            med = newArr[indexOfMedian];
        }

        System.out.println(med);

    }
}
