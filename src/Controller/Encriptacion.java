
package Controller;

/**
 *
 * @author jhoda
 */
public class Encriptacion {
    public static void main(String[] args) {
        
    

  String  pass="equisde";
    char array[] = pass.toCharArray();
    char arrayC[] = pass.toCharArray();
    int V[]= new int [30];
    for (int i=0;i<array.length;i++){
         V[i]=(int) (Math.random()*12);
        
        if((char)array[i]%2==0){
        
        arrayC[i]=(char)(array[i]+V[i]);
        while(arrayC[i]>126){
            arrayC[i]=(char)(array[i]-1);
        }
        }
        if((char)array[i]%2!=0){
        arrayC[i]=(char)(array[i]-V[i]-6);
        while(arrayC[i]<32){
        arrayC[i]=(char)(array[i]+1);}
        
        
        }
        System.out.println(V[i]);
    }
    String cifrado= String.valueOf(arrayC);
    char arrayD[]=cifrado.toCharArray();
    for(int i=0;i<array.length;i++){
        if((char)array[i]%2==0){
        
        arrayD[i]=(char)(arrayC[i]-V[i]);
        
        } 
        if((char)array[i]%2!=0){
        arrayD[i]=(char)(arrayC[i]+V[i]+6);
        
    }
        System.out.println(V[i]);
 }   String Dcifrado= String.valueOf(arrayD);
     System.out.println(cifrado+"\n"+Dcifrado);
}}
