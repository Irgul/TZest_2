package com.company;
import java.util.Random;


class book {
    boolean nyitvae=false;
    Random rand = new Random();

   int  oldalszam= rand.nextInt(50) + 1;
   int mostani;
   void kinyit(){
       nyitvae=true;
       mostani=rand.nextInt(oldalszam)+1;
   }
    void bezar(){
        nyitvae=false;
    }
    void lapoz(int i) {
        if (i == 1) {
            mostani++;
        }
        if (i == -1) {
            mostani--;
        }
        if (i != 1 && i != -1) {
            System.out.println("Nem érvényes parancs");
        }
        if (mostani == 0 || mostani > oldalszam) {
            nyitvae = false;
        }
    }
        void porget(int i){
            int random = rand.nextInt(oldalszam);

            if (i == 1) {
                mostani+=random;
            }
            if (i == -1) {
                mostani-=random;
            }
            if (i != 1 && i != -1) {
                System.out.println("Nem érvényes parancs");
            }
            if (mostani < 1){
                mostani=1;
            }
            if (mostani > oldalszam){
                mostani=oldalszam;
            }

        }
        void nez(){
       if(nyitvae)
            System.out.println(mostani);
            if(!nyitvae){
                System.out.println("Zárva van");
            }
        }

    }



public class Main {

    public static void main(String[] args) {
                book konyv =new book();
                konyv.kinyit();
                konyv.porget(1);
                konyv.nez();
    }
}
