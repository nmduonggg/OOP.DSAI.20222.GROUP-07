package Virus.VirusWithoutEnvelope;


import Virus.Virus;
import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;

public class VirusWithoutEnvelope extends Virus {
    
    public VirusWithoutEnvelope(String name, String family, String structure, String mechanism, AcidNucleic acidNucleic, Capsid capsid) {
        super(name, family, structure, mechanism, acidNucleic, capsid);
    }

}
