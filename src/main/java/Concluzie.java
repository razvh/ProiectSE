    public class Concluzie {
        public Concluzie(String s, Boolean flag) {
            this.s = s;
            this.flag = flag;
        }

        public String getS() {
            return s;
        }

        private final String s;

        @Override
        public String toString() {
            return "Concluzie{" +
                    "s='" + s + '\'' +
                    ", flag=" + flag +
                    '}';
        }

        Boolean flag;

        public void setFlag(Boolean flag) {
            this.flag = flag;
        }
    }
