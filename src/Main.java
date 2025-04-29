
import java.io.*;
class vowel{
    public static void main(String[] args) throws IOException{
        char letter ;
        System.out.println("Can You can the letter?");
        letter = (char)System.in.read();
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println("This word is vowel");}
        else {
            System.out.println("Thsi word is not vowel");
        }
    }
}