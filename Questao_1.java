public class Questao_1{
    public static void main(String[] args) {

    int [] num = new int[6];
    num[0] = 8;
    num[1] = 9;
    num[2] = 7;
    num[3] = 4;
    num[4] = 5;
    num[5] = 6;

    int media1 = 0;
    for(int i = 0; i<3; i++)
        media1 += num[i];
    
    int media2 = 0;
    for(int i = 3; i<6; i++)
        media2 += num[i];
     
    float total1 = (float)media1/3;
    float total2 = (float)media2/3;
    float so_med = (float)media1+media2;
    float med_med = (float)so_med/2;

        System.out.println("A média aritmética dos números 8, 9 e 7 é: " + total1);
        System.out.println("A média aritmética dos números 4, 5 e 6 é: " + total2);
        System.out.println("A soma das duas médias é: " + so_med);
        System.out.println("A média das duas primeiras médias é: " + med_med);
    }
}