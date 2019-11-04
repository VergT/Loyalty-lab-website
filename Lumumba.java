import java.util.Scanner;

class Lumumba{

public static void main(String [] args){
int cat;
int choice;
int sum=0;
int amount=0;
int balance=0;
int CRIPS=100,MILK=70,BLUEBAND=120,CHOCOLATE=150,BREAD=60,MEAT=200,KIWI=150;
int pick=1;

Scanner scan=new Scanner(System.in);

System.out.println("\tLUMUMBA MART\n\t............");
System.out.println("\tITEM\t\t\tCOST(Ksh.)\n\t..................................");


System.out.println("\t1.)CRIPS\t\t"+"100");
System.out.println("\t2.)MILK\t\t\t"+"70");
System.out.println("\t3.)BLUE BAND\t\t"+"120");
System.out.println("\t4.)CHOCOLATE\t\t"+"150");
System.out.println("\t5.)BREAD\t\t"+"60");
System.out.println("\t6.)MEAT\t\t\t"+"200");
System.out.println("\t7.)KIWI\t\t\t"+"130");

do{
System.out.println("PLease enter the type of goods you need to purchase or press 0 to exit");

choice=scan.nextInt();

if (choice==0)
break;


if(choice==1){
System.out.println("you have picked CRIPS" );
sum=sum+CRIPS;

}
else if(choice==2){
System.out.println("you have picked MILK");
sum=sum+MILK;

}
else if(choice==3){
System.out.println("you have picked BLUE BAND" );
sum=sum+BLUEBAND;

}
else if(choice==4){
System.out.println("you have picked CHOCOLATE");
sum=sum+CHOCOLATE;

}
else if(choice==5){
System.out.println("you have picked BREAD");
sum=sum+BREAD;

}
else if(choice==6){
System.out.println("you have picked MEAT");
sum=sum+MEAT;

}
else if(choice==7){
System.out.println("you have picked KIWI");
sum=sum+KIWI;

}else{
System.out.println("Please try again or press 0 to exit");
}
}
while ( pick>0 );
System.out.println("Your Bill is" +sum);
System.out.println("Enter your cashout here");
 
amount=scan.nextInt();
if(amount<sum){
System.out.println("inadquate cashout");
}else{
balance=amount-sum;
System.out.println("Your balance is" +balance);
}


if(amount>=sum){
System.out.println("\tLUMUMBA MART\n\t............");
//System.out.println("Your food is number:" +choice);
System.out.println("Your cashout is :" +amount);
System.out.println("Your balance is :" +balance);
System.out.println("Your where severed by GABINA EDINS program");
System.out.println("SHOP MORE FOR LESS!!!!!!");
}else{
System.out.println("please try again or later!!!!!!");
}
}
}








