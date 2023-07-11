package Virus.VirusWithEnvelope;

import java.util.List;

import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;

public class Herpesviruses extends VirusWithEnvelope {
    private final String tegument = "A protein-rich layer between the envelope and the capsid.";
    private Glycoprotein glycoprotein;

    public Herpesviruses(String name, String family, String structure, List<String> mechanism, AcidNucleic acidNucleic, Capsid capsid, Envelope envelope, Glycoprotein glycoprotein) {
        super(name, family, structure, mechanism, acidNucleic, capsid, envelope);
        this.glycoprotein = glycoprotein;
    }

    public String getTegument() {
        return tegument;
    }

    public Glycoprotein getGlycoprotein() {
        return glycoprotein;
    }
}
