package TrafikKontrolLambasiProjesi;

public class TrafikLambasi {
    public String rengi;
    public TrafikLambasi(String rengi){
        this.rengi = rengi;
    }

    public void yan(){
        System.out.println("Trafik lambasi yaniyor  :" + rengi);
    }
}
