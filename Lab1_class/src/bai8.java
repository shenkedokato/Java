package src;

public class bai8 {
    public static void main(String []arg){
        System.out.print(" x ");
        for(int a=1;a<11;a++){
            if(a<10){
                System.out.print(" ");
            }
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.print("\n");
        for(int i=1;i<11;i++){
            if(i<10){
                System.out.print(" ");
            }
            System.out.print(i);
            System.out.print(" ");

            for(int j=1;j<11;j++)
            {
                
                if(j*i<10){
                    System.out.print(" ");
                }
                System.out.print(j*i);
                System.out.print(" ");
 
            }
            System.out.print("\n");

        }
        
    }
}
