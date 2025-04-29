
public class for_loop {
    public static void main(String[] args){
        int i;
        for(i=0; i<=10; i++){
            System.out.println(i);
        }

        char ch;
        for(ch='A'; ch<='Z'; ch++){
            System.out.println(ch+ "=" +(int)ch);
        }
        for (int b=1; b<=5; b++) {
            for (int a = 1; a <= 12; a++)
                System.out.println(b + "*" + a + "=" + 2 * a);

        }
    }
}

