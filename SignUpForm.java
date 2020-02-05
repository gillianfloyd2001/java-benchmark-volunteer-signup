import java.io.Serializable;

public class SignUpForm implements Serializable {
    private static final long serialVersionUID = 1L;
    String firstName;
    String lastName;
    String phoneNumber;
    String emailAddress;
    String worshipTeam;
    String welcomeTeam;
    String productionTeam;
    String communityGroupTeam;
    String childrensMinistryTeam;
    String studentMinistryTeam;
    String moreInformation;

    public SignUpForm(String firstName, String lastName, String phoneNumber, String emailAddress, String worshipTeam,
            String welcomeTeam, String productionTeam, String communityGroupTeam, String childrensMinistryTeam,
            String studentMinistryTeam, String moreInformation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.worshipTeam = worshipTeam;
        this.welcomeTeam = welcomeTeam;
        this.productionTeam = productionTeam;
        this.communityGroupTeam = communityGroupTeam;
        this.childrensMinistryTeam = childrensMinistryTeam;
        this.studentMinistryTeam = studentMinistryTeam;
        this.moreInformation = moreInformation;
    }
}