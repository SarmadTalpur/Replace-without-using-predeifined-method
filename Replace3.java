public class Replace3{
    public static void main(String args[]) {
        repl("This is a cow. Cow is animal");
    }
    public static void repl(String x) {
        StringBuilder sb= new StringBuilder(x);
        for (int i=0; i<x.length(); i++) {
            if(x.charAt(i)=='c' || x.charAt(i)=='C') {
                if(x.charAt(i+1)=='o' || x.charAt(i+1)=='O') {
                    if(x.charAt(i+2)=='w' || x.charAt(i+2)=='W') {
                        if(x.charAt(i-2)=='.')
                            sb.setCharAt(i, 'C');
                        else
                            sb.setCharAt(i, 'c');
                        sb.setCharAt(i+1, 'a');
                        sb.setCharAt(i+2, 't');
                    }
                }
            }
        }
        System.out.print(sb);
    }
}