public class Reverse{

public static void main(String args[]){

long num = 9355436745L;
long reverse = 0;
//reverse=reverse*10+reverse;
for(long rem = num%10;rem<=num;rem++){
//long rem = num%10;
reverse = reverse*10+rem;
num = num/10;

}
System.out.println("Reverse:"+reverse);
}
}