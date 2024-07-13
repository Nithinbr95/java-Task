public class Prime{

public static void main(String args[]){

int num=31;
int count=0;
if(num<2){
	System.out.println("Not a Prime Number");
}
for(int index=2;index<=num;index++){
if(num%index==0){
  count++;
}
}
if(count<2){
System.out.println("Not a prime number");																															
}else{

System.out.println("Prime");
}
}
}