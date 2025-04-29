import org.w3c.dom.ls.LSOutput;

import java.io.*;
public class if_else {
        public static void main(String[] args) throws IOException {
            char ch ,answer = 'K';
            System.out.println("Can you guess the letter?");
            ch = (char)System.in.read();

            if(ch == answer)
                System.out.println("***Right***");
            else
                System.out.println("***Wrong, Try again***");
            if(ch<answer)
                System.out.println("Too Low");
            else
                System.out.println("Too High");
        }
    }




