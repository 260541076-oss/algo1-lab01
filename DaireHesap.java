public class DaireHesap {
    public static void main(String[] args) {
        
        double yaricap = 3.5;

        
        double cevre = 2 * Math.PI * yaricap;
        double alan = Math.PI * yaricap * yaricap;

        
        System.out.println("Çevre: " + cevre);
        System.out.printf("Alan: %.2f%n", alan); 

        
        double alanBonus = Math.PI * Math.pow(yaricap, 2);
        System.out.println("Math.pow ile Alan: " + alanBonus);

        // [SAYIN HOCAMA NOT]: Math.pow(yaricap, 2) ile yaricap * yaricap tamamen AYNI sonucu veriyor.
    }
}