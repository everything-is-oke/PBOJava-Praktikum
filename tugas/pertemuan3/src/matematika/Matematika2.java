package matematika;
    public class Matematika2 extends Matematika {
        public int Modulus(int a, int b){
            this.i = a;
            this.j = b;
            return a % b;
        }
        public void tampilkanModulus(){
            System.out.println("Modulus      : " +i +" % " + j + " = " + Modulus(i,j));
        }
    }
