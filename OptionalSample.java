import java.util.Optional;

public class OptionalSample {
    public static void main(String[] args) {
        String value = "Hello";

        Optional<String> opt = Optional.ofNullable(value);

        // 値があれば表示、なければ「なし」
        String result = opt.orElse("なし");
        System.out.println("結果: " + result);

        // 値があれば大文字にして表示
        opt.map(String::toUpperCase)
           .ifPresent(v -> System.out.println("大文字: " + v));
    }
}