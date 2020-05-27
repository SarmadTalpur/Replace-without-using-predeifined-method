public class Replace{
    public static void main(String args[]) {
        repl("Hello World");
    }
    public static void repl(String x) {
        StringBuilder sb= new StringBuilder(x);
        for (int i=0; i<x.length(); i++) {
            if(x.charAt(i)=='l')
                sb.setCharAt(i, 'k');
        }
        System.out.print(sb);
    }
}