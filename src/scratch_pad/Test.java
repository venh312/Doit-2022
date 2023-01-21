package scratch_pad;

public class Test {
    enum Login {
        LOCK("test");
        private String value;
        Login(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


    public static void main(String[] args) {
        System.out.println(Login.LOCK);
        System.out.println(Login.LOCK.getValue());
    }
}
