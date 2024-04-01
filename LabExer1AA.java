import java.util.Scanner;
public class LabExer1AA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Type your favorite number.");
        int faveNumber = s.nextInt();
        
        System.out.print("Type your favorite cartoon or anime characters.");
        String faveCartChar = s.next(); 
        
        System.out.print("Enter your middle initials.");
        char mi = s.next().charAt(0);
        
        System.out.println(faveNumber + " is my favorite number.");
        System.out.println("I love " + faveCartChar + "!");
        System.out.println("My name is Justin " + mi + ". Alcantara.");
        
        char[] nickName = {'T', 'i','n'};
        int length = nickName.length;
        char[] nickNameArray = new char[length];
        for(int i = 0; i < nickName.length; i++){
            nickNameArray[i] = nickName[i];
        }
        System.out.print("You can call me " + new String(nickNameArray) + ".");
    }    
}
