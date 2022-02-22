
public class fluxo {

    public static void main (String[] args) {
            System.out.println("Start main");
            metodo1();
            System.out.println("End main");
        
        public static class metodo1 () {
            System.out.println("Start metodo1");
            metodo2();
            System.out.println("End metodo1");

        }
        
        public static class metodo2 () {
            System.out.println("Start metodo2");
        
        for (i = 0; i <= 5; i++) {
            System.out.println(i);
        
        }
        System.out.println("End metodo2");

        }

    }

}