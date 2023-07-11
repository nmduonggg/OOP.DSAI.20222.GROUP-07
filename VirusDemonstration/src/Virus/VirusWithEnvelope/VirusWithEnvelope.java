package Virus.VirusWithEnvelope;

import java.util.List;

import Virus.Virus;
import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;

public class VirusWithEnvelope extends Virus {
    private Envelope envelope;
    
    public VirusWithEnvelope(String name, String family, String structure, List<String> mechanism, AcidNucleic acidNucleic, Capsid capsid, Envelope envelope) {
        super(name, family, structure, mechanism, acidNucleic, capsid);
        this.envelope = envelope;
    }
    
    public Envelope getEnvelope() {
        return envelope;
    }
}
