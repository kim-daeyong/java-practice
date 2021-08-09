import java.util.Arrays;

public class TestEnum {

    public enum SampleEnum {
            
        // APPLE,
        // MANGO,
        // TOMATO;
        
        Y("1", true),
        N("2", false),
        NONE("None", false);

        private String num;
        private boolean bool;

        SampleEnum(String num, boolean bool) {
            this.num = num;
            this.bool = bool;
        }

        public String getNumber() {
            return num;
        }

        public boolean isBoolean() {
            return bool;
        }

    }

    public static void main(String[] args) {
        // TestEnum test = TestEnum.APPLE;
        SampleEnum test = SampleEnum.Y;
        SampleEnum test2 = SampleEnum.N;
        SampleEnum test3 = SampleEnum.NONE;
        System.out.println(test);
        System.out.println(test.ordinal());
        System.out.println(test2.ordinal());
        System.out.println(test3.ordinal());
        System.out.println(test3.compareTo(test2));
        System.out.println(test.compareTo(test3));
        System.out.println(test.name());
        System.out.println(SampleEnum.valueOf("N").getNumber());
        System.out.println(SampleEnum.valueOf("N").isBoolean());
        SampleEnum[] values = SampleEnum.values();
        Arrays.stream(values).forEach(System.out::println);
    }


}

