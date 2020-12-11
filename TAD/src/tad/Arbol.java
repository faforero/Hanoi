
package tad;

public class Arbol {
    Nodo raiz;
    
    Arbol(){
        raiz=null;
    }
    
    public boolean isVacio(){
        return (raiz==null);
    }
    
    public void insertar(Nodo nuevo){
        if(isVacio()){
            raiz=nuevo;
        }else{
            Nodo tmp=raiz;
            while(tmp.izq!=null && nuevo.info<tmp.info){
                tmp=tmp.izq;
            }
            
            
            
                       
        }
    }
    
}
/*+
if(nuevo.info<raiz.info){
                raiz.izq=nuevo;
            }else{
                raiz.der=nuevo;
            } 
*/
