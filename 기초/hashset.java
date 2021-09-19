import java.util.HashSet;

public class hashset {
    public static void main(String[] args){
        HashSet<String> hm = new HashSet<String>();

        // 값 추가
        hm.add("박");
        hm.add("박");
        hm.add("이");
        hm.add("최");
        System.out.println(hm); // [이, 박, 최]

        // 컬렉션 추가
        HashSet<String> hm2 = new HashSet<String>();
        hm2.add("정");
        hm2.add("김");
        hm2.add("박");
        hm.addAll(hm2);
        System.out.println(hm); // [김, 이, 박, 최, 정]

        
    }
}
