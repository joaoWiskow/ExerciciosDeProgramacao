package emjava;
import java.util.Scanner;

public class Rainhas{
    public static void main(String[]args){
      Scanner in=new Scanner(System.in);
      System.out.println("Digite o número de rainhas: ");
      int nRainhas=in.nextInt();
      distribuicao(nRainhas);
    }
    public static void distribuicao(int nRainhas){
     int tabuleiro[][]=new int[8][8];
     for(int i=0;i<8;i++){
       for(int j=0;j<8;j++){
        tabuleiro[i][j]=0;
        //System.out.print("|"+tabuleiro[i][j]+ "");
    }
    //System.out.println("|");
     }
     
    }
    public static int[][] preencheLinhas(int[][] tabuleiro,int i,int j){
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
        
        return tabuleiro;
    }
}