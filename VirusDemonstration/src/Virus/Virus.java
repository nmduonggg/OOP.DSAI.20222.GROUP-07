package Virus;
import java.util.List;

import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;

public abstract class Virus {
    private String name;
    private String family;
    private String structure;
    private List<String> mechanism;
    private AcidNucleic acidNucleic;
    private Capsid capsid;

    public Virus(String name, String family, String structure, List<String> mechanism, AcidNucleic acidNucleic, Capsid capsid) {
        this.name = name;
        this.family = family;
        this.structure = null;
        this.mechanism = null;
        this.acidNucleic = acidNucleic;
        this.capsid = capsid;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setMechanism(List<String> mechanism) {
        this.mechanism = mechanism;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getStructure() {
        return structure;
    }

    public List<String> getMechanism() {
        return mechanism;
    }

    public AcidNucleic getAcidNucleic() {
        return acidNucleic;
    }

    public Capsid getCapsid() {
        return capsid;
    }
}
