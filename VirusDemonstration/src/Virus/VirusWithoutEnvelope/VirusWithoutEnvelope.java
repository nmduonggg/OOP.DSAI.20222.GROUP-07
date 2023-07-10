package Virus.VirusWithoutEnvelope;


import Virus.Virus;
import Virus.infect;
import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;

public class VirusWithoutEnvelope extends Virus implements infect {
    
    public VirusWithoutEnvelope(String name, String family, AcidNucleic acidNucleic, Capsid capsid) {
        super(name, family, acidNucleic, capsid);
    }

    @Override
    public void infectHostCell() {
        // Implementation of infectHostCell() method
    }
}
