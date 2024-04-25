package lang.string.test;

/**
 * @author : yong
 * @fileName : TestString1
 * @date : 2024-04-26
 * @description :
 */
public class TestString6 {

    public static void main(String[] args) {
        // str에서 key로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라
        String str = "hello hello java, hello spring, hello jpa";
        String key = "hello";

        int index = 0;
        int count = 0;
        while(true){
            if((index = str.indexOf(key, index)) >= 0){
                index++;
                count++;
            }else{
                break;
            }
        }

        System.out.println("count = " + count);

        // 정답
        int count2 = 0;
        int index2 = str.indexOf(key);
        while(index2 >= 0){
            index2 = str.indexOf(key, index2 + 1);
            count++;
        }
    }

}
