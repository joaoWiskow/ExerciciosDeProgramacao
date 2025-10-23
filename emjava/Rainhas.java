package emjava;
import java.util.Scanner;

public class Rainhas{
    public static void main(String[]args){
      Scanner in=new Scanner(System.in);
      System.out.println("Digite o número de rainhas: ");
      int nRainhas=in.nextInt();
      int tabuleiro[][]=new int[8][8];
    //   for(int i=0;i<8;i++){
    //    for(int j=0;j<8;j++){
    //     tabuleiro[i][j]=0;
    //    }
    //  }
      preencheLinhas(tabuleiro, 4, 4);
    }
    public static void printa(int nRainhas,int[][] tabuleiro){
     
     for(int i=0;i<8;i++){
       for(int j=0;j<8;j++){
        System.out.print("|"+tabuleiro[i][j]+ "");
       }
      System.out.println("|");
     }
     
    }
    public static int[][] preencheLinhas(int[][] tabuleiro,int i,int j){
     
     tabuleiro[i][j]=1;
      // for(int k=1;k<8;k++){//coluna
      //       if(k!=j){
      //       tabuleiro[i][k]=-1;
      //       }else{
      //         tabuleiro[i][k]=1;  
      //       }
      //   }
        
      //   for(int k=1;k<8;k++){//linha
      //       if(k!=i){
      //       tabuleiro[k][j]=-1;
      //       }else{
      //         tabuleiro[k][j]=1;  
      //       }
      //   }
        for(int k=1;k<8;k++){
             if(i-k>=1&&j-k>=1){
              tabuleiro[i][j]=-1;
             }
             if(i-k>=1&&j+k<=8){
              tabuleiro[i][j]=-1;
             }
             if(i+k<=8&&j-k>=1){
              tabuleiro[i][j]=-1;
             }
             if(i+k<=8&&j+k<=8){
              tabuleiro[i][j]=-1;
             }
        }
        printa(1,tabuleiro);
        return tabuleiro;
    }
}