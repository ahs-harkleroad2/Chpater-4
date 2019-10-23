/**
 * Alex Harkleroad
 * Roman Numerals
 * Programming III
 * 10/23/2019
 */
import java.util.Scanner;

public class RomanNumerals {

    public static void main(String[] args) {
        //Declare variables
        int num;
        String rn;
        //Initialize utilities
        Scanner keyboard = new Scanner(System.in);
        //Get number
        System.out.println("Please enter a number (1-10) ");
        num = keyboard.nextInt();
        //Convert to roman numeral
        if(num==1){
            rn="I";
            System.out.println("The roman numeral for " + num + " is " + rn);
        }else if(num==2){
            rn="II";
            System.out.println("The roman numeral for " + num + " is " + rn);
        }else if(num==3){
            rn="III";
            System.out.println("The roman numeral for " + num + " is " + rn);
        }else if(num==4){
            rn="IV";
            System.out.println("The roman numeral for " + num + " is " + rn);
        }else if(num==5){
            rn="V";
            System.out.println("The roman numeral for " + num + " is " + rn);
        }else if(num==6){
            rn="VI";
            System.out.println("The roman numeral for " + num + " is " + rn);
        }else if(num==7){
            rn="VII";
            System.out.println("The roman numeral for " + num + " is " + rn);
        }else if(num==8){
            rn="VIII";
            System.out.println("The roman numeral for " + num + " is " + rn);
        }else if(num==9){
            rn="IX";
            System.out.println("The roman numeral for " + num + " is " + rn);
        }else if(num==10){
            rn="X";
            System.out.println("The roman numeral for " + num + " is " + rn);
        }else{
            System.out.println("ERROR. Please enter a number 1-10.");
        }
        
    }

}
