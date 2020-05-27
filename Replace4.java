public class Replace4{
    public static void main(String args[]) {
        repl("raza is my name. Sarmad is my name");
    }

    public static void repl(String x) {
        StringBuilder sb= new StringBuilder(x);
        sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
        int k=0;
        int count=0;
        for (int i=0; i<x.length(); i++) {
            if(sb.charAt(i)==' ') {
                count++;
                sb.setCharAt(i+1, Character.toUpperCase(sb.charAt(i+1)));
                k=i;
                for (int j = k+1; j < x.length(); j++) {
                    sb.setCharAt(k, sb.charAt(j));
                    k++;
                }
            }
        }
        for(int i=1; i<=count; i++)
            sb.setCharAt(x.length()-i, ' ');
        System.out.print(sb);
    }
}