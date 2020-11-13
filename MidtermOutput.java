
import java.util.ArrayList;
import java.util.Scanner;

public class MidtermOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> entryNames = new ArrayList<>();
        entryNames.add("Anna");
        entryNames.add("Victoria");
        ArrayList<Integer> entryAges = new ArrayList<>();
        entryAges.add(18);
        entryAges.add(20);
        boolean loop = true;
        do {
        System.out.println("=======Options========"
                    + "\n1.Add Entry"
                    + "\n2.Delete Entry"
                    + "\n3.View all Entries"
                    + "\n4.Update an Entry"
                    + "\n0.Exit");            
            System.out.print("Select an option: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("=======Add Entry========");
                    System.out.print("Enter Name: ");
                    entryNames.add(sc.next());
                    System.out.print("Enter Age: ");
                    entryAges.add(sc.nextInt());
                    break;
                    
                case 2:
                    System.out.println("======Delete Entry======");
                    System.out.print("Enter Name to Delete: ");
                    String delName = sc.next();
                    boolean foundName = false;
                    for(int i = 0; i<entryNames.size(); i++) {
                        if(delName.equals(entryNames.get(i))) {
                            entryNames.remove(i);
                            entryAges.remove(i);
                            System.out.println(delName + " has been deleted!");
                            foundName = true;
                        }
                    }
                    if(!foundName)
                        System.out.println(delName + " is not in the list");
                    break;                     
                    
                case 3:
                    System.out.println("=======View all Entries======");
                    for(int i = 0; i<entryNames.size(); i++) {
                        System.out.println(entryNames.get(i) + " is " + entryAges.get(i));
                    }
                    break;       
                    
                case 4:
                    System.out.println("======Update an Entry=======");
                    System.out.print("Enter Name you want to update: ");
                    String findName = sc.next();
                    boolean foundName2 = false;
                    for(int i = 0; i<entryNames.size(); i++) {
                        if(findName.equals(entryNames.get(i))) {
                            System.out.print("Enter New Name: ");
                            String newName = sc.next();
                            entryNames.set(i, newName);
                            
                            System.out.print("Enter New Age: ");
                            int newAge = sc.nextInt();
                            entryAges.set(i, newAge);
                            foundName2 = true;
                        }
                    }
                       if(!foundName2)
                           System.out.println(findName + " is not in the list");
                    break;                    
                    
                case 0:
                    loop = false;
                    break;
                    
                default:
                    System.out.println("Invalid option");
                    break;
               }
            
            }while(loop);
        }
    }
