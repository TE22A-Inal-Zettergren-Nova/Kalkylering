public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Uppgift A");
        int tal1=23;
        int tal2=45;
        int summa;
        int produkt;
        summa=tal1+tal2;
        System.out.println(tal1+"+"+tal2+"="+summa);

        summa=tal1-tal2;
        System.out.println(tal1+"-"+tal2+"="+summa);

        System.out.println("Uppgift B");
        int tal3=234232;
        int tal4=3424;
        produkt=tal3*tal4;
        System.out.println(tal3+"*"+tal4+"="+produkt);

        produkt=tal2*tal3*tal4;
        System.out.println(tal2+"*"+tal3+"*"+tal4+"="+produkt);
        System.out.println("Produkten blev inte korrekt");

        System.out.println("Uppgift C");
        double kvot;
        int tal5 =10;
        int tal6=3;
        kvot = tal1/tal2;
        System.out.println(tal1+"/"+tal2+"="+kvot);

        kvot = tal6/tal3;
        System.out.println(tal6+"/"+tal3+"="+kvot);

    }
}
