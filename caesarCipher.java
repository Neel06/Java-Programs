package BE_SEM_6;

import java.util.Scanner;

public class caesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter PlainText: ");
        String plainText = scan.nextLine().toLowerCase();

        System.out.println("Enter Private Key: ");
        int key = scan.nextInt();

        encryption(plainText,key);
    }

    public static void encryption(String plainText, int key){

        char[] message = plainText.toCharArray();   //converts plainText into array;
        char[] temp = new char[message.length];     //to Store encrypted values;

        for (int i = 0 ; i < message.length; i++) {
            if (message[i]== ' '){
                temp[i]= ' ';
            }
            else {
                if ((char)(message[i] + key) >= 'z'){
                    temp[i] = (char) (((message[i]  + key) % 26)+97) ;
                }
                else {
                    temp[i] = (char) ((message[i]) + key);
                }
            }
        }
        System.out.print("Encrypted Message: ");
        System.out.print(temp);
    }
}
