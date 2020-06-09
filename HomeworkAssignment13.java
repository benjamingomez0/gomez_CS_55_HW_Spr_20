import java.util.Scanner;

class HomeworkAssignment13 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int selection =0;
        LoginSystem ls = new LoginSystem();
       ls.showStatus();
       ls.showMenu();
       while(selection!= -999)
       {
           selection = in.nextInt();
           switch(selection)
           {
               case 1:  ls.login();
                        ls.showStatus();
                        ls.showMenu();

                        break;
               case 2 :// ls.logout();
                        ls.showMenu();
                        break;
               case 3 :// ls.search();
                        ls.showMenu();
                        break;
               case 4 : selection = -999;
                        break;
                default : System.out.println("Invalid entry. Please enter a number from 1 - 4.");
                ls.showMenu();
           }
       }
       in.close();
    }
    
}
class LoginSystem
{
   Scanner in = new Scanner(System.in);

   // 2-dimensional String array holding Lab#s and corresponding Computer#s
   private String [][] labs = new String [4][10];
   
   // constructor
   LoginSystem(){ };

   // Show Status 
    public void showStatus()
    {
            System.out.println("STATUS");
            System.out.println("Lab#      Computers");
            for(int i = 0;i< this.labs.length; i++)
            {
                System.out.print(i+1 + "         ");
                for(int j = 0; j < this.labs[i].length; j++)
                {
                    System.out.print(j+1+":");
                    if(this.labs[i][j]==null || this.labs[i][j] == "")
                    {
                        System.out.print(" empty ");
                    }
                    else
                    {
                        System.out.print(" " + this.labs[i][j] + " ");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
    }
   // Show Menu
   public void showMenu()
   {
        System.out.println("SELECTION MENU");
        System.out.println("1. LOGIN");
        System.out.println("2. LOGOUT");
        System.out.println("3. SEARCH");
        System.out.println("4. QUIT");
   };
   // Login 
   public void login()
   {
    
       int labNum;
       int compNum;

       System.out.println("Enter your 5-character ID to login: ");
       String login = in.nextLine();

       while(login.length() > 5 || login.length() <= 4 || login == "empty")
       {
           System.out.println("Invalid entry please make sure entry is 5 characters long");
           System.out.println("Enter your 5-character ID to login: ");
           login = in.nextLine();
       }

       //lab number entry
       System.out.println("Please enter the lab number: ");
       labNum = in.nextInt();
       //lab num check
       while(labNum < 1 || labNum > 4)
       {
        System.out.println("Invalid entry, please enter a number from 1 - 4");
        System.out.println("Please enter the lab number: ");
        labNum = in.nextInt();
       }

       //comp number entry
       System.out.println("Please enter the computer number: ");
       compNum = in.nextInt();
       while(compNum < 1 || compNum >10)
       {
        System.out.println("Invalid entry, please enter a number from 1 - 10");
        System.out.println("Please enter the computer number number: ");
        compNum = in.nextInt();

       }
       --compNum;
       --labNum;
        //search for user
        for(int i = 0 ; i< labs.length;i++)
        {
            for(int j = 0; j< labs[i].length;j++)
            {
                if(labs[i][j]==login)
                {
                    System.out.println("ERROR, user "+ login + " is already logged into a station.");
                    return;
                }
            }  
        }

       if(labs[labNum][compNum]== null || labs[labNum][compNum] == "")
       {
            labs[labNum][compNum] = login;
       }
       else if( labs[labNum][compNum] !=null && labs[labNum][compNum] != "")
       {
        System.out.println("ERROR, user "+ labs[labNum][compNum] + " is already logged into that station.");
       }
      

   };
//    void logout() {...};
//    void search() {...};

}