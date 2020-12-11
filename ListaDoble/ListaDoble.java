package ListaDoble;

public class ListaDoble {
    Nodo cab;
    
    public ListaDoble(){
        cab=null;
    }
    
    public boolean isVacia(){
        return (cab==null);
    }
    
    public void insertarCab(Nodo nuevo){
        if(!isVacia()){
            cab.ant=nuevo;
            nuevo.sig=cab;
        }
        cab=nuevo;
    }
    
    public void insertarCola(Nodo nuevo){
        if(isVacia()){
            cab=nuevo;
        }else{
            Nodo tmp=cab;
            while(tmp.sig!=null){
                tmp=tmp.sig;
            }
            tmp.sig=nuevo;
            nuevo.ant=tmp;
        }
    }
    
    public Persona eliminar(int info){
        if(!isVacia()){
            Nodo tmp=cab;            
            while(tmp!=null){
                if(tmp.info.getId()==info){
                    if(tmp==cab){
                        return eliminarCab();                        
                    }
                    else if(tmp.sig==null){
                        return  eliminarCola();
                    }
                    tmp.ant.sig=tmp.sig;
                    tmp.sig.ant=tmp.ant;
                    return tmp.info;
                }
                tmp=tmp.sig;
            }
        }
        return null;
    }
    public Persona eliminarCab(){
        if(!isVacia()){
            Persona elim= cab.info;
            cab=cab.sig;
            if(cab!=null){
                cab.ant=null;
            }
            return elim;
        }
        return null;
    }
    
    public Persona eliminarCola(){
        if(!isVacia()){
            Nodo tmp=cab;
            Persona elim;
            while(tmp.sig!=null){
                tmp=tmp.sig;
            }
            if(tmp.ant!=null){
                tmp.ant.sig=null;
                return tmp.info;
            }else{
                elim=cab.info;
                cab=null;
                return elim;
            }            
        }
        return null;
    }

    @Override
    public String toString() {
        String mostrar="      Cab\n       ↓\nnull↔";
        Nodo tmp=cab;
        while(tmp!=null){
            mostrar+="["+tmp.info+"] ↔ ";
            tmp=tmp.sig;            
        }
        return mostrar+"null";
    }
    
    
    
    
    
    
}
