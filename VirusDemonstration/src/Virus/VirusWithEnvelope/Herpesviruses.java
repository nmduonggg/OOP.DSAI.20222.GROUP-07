package Virus.VirusWithEnvelope;

import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;

public class Herpesviruses extends VirusWithEnvelope {
    private String tegument;
    private Glycoprotein glycoprotein;

    public Herpesviruses(String name, String family, AcidNucleic acidNucleic, Capsid capsid, Envelope envelope, String tegument, Glycoprotein glycoprotein) {
        super(name, "Herpesviruses", acidNucleic, capsid, envelope);
        this.tegument = tegument;
        this.glycoprotein = glycoprotein;
    }

    public String getTegument() {
        return tegument;
    }

    public Glycoprotein getGlycoprotein() {
        return glycoprotein;
    }
}
