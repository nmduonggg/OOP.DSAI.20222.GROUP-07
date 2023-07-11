package Virus.VirusWithoutEnvelope;

import java.util.List;

import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;

public class Papillomaviruses extends VirusWithoutEnvelope {
    private final String histone = "Histones are proteins that play a vital role in organizing and packaging DNA in the nucleus of cells.";

    public Papillomaviruses(String name, String family, String structure, List<String> mechanism, AcidNucleic acidNucleic, Capsid capsid) {
        super(name, family, structure, mechanism, acidNucleic, capsid);
    }

    public String getHistone() {
        return histone;
    }
    
}
