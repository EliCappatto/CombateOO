package combateoo;

public class CombateOO {

   public static void main(String[] args) {
       Lutadora l[] = new Lutadora[6]; 
       l[0] = new Lutadora("Angular", " Paris", 27, 51.3f, 1.70f, 11, 2, 2);
       l[1] = new Lutadora("Javagirl", "Washington", 29, 50.5f, 1.77f, 10, 3, 3);
       l[2] = new Lutadora("Janga", "Nova York", 22, 56.8f, 1.83f, 15, 2, 3 );
       l[3] = new Lutadora("Phytona", "Portugal", 31, 53.5f, 1.75f, 12, 3, 4);
       l[4] = new Lutadora("Comptia", "Brasil", 33, 61.8f, 1.83f, 9, 6, 3);
       l[5] = new Lutadora("Mixina", "Japão", 23, 62.9f, 1.79f, 10, 3, 4);
       // l.apresentar(); ou
      //l[3].status();
      
      Luta COO01 = new Luta();
      COO01.marcarLuta(l[5], l[4]);
      COO01.lutar();
      
    }
    
}
