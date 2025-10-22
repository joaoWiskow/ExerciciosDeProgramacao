package emjava;
import java.util.Scanner;

public class Rainhas{
    public static void main(String[]args){
      Scanner in=new Scanner(System.in);
      System.out.println("Digite o número de rainhas: ");
      int nRainhas=in.nextInt();
      int tabuleiro[][]=new int[4][4];
      for(int i=0;i<4;i++){
       for(int j=0;j<4;j++){
        tabuleiro[i][j]=0;
       }
     }
      preencheLinhas(tabuleiro, 4, 4);
    }
    public static void printa(int nRainhas,int[][] tabuleiro){
     
     for(int i=0;i<4;i++){
       for(int j=0;j<4;j++){
        System.out.print("|"+tabuleiro[i][j]+ "");
       }
      System.out.println("|");
     }
     
    }
    public static int[][] preencheLinhas(int[][] tabuleiro,int i,int j){
      int iInf;
      int jInf;
      if(1-i<=1-j){
         iInf=Math.abs(i-(1-i));
         jInf=Math.abs(j-(1-i));
      }else{
         iInf=Math.abs(i-(1-j));
         jInf=Math.abs(j-(1-j));
      }
      int iSup;
      int jSup;
      if(8-i<=8-j){
        
      }
      for(int k=0;k<8;k++){//coluna
            if(k!=j){
            tabuleiro[i][k]=-1;
            }else{
              tabuleiro[i][k]=1;  
            }
        }
        
        for(int k=0;k<8;k++){//linha
            if(k!=i){
            tabuleiro[k][j]=-1;
            }else{
              tabuleiro[k][j]=1;  
            }
        }
        
        printa(1,tabuleiro);
        return tabuleiro;
    }
}