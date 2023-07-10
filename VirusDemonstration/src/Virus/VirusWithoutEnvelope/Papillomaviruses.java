package Virus.VirusWithoutEnvelope;

import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;

public class Papillomaviruses extends VirusWithoutEnvelope {
    private String histone;

    public Papillomaviruses(String name, String family, AcidNucleic acidNucleic, Capsid capsid, String histone) {
        super(name, family, acidNucleic, capsid);
        this.histone = histone;
    }

    public String getHistone() {
        return histone;
    }
    
}
