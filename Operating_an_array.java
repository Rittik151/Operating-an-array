import java.util.*;


class Operating_an_array {
    public boolean searchEle(List<Integer> arr, int x) {
        // add code here.
        for(Integer i : arr){
            if(i==x)return true;
        }
        return false;
    }

    public void insertEle(List<Integer> arr, int y, int yi) {
        // add code here.
        arr.add(y);
        int n = arr.size()-1;
        while(n>0 && yi<n){
            int temp = arr.get(n);
            arr.set(n,arr.get(n-1));
            arr.set(n-1,temp);
            n--;
        }
    }

    public void deleteEle(List<Integer> arr, int z) {
        // add code here.
        int idx = -1;
        for(int i = 0;i<arr.size();i++){
            if(arr.get(i)==z){
                idx=i;
                break;
            }
        }
        if(idx>=0){
            for(int i = idx;i<arr.size()-1;i++){
                arr.set(i,arr.get(i+1));
            }
            arr.remove(arr.size()-1);
        }
    }
}