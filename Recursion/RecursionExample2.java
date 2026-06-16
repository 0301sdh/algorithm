package Recursion;
public class RecursionExample2 {
    
    //문자열 길이 계산
    public static int length(String str){
        if(str.equals(""))
            return 0;
        else
            return 1 +  length(str.substring(1));
    }

    //문자열의 프린트
    public static void printChars(String str){
        if(str.equals(""))
            return;
        else{
            System.out.println(str.charAt(0));
            printChars(str.substring(1));
        }
    }
    
    //문자열을 뒤집어 프린트
    public static void printCharsReverse(String str){
        if(str.equals(""))
            return;
        else{
            printCharsReverse(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }

    // 2진수로 변환하여 출력
    public static void printInBinary(int n){
        if(n<2)
            System.out.println(n);
        else{
            printInBinary(n/2);
            System.out.println(n%2);
        }
    }

    //배열의 합 구하기
    public static int sum(int n, int[] data){
        if(n<=0)
            return 0;
        else{
            return sum(n-1,data) + data[n-1];
        }
    }

    //데이터파일로 부터 n개의 정수 읽어오기
   /* public static void readFrom(int n, int[] data, Scanner in){
        if(n==0)
            return;
        else{
            readFrom(n-1,data,in);
            data[n-1] = in.nextInt();
        }
    } */
    
}
