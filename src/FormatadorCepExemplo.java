public class FormatadorCepExemplo {
    public static void main(String[] args) {
     try{
        String cepFormatado = fromatarCep("");
        System.out.println("cepFormatado");
     }catch(CepInvalidoException e){
        System.out.println(" O cep não corresponde com as regras  de negocio");
     }

    }
        static String formatarCep(String cep) throws  CepInvalidoException{
            if(cep.length() !=8)
            throws new CepInvalidoException();

            //similando um cep formatado
            return "23.765-064";
        

    }

}
