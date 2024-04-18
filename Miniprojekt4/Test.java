public class Test {
    public static void main(String[] args) {
        RegularisSzamla regSzamla1= new RegularisSzamla("Regularis szamla 1");
        RegularisSzamla regSzamla2=new RegularisSzamla("Regularis szamla 2");
        RegularisSzamla regSzamla3=new RegularisSzamla("Regularis szamla 3");
        RegularisSzamla regSzamla4=new RegularisSzamla("Regularis szamla 4");

        FolyoSzamla folySzamla1=new FolyoSzamla("Foloszamla 1");
        FolyoSzamla folySzamla2=new FolyoSzamla("Foloszamla 2");
        FolyoSzamla folySzamla3=new FolyoSzamla("Foloszamla 3");
        FolyoSzamla folySzamla4=new FolyoSzamla("Foloszamla 4");

        TakarekSzamla takarekSzamla1=new TakarekSzamla("Takarekszamla1", 250);
        TakarekSzamla takarekSzamla2=new TakarekSzamla("Takarekszamla2", 169);
        TakarekSzamla takarekSzamla3=new TakarekSzamla("Takarekszamla3", 120.5);
        TakarekSzamla takarekSzamla4=new TakarekSzamla("Takarekszamla4", 120.5);

        System.out.println("Regularis szamla teszt: ");
        regSzamla1.betesz(420);
        System.out.println(regSzamla1);
        regSzamla1.kivesz(20);
        System.out.println(regSzamla1);

        System.out.println("Foloyoszamla teszt:");
        folySzamla1.betesz(45.8);
        System.out.println(folySzamla1);
        folySzamla1.kivesz(22.8);
        folySzamla1.levonKoltseg();
        System.out.println(folySzamla1);;

        System.out.println("Takarekszamla teszt:");
        takarekSzamla1.betesz(45.8);
        System.out.println(takarekSzamla1);
        takarekSzamla1.kivesz(22.8);
        System.out.println(takarekSzamla1);
        System.out.println(takarekSzamla1.getKamatRata());
        takarekSzamla1.hozzaadKamat();

        System.out.println(regSzamla1.equals(regSzamla2));
        System.out.println(regSzamla3.equals(regSzamla3));

        System.out.println(folySzamla1.equals(folySzamla2));
        System.out.println(folySzamla3.equals(folySzamla3));

        System.out.println(takarekSzamla1.equals(takarekSzamla2));
        System.out.println(takarekSzamla3.equals(takarekSzamla3));
        System.out.println(takarekSzamla3.equals(takarekSzamla4));
    }
}
