


public class Member1 {
  
    private String nama;
    private String team;
    private int umur;
    private int nilai;
   
    
    private int hasil;
    
    public void setNama (String n){
        
        nama=n;  
    }
    
    public String getNama (){
    
        return nama;
    }
    
    public void setTeam (String t){
        
        team=t;
        
 }
    public String getTeam (){
    return team;
    }
    
    public void setUmur (int u){
        umur=u;
        
}
    
    public int getUmur (){
    return umur;
    
    }
    
    public void setNilaiPenampilan (int np){
        nilai=np;
    }
    public int getNilaiPenampilan (){
    return nilai;
    }
    
    public void setNilaiSuara (int ns){
        nilai=ns;
    }
    public int getNilaiSuara (){
    return nilai;
    }
    public void setNilaiAttitude (int na){
        nilai=na;
        
    }
    public int getNilaiAttitude (){
    return nilai;
    
}
    
public int getHasil(){
    hasil=nilai/3;
    return hasil;
}
}



    