package Recursion;

public class RecursionExample3 {
    
    //매개변수의 명시화 : 순차탐색
    int search(int[] data, int begin, int end, int target){
        if(begin>end)
            return -1;
        else if(target == data[begin])
            return begin;
        else
            return search(data,begin+1,end,target);
    }

    // 순차탐색 다른버전
    int search1(int[] data, int begin, int end, int target){
        if(begin>end)
            return -1;
        else if(target == data[end])
            return end;
        else
            return search1(data,begin,end-1,target);
    }

    // 순차탐색 다른버전
    int search2(int[] data, int begin, int end, int target){
        if(begin>end)
            return -1;
        else{
            int middle = (begin + end)/2;
            if(target == data[middle])
                return middle;
            int index = search2(data, begin,middle-1,target);
            if(index != -1)
                return index;
            else
                return search2(data,middle+1,end,target);
        }
    }

    //최대값 찾기
    int findMax(int[] data, int begin, int end){
        if(begin == end)
            return begin;
        else
            return Math.max(data[begin], findMax(data, begin+1, end));
    }

    //최대값 찾기 다른버전
    int findMax1(int[] data, int begin, int end){
        if(begin == end)
            return begin;
        else{
            int middle = (begin+end)/2;
            int max1 = findMax1(data, begin, middle);
            int max2 = findMax1(data, middle+1, end);
            return Math.max(max1, max2);
        }
    }

    //이진검색 Binary Search(데이터가 크기 순으로 정렬 되었을때 사용 가능함).
    public static int binarySearch(String[] items, String target, int begin, int end){
        if(begin > end)
            return -1;
        else{
            int middle = (begin + end)/2;
            int compResult = target.compareTo(items[middle]);
            if(compResult == 0)
                return middle;
            else if(compResult < 0)
                return binarySearch(items, target, begin, middle-1);
            else
                return binarySearch(items, target, middle+1, end);
        }
    }

}
