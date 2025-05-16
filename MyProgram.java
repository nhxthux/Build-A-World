import java.util.Scanner;
import java.util.ArrayList;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 'Item Picker'!");
        System.out.print("Please enter your character's name: ");
        String name = input.nextLine();
        System.out.print("Please enter your maximum capacity: ");
        int max = input.nextInt();
        input.nextLine();
        
        ItemPicker character = new ItemPicker(name,max);
        int number = 0;
        //ArrayList<Item> keeper = new ArrayList<Item>();
        Inventory inventory = new Inventory();
    
        while(number == 0)
        {
            System.out.println(character.toString());
            System.out.println("");
            System.out.println("You just get a new item!");
            int random = (int)(Math.random()*(3-1+1)+1);
            Item item = new Item(random);
            System.out.println(item.toString());
            System.out.println("");
            
            inventory.addItem(character, item);
            
            System.out.println(inventory.checkNumber(inventory.getInventory()));
            System.out.println("");
            
            if(inventory.checkRarity(inventory.getInventory()) >= 75)
            {
                number = 1;   
                System.out.println("You win!!!");
                System.out.println("");
            }
            
            //System.out.println(inventory.checkNumber(inventory.getInventory()));
            //System.out.println("");
            
            if (inventory.getInventory().size() == character.getMaximumCapacity())
            {
                System.out.print("Do you want to expand your inventory?(Y/N) ");
                String yn = input.nextLine();
                if(yn.equals("Y"))
                {
                    System.out.print("How many slots do you want to expand?: ");
                    int slot = input.nextInt();
                    input.nextLine();
                    character.expansion(slot);
                    System.out.println("");
                }
                else
                {
                    System.out.println("You do not have enough slots to keep going!");
                    System.out.println("");
                }
            }
            
            if(character.getStamina() < 0)
            {
                System.out.println("You lose! Do better next time!");
            }
            else if(inventory.getInventory().size() == character.getMaximumCapacity() && inventory.checkRarity(inventory.getInventory()) < 75)
            {
                System.out.println("You lose! Do better next time!");
            }
            
            System.out.print("Do you want to quit? (If yes, enter 0, if no, enter any number) ");
            int quit = input.nextInt();
            input.nextLine();
            if (quit == 0)
            {
                number = 1;
            }
        }
    }
}
