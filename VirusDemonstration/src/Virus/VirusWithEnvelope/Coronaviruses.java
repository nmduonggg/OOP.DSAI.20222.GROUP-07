package Virus.VirusWithEnvelope;

import java.util.List;

import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;

public class Coronaviruses extends VirusWithEnvelope {
    private Glycoprotein glycoprotein;

    public Coronaviruses(String name, String family, String structure, String mechanism, AcidNucleic acidNucleic, Capsid capsid, Envelope envelope, Glycoprotein glycoprotein) {
        super(name, family, structure, mechanism, acidNucleic, capsid, envelope);
        this.glycoprotein = glycoprotein;
    }

    public Glycoprotein getGlycoprotein() {
        return glycoprotein;
    }
}
