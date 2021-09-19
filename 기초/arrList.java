import java.util.ArrayList;

public class arrList {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();

        // 리스트 요소 추가
        al.add("박");
        al.add("김");
        al.add("최");
        System.out.println(al); // [박, 김, 최]

        al.add(1, "이");
        System.out.println(al); // [박, 이, 김, 최]

        // 해당 인덱스의 값 반환
        System.out.println(al.get(0)); // 박

        // 인덱스로 값 변경
        al.set(3, "정");
        System.out.println(al); // [박, 이, 김, 정]

        // 인덱스로 값 찾기
        al.add("박"); // [박, 이, 김, 정, 박]
        System.out.println(al.indexOf("박")); // 0
        System.out.println(al.lastIndexOf("박")); // 4

        // 값 삭제
        al.remove(4);
        System.out.println(al); // [박, 이, 김, 정]

        al.add("정"); // [박, 이, 김, 정, 정]
        al.remove("정");
        System.out.println(al); // [박, 이, 김, 정]

        // 값 포함하는지
        System.out.println(al.contains("정")); // true

        // Array로 변환
        System.out.println(al.toArray()); // [Ljava.lang.Object;@7d6f77cc

        // 배열 비우기
        al.clear();
        System.out.println(al); // []

        // 배열 비었는 지 확인
        System.out.println(al.isEmpty()); // true

        // 두 리스트 합치기
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("박");
        al1.add("김");
        al1.add("이");

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("최");
        al2.add("정");
        al2.add("박");

        al1.addAll(al2);
        System.out.println(al1); // [박, 김, 이, 최, 정, 박]

        // 한 리스트가 한 리스트 포함하는지
        System.out.println(al1.containsAll(al2)); // true

        // 리스트 해당 요소 빼고 지우기
        al1.retainAll(al2);
        System.out.println(al1); // [박, 최, 정, 박]

        // 리스트 해당 요소 지우기
        al1.removeAll(al2);
        System.out.println(al1); // []

        // 요소 개수 반환
        System.out.println(al1.size()); // 0
        System.out.println(al2.size()); // 3
    }
}
