import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Date;

public class Questao_2{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String dataR;
        long diasDif = 0;
        Float valor = (float) 0;
        float jurosF = 0;
        float descontado = 0;
        try{
            try (Scanner in = new Scanner(System.in)) {
            System.out.println("Digite o valor:");
            valor = in.nextFloat();
            System.out.println("Digite uma data: ");
            dataR = ler.nextLine();
            ler.close();
            System.out.println("O valor informado foi: " + valor);
            System.out.println("A data informada foi: " + dataR);
            String dataAtual = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
            // System.out.println(dataAtual);
            diasDif = compareData(dataR, dataAtual);
            jurosF = CalJuros(valor, diasDif);
            System.out.println("O juros calculado sobre o valor informado é de: " + jurosF);
            descontado = Desc(valor);
            System.out.println("O desconto de 10% no valor informado é de: " + descontado);
            }
        }   catch (Exception ex){
            ex.printStackTrace();
            }
    }

public static long compareData (String dataR, String dataAtual) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String String1 = dataR;
    String String2 = dataAtual;
    Long diasDif = (long) 0;
    
    try {
      Date date1 = sdf.parse(String1);
      Date date2 = sdf.parse(String2);
      long difDias = date2.getTime() - date1.getTime();
      // System.out.println ("Dias: " + TimeUnit.DAYS.convert(difDias, TimeUnit.MILLISECONDS));
      diasDif = TimeUnit.DAYS.convert(difDias, TimeUnit.MILLISECONDS);
    } catch (ParseException e) {
      e.printStackTrace();
    }
return(diasDif);
} 

public static Float CalJuros(Float valor, Long diasDif){
  Float capital = valor;
  Float taxa = (float) 0.0001;
  Long dias = diasDif;
    
  Float montante = (float) (capital * Math.pow((1 + taxa), dias));  
  Float juros = montante - capital;
  juros = (float) (Math.round(juros*100.0)/100.0);
  montante = (float) (Math.round(montante*100.0)/100.0);
  
  // System.out.println("O total de juros a ser pago é: " 
  //   + juros);
  // System.out.println("O montante a ser pago é: " 
  //   + montante);
  
  return (float) (juros);
  }

  public static Float Desc(Float valor){
    Float valorDesc = (float) (valor * 0.10);
    return (valorDesc);
  }
}