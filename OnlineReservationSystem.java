import java.util.*;
import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class OnlineReservationSystem
{
    String username,emailid,password,choices,PNR;
    int j,PNR1,PNRNUMBER;
    String train_no[]={"Tr01","Tr02","Tr03","Tr04","Tr05","Tr06","Tr07","Tr08","Tr09","Tr10"};
    String trainstations [] ={
        "Austraila","vizag","U.S.A","karnataka","kerala","kashmir","Himachal pradesh","Goa","Gujarat","Uttar Pradesh"
        };
        String fares[] ={"20.0","25","30","10","20","25","25","25","25","30"};
        String source,destination,trainnumber,trainnames,dateofjourney,p;
    public static void main(String args[]) 
    {  
        OnlineReservationSystem od=new OnlineReservationSystem();  
        String choice;
        int i=0;
        boolean ch= true;
        while(ch==true)
        {
            JOptionPane.showMessageDialog(null,"WELCOME ONLINE TRAIN TICKET RESERVATION EXAM");
            JOptionPane.showMessageDialog(null,"choice 1 for login\n"
            +"choice 2 for Ticket Booking\n"
            +"choice 3 for Ticket cancell\n"+"Choice 4 for Exit");
            choice=JOptionPane.showInputDialog("Enter your choice");
            switch(choice)
            {
                case "1": 
                    od.login();
                    i=1;
                    break;
                case "2":
                    if(i==1)
                    {
                       od.trainticket();
                       break;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"YOU HAVEN'T LOGIN");
                    }
                case "3":
                    if(i==1)
                    {
                      od.cancell();
                      break;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"YOU HAVEN'T LOGIN");
                    }
                case "4":
                    System.exit(0);       
                default:
                    JOptionPane.showMessageDialog(null,"You Haven't logged in");
                    break;     
            }
        }
    }
public void  login()
{
    
    username=JOptionPane.showInputDialog("Enter your username");   
    emailid=JOptionPane.showInputDialog("Enter your emailid");  
    password=JOptionPane.showInputDialog("Enter your password ");
    if(!username.equals("&")||emailid.equals("123@gmail.com")||password.equals("1234"))
    {
        JOptionPane.showMessageDialog(null,"Loggedin Successfully");
    }
    else
    {
        JOptionPane.showMessageDialog(null,"LogIn Failed");
    }   
}
public void trainticket()
{
    System.out.println("Welcome To Railway Reservation System\n"
    +"======================================================================\n"
    +"Press             Train_no              Train_name                  Fares\n"
    +"======================================================================");
    for(int j=0;j<trainstations.length;j++)
    {
        System.out.println((j+1)+"                           "+train_no[j]+"                  "+trainstations[j]+"                         "+fares[j]+"\n");
        
        //JOptionPane.showMessageDialog(null,"");
    }
    choices=JOptionPane.showInputDialog("Enter choice:");
    int option=Integer.parseInt(choices);
    if(option>0&&option<10)
    {
        trainnumber=JOptionPane.showInputDialog("Enter Train number");
        trainnames=JOptionPane.showInputDialog("Enter Train name");
        source=JOptionPane.showInputDialog("Enter the Source");
        destination=JOptionPane.showInputDialog("Enter the Destination");
        p=JOptionPane.showInputDialog("Enter number of Passengers");
        dateofjourney=JOptionPane.showInputDialog("Enter Date of Journey");
        int date1=Integer.parseInt(dateofjourney);
        Random rd=new Random();
        PNR1=rd.nextInt();
        PNR=Integer.toString(PNR1);
        java.time.LocalDate.now();


    }
    JOptionPane.showMessageDialog(null,"Train no:"
                                       +trainnumber+"\nTrain name:"
                                       +trainnames+"\nJourney from:"
                                       +source+"\nTO:"
                                       +destination+"\nNumber of passangers"
                                       +p+"\nDate of journey"+dateofjourney+"\n UTR number:"+PNR );
    //JOptionPane.showMessageDialog(null,+Journey+"days left ");

    JOptionPane.showMessageDialog(null,"DO YOU WANT TO CANCELL THE TICKET CHOOSE OPTION 3 OR NO"); 
    

}
public void cancell()
{
   PNRNUMBER=PNR1;
   JOptionPane.showMessageDialog(null,"The UTR NUMBER IS"+PNRNUMBER);
   String PNR2=JOptionPane.showInputDialog("Enter the PNR PIN");
   int PNR3=Integer.parseInt(PNR2);
   if(PNR3==PNRNUMBER)
    {
        JOptionPane.showMessageDialog(null,"TICKETS CANCELLED");
    }
    else
    {
        JOptionPane.showMessageDialog(null,"PLEASE ENTER THE CORRECT UTR NUMBER");
    }
}

}