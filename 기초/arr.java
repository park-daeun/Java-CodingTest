import java.util.Arrays;
import java.util.Collections;

public class arr {
    public static void main(String[] args){
        String[] sarr = {"a", "b", "c", "d", "z", "e", "abc"};
        int[] iarr = {1, 2, 3, 4, 5, 6, 123, 7};

        // ArrayList로 변환
        System.out.println(Arrays.asList(sarr)); // [a, b, c, d, z, e, abc]
        
        // String으로 변환
        System.out.println(Arrays.toString(sarr)); // [a, b, c, z, e, abc]
        System.out.println(Arrays.toString(iarr)); // [1, 2, 3, 4, 5, 6, 123, 7]

        // sort, 오름차순 정렬
        Arrays.sort(sarr);
        System.out.println(Arrays.toString(sarr)); // [a, abc, b, c, d, e, z]
        Arrays.sort(iarr);
        System.out.println(Arrays.toString(iarr)); // [1, 2, 3, 4, 5, 6, 7, 123]

        // sort, 내림차순 정렬 (문자열 배열)
        Arrays.sort(sarr, Collections.reverseOrder());
        System.out.println(Arrays.toString(sarr)); // [z, e, d, c, b, abc, a]
        
        Integer[] Iarr = {1, 2, 3, 4, 5, 6, 7, 123};
        Arrays.sort(Iarr, Collections.reverseOrder());
        System.out.println(Arrays.toString(Iarr)); // [123, 7, 6, 5, 4, 3, 2, 1]

    
        // sort, 인덱싱 정렬
        Arrays.sort(sarr, 3, 6);
        System.out.println(Arrays.toString(sarr)); // [z, e, d, abc, b, c, a]
        Arrays.sort(sarr, 2, 5, Collections.reverseOrder());
        System.out.println(Arrays.toString(sarr)); // [z, e, d, b, abc, c, a]

        // 배열 복사
        String[] arr2 = Arrays.copyOf(sarr, sarr.length);
        System.out.println(Arrays.toString(arr2)); // [z, e, d, b, abc, c, a]

        // 배열 길이
        System.out.println(sarr.length); // 7
    }   
}