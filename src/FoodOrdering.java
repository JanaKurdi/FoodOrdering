//CPCS202
//2/11/2019

import java.util.Scanner;

public class FoodOrdering{
//main method
    public static void main(String[] args) {
        // TODO code application logic here
       //create Scanner
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
      //declare and initialize variables
        char choice;
        int choice1=0;
        int quantities = 0;
        double price=0;
        String name = null;
        boolean nameTest;
        String phone = null;
        boolean num;
        int building;
        String street=null;
        String city=null;
        String zip;
        String code = "";
        String discount;
        double total;
        double discountValue;
       
        //keep reading data until the choice are not a, b, c ,choice1 -1,or b without choose a firt
        do{
       System.out.println("-----------------------------------------------------------");
       System.out.println("                        Welcome             ");
       System.out.println("-----------------------------------------------------------");
       System.out.println("a.Food Ordering");
       System.out.println("b.Delivery");
       System.out.println("c.Summary and Exit");
       System.out.print("Please enter your choice: ");
      choice = input.next().toLowerCase().charAt(0);//promote the user to choose
    
     switch (choice) {
         case 'a'://if choice=a print food menu
             do{//keep reading data until choice1 !=-1
                System.out.println("-----------------------------------------------------------");
                System.out.println("                    Food Menu        ");
                System.out.println("-----------------------------------------------------------");
                System.out.println("Item                                       Price (SR)     ");
                System.out.println("1.	Chicken Burger                      12 SR");
                System.out.println("2.	Beef Burger                         15 SR");
                System.out.println("3.	Mac and Cheese                      10 SR");
                System.out.println("4.	Cesar Salad                         11 SR");
                System.out.println("5.	House Salad                         10 SR");
                System.out.println("6.	Fries                                7 SR");
                System.out.println("7.	Soft Drink                           3 SR");
                do{//if the user enter any number from 1-7 0r -1 display this massage again
                System.out.print("Enter your choice (1 to 7) or -1 to exit:");
                        choice1 =input.nextInt();//promote the user to choose
                }while(choice1<-1||choice1>7||choice1==0);
                
             if(choice1!=-1&&choice1<=7&&choice1>=1&&quantities>=0){
                do{//keep reading data until the quantities<=0
                    System.out.print("Enter quantities:");
                       quantities =input.nextInt();//promote the user to enter the quantities
                           }while(quantities<=0);
                   switch (choice1) {//if choice1= any number forom 1 to7 count the price of them
                        case 1:
                      price=price+(12*quantities);
                           break;
                        case 2:
                      price=price+(15*quantities);
                          break;
                        case 3:
                      price=price+(10*quantities);
                          break;
                        case 4:
                      price=price+(11*quantities);
                          break;
                       case 5:
                      price=price+(10*quantities);
                          break;
                       case 6:
                       price=price+(7*quantities);
                           break;
                      case 7:
                      price=price+(3*quantities);
                            break;
                     default:
                            break;
                            }
                        }else
                 //display the price before the discount if the user choose -1
                            System.out.println("Your total order is:"+price);
                    }while (choice1!=-1);
                    break;
                    
                case 'b'://if choice=b promote user to enter information of 
                     if(choice1!=-1&&choice=='b')//if choice=b and does not order display this massage
                        System.out.println("***********You have to order first***********");
                    
                    else
                    
                    do{//keep reading data until there is something wrong in phone number or zip code
                    System.out.println("   "); 
                    System.out.print("Enter your full name (first and lastname):");
                    name=input1.nextLine().toLowerCase();//promote the user to enter her/his full name
                   //check if the name is letter
                    
                    
                    System.out.print("Enter your phone number:");
                    phone=input1.nextLine();////promote the user to enter her/his phone number
                    //check if the phone umber is digit and 10 digit
                     num= phone.length()==10 && 
                            (Character.isDigit(phone.charAt(0)))&&
                            (Character.isDigit(phone.charAt(1)))&&
                            (Character.isDigit(phone.charAt(2)))&& 
                            (Character.isDigit(phone.charAt(3)))&&
                            (Character.isDigit(phone.charAt(4)))&&
                            (Character.isDigit(phone.charAt(5)))&&
                            (Character.isDigit(phone.charAt(6)))&& 
                            (Character.isDigit(phone.charAt(7)))&& 
                            (Character.isDigit(phone.charAt(8)))&& 
                            (Character.isDigit(phone.charAt(9)));
                  
                   //promote the user to enter her/his information
                    System.out.println("Fill in your address information:");
                    System.out.print("    Enter building number:");
                    building=input.nextInt();
                    System.out.print("    Enter street name:");
                    street=input1.nextLine().toLowerCase();
                    System.out.print("    Enter city:");
                    city=input1.nextLine().toLowerCase();
                    System.out.print("    Enter zip code:");
                    zip=input1.nextLine();
    
                    
                    if(phone.length()!=10||!num){//if it is wrong display this massage
                       System.out.println("Wrong Phone number. Enter again..");
                    }
                       if(zip.length()!=5){//if it is wrong display this massage
                       System.out.println("Wrong zip code. Enter again..");
                       }
              if(  "".equals(name)||"".equals(street)||"".equals(city)||  "".equals(phone)||"".equals(zip)){
              System.out.println("***********You have not complete your information yet ***********");
                    }
          }while(phone.length()!=10||zip.length()!=5||!num||  "".equals(name)||"".equals(street)||"".equals(city));
                     
                 if(choice1==-1 && choice=='b')//if it is true allow to write code
                         do{
                         System.out.print("Enter coupon code (if any): ");
                    code=input1.nextLine().toUpperCase();//promote the user to enter coupon code
                    //check the code
                    if("FXER15".equals(code)||"FXER05".equals(code)||"FXER10".equals(code)||"FXER20".equals(code)){
                         
                    }else
                        System.out.println("Your coupon code is not accepted");
                 
                 System.out.println("***********Thank you. We will deliver your order shortly*************");
                }while(choice1!=-1&&choice=='b');
                    break;
                         
                     
                      
                    case 'c'://if choice=c print summary
                        if(choice1!=-1 && choice=='c'){//check if order first
                System.out.println("***********You have not ordered yet***********");
                        }
                        else if(name==null){
                System.out.println("***********You have not fill your information yet ***********");
                        }
                        else{
                          
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("                     Summary      ");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("   ");
                    System.out.println("Your full name is: "+ name);
                    System.out.println("Your phone number is: "+phone);
                        //make discout depend on the last two number in the coupon code
            
                           
                           
       if ("FXER20".equals(code)||"FXER10".equals(code)||"FXER05".equals(code)||"FXER15".equals(code)){
                           discount=code.substring(4,6);
                            discountValue=Double.parseDouble(discount);
                           total=price-(price*(discountValue/100));
                   System.out.println("Your total order is: "+total);
            
       }else
                   System.out.println("Your total order is: "+price);
       
                      System.exit(0);//exit the app
          
                        }
             
                    break;
                default://if choice other than a ,b or c display this massage
                    System.out.println("************ Wrong Entry. Try Again ****************");
                    break;   
            }
             
                } while(choice!='a'||choice!='b'||choice!='c');
    }
}


  
