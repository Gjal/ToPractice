//汉诺塔
public class Hanoi{
public void Hannoi (int n, char a, char b, char c){
if(n==1){
    System.out.println(a+"-->"+c);
}
else{
    method(n-1,a,c,b);
    method(1,a,b,c);
    method(n-1,b,a,c);
}
}
