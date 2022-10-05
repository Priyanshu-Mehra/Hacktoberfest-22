//convert a sentence to pig latin 
import java.util.*;
class pig_latin{
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          String s=sc.nextLine();
          String[] s1=s.split(" ");
          String temp="";
          for(int i=0;i<s1.length;i++)
          {
               temp=temp+s1[i].substring(1,s1[i].length())+s1[i].charAt(0)+"ay"+" ";//converting each word to piglatin
          }
          System.out.println(temp);//Printing the pig latin word
          }
          }
