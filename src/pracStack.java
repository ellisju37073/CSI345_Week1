import java.util.*;

public class pracStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        st.push("Blue");
        st.push("Orange");
        st.push("Purple");
        st.push("Pink");

        System.out.println(st);
        System.out.println(st.peek());

        System.out.println(st.pop());
        st.pop();
        System.out.println(st);


    }

}
