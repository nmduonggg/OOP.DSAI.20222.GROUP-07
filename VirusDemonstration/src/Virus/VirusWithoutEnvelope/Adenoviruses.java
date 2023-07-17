package Virus.VirusWithoutEnvelope;

import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;

public class Adenoviruses extends VirusWithoutEnvelope {
    private String fiber;
    private String pentonBase;
    private String hexon;

    public Adenoviruses(String name, String family, String structure, String mechanism, AcidNucleic acidNucleic, Capsid capsid, String fiber, String pentonBase, String hexon) {
        super(name, family, structure, mechanism, acidNucleic, capsid);
        this.fiber = fiber;
        this.pentonBase = pentonBase;
        this.hexon = hexon;
    }

    public String getFiber() {
        return fiber;
    }

    public String getPentonBase() {
        return pentonBase;
    }

    public String getHexon() {
        return hexon;
    }
}
