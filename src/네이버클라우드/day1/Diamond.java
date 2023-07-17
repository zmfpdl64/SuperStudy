package 네이버클라우드.day1;

public class Diamond {
    public static void main(String[] args) {
        int[] ins = {
                3, 5, 10
        };
        for(int i = 0; i < ins.length; i++) {
            createDiamond(2*ins[i]-1);
        }
    }
    public static void createDiamond(int size) {
        int mid = (int) size / 2;
        for(int i = 0; i <= mid; i++ ){
            for(int j = 0; j < size; j++) {
                if(mid - i <= j && mid + i >= j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = mid-1; i >= 0; i-- ){
            for(int j = 0; j < size; j++) {
                if(mid - i <= j && mid + i >= j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
