import java.util.*;

public class Insertion {
        
    void sort(int nums[]){
        for(int i = 1; i < nums.length; i++){
            int key = nums[i];
            int j = i - 1;

            while(j >= 0 && nums[j] > key){ 
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }

        System.out.print("The sorted list is: ");
        for(int i = 0; i < nums.length - 1; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.println(nums[nums.length - 1]);

    }




    public static void main(String[] args){
        int[] unsorted =  new int[5];//{5, 14, 6, 7, 8};
        Scanner user = new Scanner(System.in); 
        System.out.println("Enter up to 5 Integers in random order to be sorted in ascending order");
        System.out.println("Enter an Integer:");
        Insertion cc = new Insertion();

        for(int i = 0; i < 5; i++){
            unsorted[i] = user.nextInt();
        }

        cc.sort(unsorted);

        
    }

   

}
