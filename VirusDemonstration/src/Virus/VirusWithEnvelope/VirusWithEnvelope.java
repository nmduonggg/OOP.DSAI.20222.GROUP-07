package Virus.VirusWithEnvelope;

import Virus.Virus;
import Virus.infect;
import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;

public class VirusWithEnvelope extends Virus implements infect {
    private Envelope envelope;
    
    public VirusWithEnvelope(String name, String family, AcidNucleic acidNucleic, Capsid capsid, Envelope envelope) {
        super(name, family, acidNucleic, capsid);
        this.envelope = envelope;
    }
    
    public Envelope getEnvelope() {
        return envelope;
    }

    @Override
    public void infectHostCell() {
        // Implementation of infectHostCell() method
    }
}
