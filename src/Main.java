public class Main {
    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.getExample("12*34*+");
        st.getExample("2111--*");
        st.getExample("123213");
        st.getExample("gagagag");
        st.getExample("123---");
    }
}