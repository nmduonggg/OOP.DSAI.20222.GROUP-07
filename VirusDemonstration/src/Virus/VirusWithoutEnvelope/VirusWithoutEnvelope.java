package Virus.VirusWithoutEnvelope;


import java.util.List;

import Virus.Virus;
import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;

public class VirusWithoutEnvelope extends Virus {
    
    public VirusWithoutEnvelope(String name, String family, String structure, List<String> mechanism, AcidNucleic acidNucleic, Capsid capsid) {
        super(name, family, structure, mechanism, acidNucleic, capsid);
    }

}
