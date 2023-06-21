public class operadores {

    public static void main (String [] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.print(nomeCompleto);

       String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
          /*incremento*/
        int numero = 5;
        numero++;
        System.out.println(numero);

        /*operador ternario*/
        int a,b;
        a=5;
        b=6;

        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        /*operador relacional*/
        int numero1 = 1;
        int numero2 =2;

        boolean simNao = numero1 == numero2;

        System.out.println(simNao);

    }
}
