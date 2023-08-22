public class AutomobilioInformacija {

    private String marke;
    private String gamybosMetai;
    private String regNr;
    private String kuroTipas;

    @Override
    public String toString() {
        return " Marke='" + marke + '\'' +
                ", gamybosMetai='" + gamybosMetai + '\'' +
                ", regNr='" + regNr + '\'' +
                ", kuroTipas='" + kuroTipas + '\'';
    }

    public AutomobilioInformacija(String marke, String gamybosMetai, String regNr, String kuroTipas) {
        this.marke = marke;
        this.gamybosMetai = gamybosMetai;
        this.regNr = regNr;
        this.kuroTipas = kuroTipas;
    }
}
