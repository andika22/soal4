

import java.util.ArrayList;
import java.util.Scanner;

public class MainMember1 {
    
    public static void main(String args []){
        
        Scanner in = new Scanner (System.in);
       
     
        
        Member1 s1= new Member1();
        Member1 s2= new Member1();
        Member1 s3= new Member1();
        
        {
        
        ArrayList<Member1> listMember1=  new ArrayList<>();
        
        
        listMember1.add(s1);
        listMember1.add(s2);
        listMember1.add(s3);
        
        for (int i = 0 ;i < listMember1.size();i++){
            
            
        System.out.print ("Nama :");
        listMember1.get(i).setNama(in.next());
        
        System.out.print ("Team :");
        listMember1.get(i).setTeam(in.next());
        
        System.out.print ("Umur :");
        listMember1.get(i).setUmur(in.nextInt());
     
        System.out.print("Nilai Penampilan :");
        listMember1.get(i).setNilaiPenampilan(in.nextInt());
      
        System.out.print("Nilai Suara :");
        listMember1.get(i).setNilaiSuara(in.nextInt());
       
        System.out.print ("Nilai Attitude :");
        listMember1.get(i).setNilaiAttitude(in.nextInt());
        System.out.println();
        
        
        
    
        }
            
   
           
     
        
            for (int i = 0 ;i < listMember1.size();i++){
            System.out.println("-------------  **Daftar Member**   ---------------");
            System.out.println("Nama :"+listMember1.get(i).getNama());
            System.out.println("Team :"+listMember1.get(i).getTeam());
            System.out.println("Umur :"+listMember1.get(i).getUmur());
            System.out.println("Nilai Penampilan :"+listMember1.get(i).getNilaiPenampilan());
            System.out.println("Nilai Suara :"+listMember1.get(i).getNilaiSuara());
            System.out.println("Nilai Attitude :"+listMember1.get(i).getNilaiAttitude());
            System.out.println("Hasil Akhir :"+listMember1.get(i).getHasil());
            System.out.println("---------------------------------------------------");
            System.out.println();
                        
            
        }
        
        
        
        
        
        }
    }
}
        
    
    
    



