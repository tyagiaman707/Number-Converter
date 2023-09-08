import java.util.Scanner;

public class code{
    static String[] A= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    static String[] B= {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public static void convert(int num){
        if(num>0 && num<=19){
            System.out.print(A[num]+" ");
        }
        if(num>19 && num<100){
            System.out.print(B[num/10]+" "+A[num%10]);
        }
        if(num>=100 && num<= 999){
            System.out.print(A[num/100]+" Hundread ");
            num%=100;
            convert(num);
        }
        if(num>=1000 && num<= 99999){
            convert(num/1000);
            System.out.print("Thousand ");
           convert(num%=1000);   
        }
        if(num>=100000 && num<=9999999){
			convert(num/100000);
			System.out.print("Lakh ");
			convert(num%100000);
		}
		if(num>=10000000 && num<=999999999){
			convert(num/10000000);
			System.out.print("Crore ");
			convert(num%10000000);
		}
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be converted : ");
        int num= sc.nextInt();
        convert(num);
    }
}