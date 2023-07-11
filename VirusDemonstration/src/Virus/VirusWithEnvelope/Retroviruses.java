package Virus.VirusWithEnvelope;

import java.util.List;

import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;

public class Retroviruses extends VirusWithEnvelope {
    private Glycoprotein glycoprotein;
    private final String reverseTranscriptase = "RNA -> DNA";
    
    public Retroviruses(String name, String family, String structure, List<String> mechanism, AcidNucleic acidNucleic, Capsid capsid, Envelope envelope, Glycoprotein glycoprotein) {
        super(name, family, structure, mechanism, acidNucleic, capsid, envelope);
        this.glycoprotein = glycoprotein;
    }

    public void reverseTranscriptase(Retroviruses retroviruses) {
        retroviruses.getAcidNucleic().setTypeAcidNucleic("DNA");
    }

    public Glycoprotein getGlycoprotein() {
        return glycoprotein;
    }

    public String getReverseTranscriptase() {
        return reverseTranscriptase;
    }
}
