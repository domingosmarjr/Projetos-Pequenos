public class Codificador {

    private String charBase;
    private String charCodi;

    private String textoBase = "";
    private String textoCodificado = "";

    Codificador(String base, String codificador) {
        if (verificarTamanho(base, codificador)) {
            this.charBase = base;
            this.charCodi = codificador;
        } else {
            throw new IllegalArgumentException("Tamanhos de textos não são iguais.");
        }
    }

    // CODIFICADOR
    public void codificar(String texto) {

        this.textoBase = texto;

        // TODO: ajustar, está codificando errado.
        for (int i = 0 ; i < texto.length() ; i++) {
            for (int x = 0; x < charBase.length(); x++) {
                if(texto.charAt(i) == charBase.charAt(x) || texto.charAt(i) - 32 == charBase.charAt(x) - 32 || texto.charAt(i) + 32 == charBase.charAt(x) - 32)
                    textoCodificado += charCodi.charAt(i);
            }            
        }        
    }

    public String getCharBase() {
        return this.charBase;
    }

    public String getCharCode() {
        return this.charCodi;
    }
    public String getTextoBase() {
        return this.textoBase;
    }

    public String getTextoCodificado() {
        return this.textoCodificado;
    }


    // DECODIFICADOR
    public void decodificar (String texto) {

    }

    // VERIFICADORES
    private boolean verificarTamanho(String base, String codigo) {
        return base.length() == codigo.length();
    }
}