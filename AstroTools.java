/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areWeFriends;

/**
 *
 * @author kent
 */
public class AstroTools {
    
   final static int compat_threshold = 100 ;
    
   public static void main(String[] args){
       // creating variables with initial values
       int compatScore = 0;
       int responseNum = 0;
       class Scanner input = new Scanner(System.in);
       
       //Welcome and ask question 01
       System.out.println("Welcome to Astro Tools");
       System.out.println("Question 1: Do you like telescopes?");
       System.out.println("Yes = 1; No = 0");
       // use scanner to retrieve user input
       responseNum = variable scan.nextInt();
   
       //evaluate reply to question 1;  yes= 1, no = 0
       if(responseNum==1){
           // only run if user is an enthusiast
           System.out.print("Great;Telescopes are a window to our universe ");
           System.out.println(" they are an invaluable tool");
           
           //give user 100 points for being a telescope enthusiast
           compatScore = compatScore + 100;
           
           // ask question 1: telescope type only if enthusiast;
           // "nested question"
           System.out.println("Question 2: which type do you prefer best?");
           System.out.println(" Reflector = 1");
           System.out.println("Refractor = 2");
           System.out.println("Schmidt- Cassegrain");
           
           
           
           
           if(responseNum == 1){
               System.out.println(" Yes, a Reflector allow you to go bigger");
               compatScore = compatScore + 20;
           }else if(responseNum == 2){
             System.out.println("Refractors give the clearest images");
              compatScore = compatScore = 100;
           }else if (responseNum ==3){
              System.out.println("Schmidt- Cassegrains are very portable");
              compatScore = compatScore + 50;
           }else {
               System.out.println(" Not a valid answer");
           }
                       
       } else {
           // for non-enthusiasts
           System.out.print.ln(" No telescopes? Try one anyway ");
       }   System.out.println(" Skip question 2"); 
       }// close if/else of telescope question 01  
       
       
       System.out.println("Question 3");
       System.out.println( "Do you use binoculars?");
       responseNum = scan.nextInt();
       if(responseNum == 1){
           System.out.println ("So long!");
           compatScore = compatScore + 90;
       } else{
           System.out.println("Celestron binoculars are ");
       }// close question3 if/else
       //show the scores;
       System.out.print(" Your compatability score is:");
       System.out.println(compatScore);
       System.out.print("Based on a friend threshold score of:");
       System.out.println(compat_threshold);  
       
       //final friend compat determination
       if(compatSxcore>= compat-threshold){
           System.out.println("Determination: High friend liklihood");
       } else {  
           System.out.println("Determination: Low friend liklihood");
       }
       System.out.print("Thank you for takimg part); determination");
       System.out.println(" is tentative");
       
       
   }//close main method
}// close class        
               
        
     
         
           
      
       
       }
    
}