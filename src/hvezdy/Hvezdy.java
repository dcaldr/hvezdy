/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvezdy;

/**
 *
 * @author Dan
 */
public class Hvezdy {
    //Var 
   
            
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //kresliHvezdy( 4, 6);
       // kresliHvezdy(7);
       kresliHvezdy("5");
    }
    //Verze Hvězda
    public static void kresliHvezdy(int n){
       for (int i=0; i<n;i++){
        System.out.println("*");
    }
    
}
    //Verze obdélník
    public static void kresliHvezdy(int sirka, int vyska){
         String  plus ="+";
    String pomlcka = "-";
    String svisle  ="|";
        String SirkaPlna="", SirkaPrazdna ="";
        for (int i=0;i< sirka; i++){
        SirkaPlna = SirkaPlna+ pomlcka;
        SirkaPrazdna = SirkaPrazdna +" ";
    }
        System.out.println(plus + SirkaPlna + plus);
        for(int i=0;i<vyska;i++){
            System.out.println(svisle + SirkaPrazdna +svisle);
        }
        System.out.println(plus + SirkaPlna + plus);
        
    }
    //Verze trojúhelník
    public static void kresliHvezdy(String trojuhelnik){
//        String Mezera ="";
//        String Svisle  ="|";
//        String Pomlcka = "-";
//        char lom = '\U+005C';
//        
//        
//        
//       try {
//         int vyska =  Integer.parseInt(trojuhelnik);
//         for(int i=0; i<vyska; i++){
//             System.out.println(Svisle+Mezera+ lom);
//             Mezera = Mezera+ " ";
//             Pomlcka = Pomlcka +"-";
//         }
//           System.out.println(Pomlcka);
//       }
//       finally{
        System.out.println("▲");
   // }
//}
}
}
