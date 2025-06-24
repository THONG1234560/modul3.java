public class Bai5 {
    public static void main(String[] args) {
        final int LOOP_COUNT = 100_000; // có thể giảm để test nhanh

        // String
        long startTime = System.currentTimeMillis();
        String resultString = "Hello";
        for (int i = 0; i < LOOP_COUNT; i++) {
            resultString += " World";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Stringの時間: " + (endTime - startTime) + " ms");
        System.out.println("Stringの結果: " + resultString.length());

        // StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < LOOP_COUNT; i++) {
            sb.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilderの時間: " + (endTime - startTime) + " ms");
        System.out.println("StringBuilderの結果: " + sb.length());

        // StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < LOOP_COUNT; i++) {
            sbf.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBufferの時間: " + (endTime - startTime) + " ms");
        System.out.println("StringBufferの結果: " + sbf.length());
    }
}
