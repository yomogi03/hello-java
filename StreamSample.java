import java.util.Arrays;
import java.util.List;

public class StreamSample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // 偶数だけを抽出して合計を出す
        int sum = numbers.stream()          // ストリームに流す
                .filter(n -> n % 2 == 0) // 偶数だけ残す
                .mapToInt(Integer::intValue) // intに変換
                .sum();            // 合計
        
        System.out.println("偶数の合計 = " + sum); // 12
    }
}