package pageObjects;

public class AllPageObjects {
    public AllPageObjects(){

    }
    private MainPageObjects mpo;
    private LocationPageObjects lpo;
    private GPInScotlandorWalesPageObjects gpswpo;
    private DentalPracticeLocationPageObjects dplpo;
    private DateOfBirthPageObjects dbpo;
    private PartnerPageObjects partnerpo;
    private BenefitOrTaxPageObjects btpo;
    private PregnantPageObjects pregnantpo;
    private WarPensionerPageObjects wppo;
    private DiabetesPageObjects dpo;
    private MedicalConditionsPageObjects mcpo;
    private GloucamaPageObjects gpo;
    private CareHomePageObjects chpo;
    private SavingsPageObjects spo;
    private InjuryOrIllnessPageObjects iipo;
    private SecurityMessagePageObjects smpo;



    public MainPageObjects mpo(){
        if(mpo==null){
            mpo = new MainPageObjects();
        }
        return mpo;
    }
    public InjuryOrIllnessPageObjects iipo(){
        if(iipo==null){
            iipo = new InjuryOrIllnessPageObjects();
        }
        return iipo;
    }

    public LocationPageObjects lpo(){
        if(lpo==null){
            lpo = new LocationPageObjects();
        }
        return lpo;
    }

    public GPInScotlandorWalesPageObjects gpswpo(){
        if(gpswpo==null){
            gpswpo = new GPInScotlandorWalesPageObjects();
        }
        return gpswpo;
    }

    public DentalPracticeLocationPageObjects dplpo(){
        if(dplpo==null){
            dplpo = new DentalPracticeLocationPageObjects();
        }
        return dplpo;
    }

    public DateOfBirthPageObjects dbpo(){
        if(dbpo==null){
            dbpo = new DateOfBirthPageObjects();
        }
        return dbpo;
    }

    public PartnerPageObjects partnerpo(){
        if(partnerpo==null){
            partnerpo = new PartnerPageObjects();
        }
        return partnerpo;
    }

    public BenefitOrTaxPageObjects btpo(){
        if(btpo==null){
            btpo = new BenefitOrTaxPageObjects();
        }
        return btpo;
    }

    public PregnantPageObjects pregnantpo(){
        if(pregnantpo==null){
            pregnantpo = new PregnantPageObjects();
        }
        return pregnantpo;
    }

    public WarPensionerPageObjects wppo(){
        if(wppo==null){
            wppo = new WarPensionerPageObjects();
        }
        return wppo;
    }

    public DiabetesPageObjects dpo(){
        if(dpo==null){
            dpo = new DiabetesPageObjects();
        }
        return dpo;
    }

    public MedicalConditionsPageObjects mcpo(){
        if(mcpo==null){
            mcpo = new MedicalConditionsPageObjects();
        }
        return mcpo;
    }

    public GloucamaPageObjects gpo(){
        if(gpo==null){
            gpo = new GloucamaPageObjects();
        }
        return gpo;
    }

    public CareHomePageObjects chpo(){
        if(chpo==null){
            chpo = new CareHomePageObjects();
        }
        return chpo;
    }

    public SavingsPageObjects spo(){
        if(spo==null){
            spo = new SavingsPageObjects();
        }
        return spo;
    }
    public SecurityMessagePageObjects smpo(){
        if(smpo==null){
            smpo=new SecurityMessagePageObjects();

        }
        return smpo;
    }
















}
