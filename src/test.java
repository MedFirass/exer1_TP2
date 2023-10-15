public class test {
    public static void main(String[] args) {
        livre l1=new livre(62532,"seif","lost",12000);
        System.out.println(l1.getId());
        l1.tooString();
        System.out.println("l auteur: "+l1.getAuteur());
        l1.setAuteur("salah");
        System.out.println("le nouveau auteur: "+l1.getAuteur());

    }
}
