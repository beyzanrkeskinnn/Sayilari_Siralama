import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan alacağımız değerlere değişken oluşturduk.
        int a, b, c;
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan sayı değerlerini alıyoruz
        System.out.println("1. Sayıyı giriniz : ");
        a=input.nextInt();
        System.out.println("2. Sayıyı giriniz : ");
        b=input.nextInt();
        System.out.println("3. Sayıyı giriniz : ");
        c=input.nextInt();

        //girilen  sayıları küçükten büyüğe sıralama işlemi yaptık
        if((a<b)&& (a<c)){
            if(b<c){
                System.out.println("a<b<c " + a+"<"+b+"<"+c);
            }
            else{
                System.out.println("a<c<b "+ a+"<"+c+"<"+b );
            }

        }
        else if((b<a)&& (b<c)){
            if(a<c){
                System.out.println("b<a<c " + b+"<"+a+"<"+c);
            }
            else{
                System.out.println("b<c<a " + b+"<"+c+"<"+a);
            }

        }
        else {
            if(a<b){
                System.out.println("c<a<b" + c+"<"+a+"<"+b);
            }
            else{
                System.out.println("c<b<a" + c+"<"+b+"<"+a);
            }

        }


    }
}
