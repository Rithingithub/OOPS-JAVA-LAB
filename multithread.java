import java.util.Random;
class RandomThread extends Thread{
public void run ()
{
Random r= new Random ();
for (int i=0; i<20; i++)
{
     int n=r.nextInt (100);
if (n%2 ==0){
     new even(n).start();
     }
else {
new odd(n).start();
}}}}
class even extends Thread {
private int num;
public even (int num ){
this.num=num;
}
public void run(){
System.out.println ("square of "+num+"="+num*num);
}}
class odd extends Thread {
private int num ;
public odd(int num){
this.num=num;
}
public void run(){
System.out.println ("cube of "+num+"="+num*num*num);
}}
class multithread{
public static void main (String args[])
{ RandomThread r= new RandomThread ();
r.start();
}}
