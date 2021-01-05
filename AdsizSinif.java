package AbstracSinif.Adsiz_Icice_Sinifler_Anonymous_Inner_Class;

public class AdsizSinif {
    public static void main(String[] args) {


        Hesablayan hesablayan1 = new Hesablayan(){
            @Override
            public void Topla(int s1, int s2) {
                System.out.println("Iki sayinin toplami");
                super.Topla(s1, s2);
            }
        };

        hesablayan1.Topla(11,22);

        Hesablayan hesablayan = new Hesablayan();
        hesablayan.Topla(10,30);

        /*
        yeniHesablayici yeniHesablayici1= new yeniHesablayici();
        yeniHesablayici1.Topla(10,5);  */

        Canli canli = new Canli() {
            @Override
            void AdiniDe() {
                System.out.println("Men adsiz sinifden gelirem");

            }

            @Override
            void SalamVer() {
                System.out.println("salam");
            }
        };
        canli.AdiniDe();
        canli.SalamVer();

        Muveqqeti muveqqeti = new Muveqqeti();
        muveqqeti.AdiniDe();
        muveqqeti.SalamVer();

        Yazdir yazdir = new Yazdir() {
            @Override
            public void yazdir() {
                System.out.println("anonim yazdir");
            }

        };
        yazdir.yazdir();

    }
}

interface Yazdir{
    void yazdir();
}

abstract class Canli{
    abstract void AdiniDe();
    void SalamVer(){
        System.out.println("Salam");
    }
}

class Muveqqeti extends Canli{
    @Override
    void AdiniDe() {

    }

    @Override
    void SalamVer() {
        System.out.println("Muveqqeti");
    }
}

  class yeniHesablayici extends Hesablayan{
    @Override
    public void Topla(int s1, int s2) {
        System.out.println("iki sayinin cemi");
        super.Topla(s1, s2);
    }
   }