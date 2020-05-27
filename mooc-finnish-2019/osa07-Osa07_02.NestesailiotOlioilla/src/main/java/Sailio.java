public class Sailio {
    private int maara;
    public Sailio(){
    
    }
    
    public int sisalto(){
        return this.maara;
    }
    
    public void lisaa(int maara){
        
        if(maara < 0){
            this.maara = this.maara;
        } else if(maara + this.maara > 100){
            this.maara = 100;
        } else if(this.maara + maara <= 100){
             this.maara = this.maara + maara;
        }
    }
    
    public void poista(int maara){
        
        if(maara < 0){
            this.maara = this.maara;
        } else if(maara > this.maara ){
            this.maara = this.maara - this.maara;  
        } else if(this.maara - maara < 100 && this.maara - maara >= 0){
            this.maara = this.maara - maara;
        }
    }
    
    public String toString(){
    
        return this.maara + "/" + "100";
    }
    
}