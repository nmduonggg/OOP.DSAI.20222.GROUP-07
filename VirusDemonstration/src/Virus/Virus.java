package Virus;

import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;

public abstract class Virus {
    private String name;
    private String family;
    private String structure;
    private String mechanism;
    private AcidNucleic acidNucleic;
    private Capsid capsid;
    private String mechanismSummary;

    public Virus(String name, String family, String structure, String mechanism, AcidNucleic acidNucleic, Capsid capsid) {
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

    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    public void setMechanismSummary(String mechanismSummary) {
        this.mechanismSummary = mechanismSummary;
    }

    public String getMechanismSummary() {
        return mechanismSummary;
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

    public String getMechanism() {
        return mechanism;
    }

    public AcidNucleic getAcidNucleic() {
        return acidNucleic;
    }

    public Capsid getCapsid() {
        return capsid;
    }
}
