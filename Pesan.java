package pertemuan06;

/**
 *
 * @author INSTIKI
 */
public class Pesan {
    private String tx = "isi pesan deflaut";
    
    public void tulisPesan(){
        System.out.println(this.tx);
    }
    public void tulisPesan(String txt){
        System.out.println(txt);
        
    }
    public void tulisPesan(String txt1, String txt2){
        System.out.printf("%s %s\n",txt1,txt2);
    }
}