import java.util.ArrayList;

public class Find_all_elements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,6,4,4};
        System.out.println(findall(arr,4,0,new ArrayList<>()));
    }
    static ArrayList<Integer> findall(int[] arr, int target, int index,ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findall(arr, target, index+1, list);
    }
}
