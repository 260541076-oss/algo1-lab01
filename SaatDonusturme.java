public class SaatDonusturme {
    public static void main(String[] args) {
     int toplamSaniye = 7384;

        int toplamDakika = toplamSaniye / 60;
        int saat = toplamDakika / 60;

        int dakika = toplamDakika % 60;
        int saniye = toplamSaniye % 60;

        System.out.println(saat + " saat " + dakika + " dakika " + saniye + " saniye");

        // [SAYIN HOCAMA NOT]: Saniyeyi adım adım 60'a bölerek dakika ve saati buldum kalanı da mod (%) ile hesapladım.
    }
}