import java.util.Scanner;

public class SeachValueInArray {
    public static void main(String[] args) {
        String[] person = {"Nam","Tien","Len","Truoc"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name's person:");
        String name = scanner.nextLine();
        boolean check =false;
        for(int i = 0;i< person.length;i++){
            if(person[i].equals(name)) {
                System.out.println(name+" at index:"+i);
                check = true;
                break;
            }
        }
        if(!check)
        System.out.println("Not found");
    }
}
