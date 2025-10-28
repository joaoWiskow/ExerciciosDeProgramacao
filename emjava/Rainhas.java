package emjava;
import java.util.Scanner;

public class Rainhas{
    public static void main(String[]args){
      Scanner in=new Scanner(System.in);
      System.out.println("Digite o número de rainhas: ");
      int nRainhas=in.nextInt();
      int tabuleiro[][]=new int[8][8];
      for(int i=0;i<8;i++){
       for(int j=0;j<8;j++){
        tabuleiro[i][j]=0;
       }
     }
      int [][]tab=montaTabuleiro(tabuleiro, nRainhas);
    }
    public static int[][] montaTabuleiro(int tabuleiro[][],int nRainhas , int i, int j){
        if(nRainhas==0){
          printa(tabuleiro);
          return tabuleiro;
        }

        if(verifica(tabuleiro,i,j)){
          tabuleiro[i][j]=1;
          montaTabuleiro(tabuleiro,nRainhas-1, i+1, j);
          montaTabuleiro(tabuleiro,nRainhas-1, i, j+1);
          montaTabuleiro(tabuleiro,nRainhas-1, i+1, j+1);
        }
        return tabuleiro;
    }
    //funcao de backtracking
    
    public static boolean verifica(int[][] tabuleiro,int i,int j){
      boolean permitido=true;
      for(int k=0;k<=8;k++){
      if(tabuleiro[i][k]==1){
        permitido=false;
      }
      while(i-1>=0&&j-1>=0){
        if(tabuleiro[i-1][j-1]==1){
          permitido=false;
        }
        i--;
        j--;
      }
      while(i+1<=8&&j+1<=8){
        if(tabuleiro[i+1][j+1]==1){
          permitido=false;
        }
        i++;
        j++;
      }
     }
     return permitido;
    }
    public static void printa(int[][] tabuleiro){
     
     for(int i=0;i<8;i++){
       for(int j=0;j<8;j++){
        System.out.print("|"+tabuleiro[i][j]+ "");
       }
      System.out.println("|");
     }
     
    }
}