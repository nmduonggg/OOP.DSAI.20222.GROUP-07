package Virus;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;
import Virus.VirusWithEnvelope.Coronaviruses;
import Virus.VirusWithEnvelope.Envelope;
import Virus.VirusWithEnvelope.Glycoprotein;
import Virus.VirusWithEnvelope.Herpesviruses;
import Virus.VirusWithEnvelope.Retroviruses;
import Virus.VirusWithEnvelope.VirusWithEnvelope;
import Virus.VirusWithoutEnvelope.Adenoviruses;
import Virus.VirusWithoutEnvelope.Papillomaviruses;

public class VirusManager {
    private Herpesviruses hsv1;
    private Retroviruses hiv;
    private Papillomaviruses hpv;
    private Adenoviruses adeno;
    private Coronaviruses cov2;

    private static List<Virus> viruses = new ArrayList<>();
    
    private static String virusesFolderPath = "/Virus/Viruses/";

    // public static void main(String[] args) {
        
    //     Virus HIV = new Retroviruses("HIV", "Retroviruses", null,null, new AcidNucleic("Retroviruses"), new Capsid("HIV"), new Envelope("HIV"), new Glycoprotein("Retroviruses"));
    //     HIV.setStructure(getStructure(virusesFolderPath, "HIV"));
    //     HIV.setMechanism(getMechanism(virusesFolderPath, "HIV"));
        
    //     Virus SARS_CoV_2 = new Coronaviruses("SARS_CoV_2", "Coronaviruses", null, null, new AcidNucleic("Coronaviruses"), new Capsid("SARS_CoV_2"), new Envelope("SARS_CoV_2"), new Glycoprotein("Coronaviruses"));
    //     SARS_CoV_2.setStructure(getStructure(virusesFolderPath, "SARS_CoV_2"));
    //     SARS_CoV_2.setMechanism(getMechanism(virusesFolderPath, "SARS_CoV_2"));

    //     Virus HSV_1 = new Herpesviruses("HSV_1", "Herpesviruses", null, null, new AcidNucleic("Herpesviruses"), new Capsid("HSV_1"), new Envelope("HSV_1"), new Glycoprotein("Herpesviruses"));
    //     HSV_1.setStructure(getStructure(virusesFolderPath, "HSV_1"));
    //     HSV_1.setMechanism(getMechanism(virusesFolderPath, "HSV_1"));

    //     Virus Adenovirus = new Adenoviruses("Adenovirus", "Adenoviruses", null, null, new AcidNucleic("Adenoviruses"), new Capsid("Adenovirus"), "12", "5", "240");
    //     Adenovirus.setStructure(getStructure(virusesFolderPath, "Adenovirus"));
    //     Adenovirus.setMechanism(getMechanism(virusesFolderPath, "Adenovirus"));

    //     Virus HPV = new Papillomaviruses("HPV", "Papillomaviruses", null, null, new AcidNucleic("Papillomaviruses"), new Capsid("HPV"));
    //     HPV.setStructure(getStructure(virusesFolderPath, "HPV"));
    //     HPV.setMechanism(getMechanism(virusesFolderPath, "HPV"));

    //     System.out.println("Virus name: " + SARS_CoV_2.getName());
    //     System.out.println("Virus family: " + SARS_CoV_2.getFamily());
    //     System.out.println("Virus structure: " + SARS_CoV_2.getStructure());
    //     System.out.println("Virus mechanism: " + SARS_CoV_2.getMechanism());
    //     System.out.println("Virus acid nucleic: " + SARS_CoV_2.getAcidNucleic().getTypeAcidNucleic());
    //     System.out.println("Virus capsid: " + SARS_CoV_2.getCapsid().getTypeCapsid());
    //     System.out.println("Virus envelope: " + ((VirusWithEnvelope) SARS_CoV_2).getEnvelope().getTypeEnvelope());
        
    //     viruses.add(HIV);
    //     viruses.add(SARS_CoV_2);
    //     viruses.add(HSV_1);
    //     viruses.add(Adenovirus);
    //     viruses.add(HPV);
    //     System.out.println(getViruses());
    // }

    public static String getStructure(String virusesFolderPath, String virusFolderName) {
        String structureFilePath = virusesFolderPath + virusFolderName + "/Structure.png";
        return structureFilePath;
    }      
    
    public static String getMechanism(String virusesFolderPath, String virusFolderName){
        String mechanismFilePath = virusesFolderPath + virusFolderName + "/Mechanism.mp4";
        return mechanismFilePath;
    }
    
    public static List<Virus> getViruses() {
        return viruses;
    }

    public void initialize() {
        hiv = new Retroviruses("HIV", "Retroviruses", null,null, new AcidNucleic("Retroviruses"), new Capsid("HIV"), new Envelope("HIV"), new Glycoprotein("Retroviruses"));
        hiv.setStructure(getStructure(virusesFolderPath, "HIV"));
        hiv.setMechanism(getMechanism(virusesFolderPath, "HIV"));
        hiv.setMechanismSummary("- Entry: HIV enters cells by binding to the CD4 receptor and a coreceptor, usually CCR5 or CXCR4. This triggers fusion of the viral and host cell membranes allowing entry of the viral capsid.\r\n" + //
                "- Reverse transcription: After entry, the viral RNA is reverse transcribed into DNA by the virally encoded reverse transcriptase.\r\n" + //
                "- Integration: The viral DNA is integrated into the host cell genome by the viral integrase enzyme. This establishes the provirus that can persist for the lifespan of the cell.\r\n" + //
                "- Replication: When the host cell is activated, the integrated provirus is transcribed, generating new viral RNAs and proteins. Viral proteins and RNA assemble at the plasma membrane to form new virions.\r\n" + //
                "- Evasion: HIV mutates rapidly due to the error-prone reverse transcriptase. This helps variants emerge that can evade immune responses and antiretroviral drugs.\r\n" + //
                "- CD4 depletion: HIV infects and kills CD4 T cells, leading to immunosuppression. The virus also impairs T cell function without necessarily killing the cells.\r\n" + //
                "- Latency: HIV can persist in a latent state in resting CD4 T cells. This reservoir of infected cells allows the virus to rebound if treatment is stopped.\r\n" + //
                "- In summary, HIV uses multiple mechanisms to enter cells, integrate, replicate, evade immunity, deplete CD4 cells, and establish latent reservoirs leading to the development of AIDS over time. ");
        
        cov2 = new Coronaviruses("SARS_CoV_2", "Coronaviruses", null, null, new AcidNucleic("Coronaviruses"), new Capsid("SARS_CoV_2"), new Envelope("SARS_CoV_2"), new Glycoprotein("Coronaviruses"));
        cov2.setStructure(getStructure(virusesFolderPath, "SARS_CoV_2"));
        cov2.setMechanism(getMechanism(virusesFolderPath, "SARS_CoV_2"));
        cov2.setMechanismSummary("- Entry into cells: SARS-CoV-2 enters cells by binding to the ACE2 receptor using its spike protein. This allows the viral envelope to fuse with the host cell membrane.\r\n" + //
                "- Replication: Once inside the cell, the SARS-CoV-2 RNA genome is released and translated into viral proteins. The viral RNA is replicated by the viral RNA-dependent RNA polymerase. Structural proteins assemble into new virions.\r\n" + //
                "- Release: New virions assemble and accumulate within vesicles derived from the Golgi apparatus and ER. These vesicles fuse with the plasma membrane to release new virions that can go on to infect other cells.\r\n" + //
                "- Evasion of innate immunity: SARS-CoV-2 uses several strategies to evade/inhibit early innate immune responses, including production of proteins that suppress interferon production and signaling. This delays development of antiviral immunity.\r\n" + //
                "- Hyperinflammation: Uncontrolled viral replication combined with an ineffective initial immune response can lead to hyperinflammation, cytokine storm, and cell death. This immunopathology contributes to COVID-19 severity.\r\n" + //
                "- In summary, SARS-CoV-2 uses multiple mechanisms at various steps of the viral life cycle to successfully infect cells, replicate, evade immunity, and induce severe disease in some patients.");

        hsv1 = new Herpesviruses("HSV_1", "Herpesviruses", null, null, new AcidNucleic("Herpesviruses"), new Capsid("HSV_1"), new Envelope("HSV_1"), new Glycoprotein("Herpesviruses"));
        hsv1.setStructure(getStructure(virusesFolderPath, "HSV_1"));
        hsv1.setMechanism(getMechanism(virusesFolderPath, "HSV_1"));
        hsv1.setMechanismSummary("- Entry: HSV-1 enters cells by fusion of the viral envelope with cell membranes. This is facilitated by binding of viral glycoproteins gB and gC to heparan sulfate on cell surfaces.\r\n" + //
                "- Replication: Once inside the cell, the HSV-1 DNA genome is released and replicates in the nucleus using the cell's replication machinery. The virus hijacks the host cell's transcriptional machinery to transcribe its own genes.\r\n" + //
                "- Latency: HSV-1 is able to establish latent infections in neuronal cell bodies. The viral DNA circularizes and is maintained as an episome with limited viral gene expression. Latency allows the virus to persist for the lifetime of the host.\r\n" + //
                "- Reactivation: Various stimuli can trigger reactivation from latency, leading to production of new viral particles. Stress, UV light, and immunosuppression are common triggers that stimulate lytic replication in neurons.\r\n" + //
                "- Immune evasion: HSV-1 employs various strategies to evade the immune response, including inhibition of MHC class I presentation, production of cytokines, and interference with complement activation.\r\n" + //
                "- Spread: New virions spread via anterograde transport in neurons. Vesicles carrying the virus travel down axons to infect epithelial cells at peripheral sites, typically the skin and mucous membranes.\r\n" + //
                "- In summary, HSV-1 uses multiple mechanisms to enter cells, replicate, establish latency, reactivate, evade immunity, and spread to new hosts.");

        adeno = new Adenoviruses("Adenovirus", "Adenoviruses", null, null, new AcidNucleic("Adenoviruses"), new Capsid("Adenovirus"), "12", "5", "240");
        adeno.setStructure(getStructure(virusesFolderPath, "Adenovirus"));
        adeno.setMechanism(getMechanism(virusesFolderPath, "Adenovirus"));
        adeno.setMechanismSummary("- Entry: Adenoviruses bind to host cell receptors like CAR, CD46, or sialic acid via the knob domain of the viral fiber protein. This triggers endocytosis of the virus.\r\n" + //
                "- Endosomal escape: Viral capsid proteins disrupt the endosomal membrane, allowing the virion to escape into the cytosol.\r\n" + //
                "- Nuclear import: Viral core proteins contain nuclear localization signals that enable the viral genome to enter the nucleus via nuclear pores.\r\n" + //
                "- Replication: Once in the nucleus, the linear double-stranded DNA genome is replicated using the cell's replication machinery. The virus forces the cell into S-phase to provide the factors needed for replication.\r\n" + //
                "- Transcription: Viral early genes like E1A are the first to be transcribed. These take over the host cell machinery to transcribe other viral genes needed for replication.\r\n" + //
                "- Assembly: New virions are assembled in the nucleus, aided by viral packaging proteins. The virions then escape upon cell lysis.\r\n" + //
                "- Immune evasion: Adenoviruses produce immunomodulatory proteins that block interferon signaling, cytokine production, antigen presentation, and apoptosis.\r\n" + //
                "- In summary, adenoviruses have evolved mechanisms to enter cells, escape the endosome, replicate in the nucleus, assemble new virions, and evade host immunity. ");

        hpv = new Papillomaviruses("HPV", "Papillomaviruses", null, null, new AcidNucleic("Papillomaviruses"), new Capsid("HPV"));
        hpv.setStructure(getStructure(virusesFolderPath, "HPV"));
        hpv.setMechanism(getMechanism(virusesFolderPath, "HPV"));
        hpv.setMechanismSummary("- Entry: HPV enters cells through microabrasions and binds to heparan sulfate proteoglycans and cell surface receptors.\r\n" + //
                "- Establishing infection: The viral genome is established as an extrachromosomal plasmid in infected basal epithelial cells. Early viral proteins promote cell proliferation and inhibition of apoptosis.\r\n" + //
                "- Genome replication: The viral genome replicates in synchrony with the cell cycle of the infected basal cell. The E1 and E2 proteins regulate viral DNA replication.\r\n" + //
                "- Productive infection: In mid and upper layers of the epithelium, the virus switches to late gene expression and produces capsid proteins L1 and L2.\r\n" + //
                "- Assembly and release: New virions are assembled in the nucleus. The virus causes cell lysis and death to release infectious particles.\r\n" + //
                "- Immune evasion: HPV avoids immune detection by minimal viral protein expression in lower layers. It downregulates antigen processing and MHC presentation.\r\n" + //
                "- Cancer: Persistent HPV infection can lead to integration of viral oncogenes like E6 and E7 into the host genome. This promotes tumorigenesis through cell cycle dysregulation.\r\n" + //
                "- In summary, HPV has evolved mechanisms to establish persistent infections in epithelial cells, evade immune detection, and potentially cause cancer after integration.");

        viruses.add(hiv);
        viruses.add(cov2);
        viruses.add(hsv1);
        viruses.add(adeno);
        viruses.add(hpv);
    }

    public Herpesviruses getHerpesvirus() {
        return hsv1;
    }

    public Retroviruses getRetrovirus() {
        return hiv;
    }

    public Papillomaviruses getPapilomavirus() {
        return hpv;
    }

    public Adenoviruses getAdenovirus() {
        return adeno;
    }

    public Coronaviruses getCoronavirus() {
        return cov2;
    }

}
