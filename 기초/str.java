public class str {
    public static void main(String[] args){
        String str = "abcde";

        // 문자열의 길이
        System.out.println(str.length()); // 5

        // 문자열이 비어있는 지 확인
        System.out.println(str.isEmpty()); // false

        // 문자 반환
        System.out.println(str.charAt(3)); // d
        
        // 문자 배열 복사
        char[] c = new char[4];
        str.getChars(0, 3, c, 0);
        System.out.println(c); // abc

        // 문자열 비교
        System.out.println(str.equals("abcde")); // true

        System.out.println(str.compareTo("abcde")); // 0
        System.out.println(str.compareTo("ab")); // 3
        System.out.println(str.compareTo("abcdg")); // -2

        // 문자열 위치하는 인덱스 반환
        System.out.println(str.indexOf("cd")); // 2

        // 문자열 마지막 위치
        System.out.println("abcabcabc".lastIndexOf("b")); // 7

        // 문자열 인덱싱, 문자열 자르기
        System.out.println(str.substring(3)); // de
        System.out.println(str.substring(1, 4)); // bcd

        // 문자열 합치기
        System.out.println(str.concat("fg")); // abcdefg
        System.out.println(str + "hij"); // abcdehij

        // 문자열 치환, 문자열 교체
        System.out.println("abcabcabc".replace("ab", "o")); // ocococ

        // 문자열 포함
        System.out.println(str.contains("abc")); // true

        // 문자열 분리
        String[] str2 = "hi my name is".split(" ");
        
        for(int i=0; i<4; i++){
            System.out.printf(str2[i] + "/");
        } // hi/my/name/is/
        System.out.println();

        // 문자열 공백 제거
        System.out.println("\t        bye        \n\n".trim()); // bye
    }
}
