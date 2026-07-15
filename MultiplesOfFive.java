public class MultiplesOfFive {
    public static void main(String[] args){
        int[] arr={5,2,10,15,32};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%5==0){
                System.out.println(arr[i]);
            }
        }
    }
    
}
