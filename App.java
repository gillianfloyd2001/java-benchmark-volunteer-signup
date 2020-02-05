import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<SignUpForm> signUpForms = loadForm();
        System.out.println("Are you a memeber of the church and looking for volunteering? (Yes/No)");
        String memeberOrAdmin = in.nextLine();
        while (true) {
            if (memeberOrAdmin.equals("Yes")) {
                fillingOutSignUpForm();
            } else {
                System.out.print("Would you like to review the forms: ");
                String choice = in.nextLine();
                break;
            }
            break;
        }
        saveForm(signUpForms);
    }

    private static ArrayList<SignUpForm> loadForm() {
        try {
            FileInputStream fileStream = new FileInputStream("signUpForm.ser");
            ObjectInputStream objInput = new ObjectInputStream(fileStream);
            ArrayList<SignUpForm> signUpForms = (ArrayList<SignUpForm>) objInput.readObject();
            objInput.close();
            return signUpForms;
        } catch (IOException | ClassNotFoundException | ClassCastException ex) {
            return new ArrayList<SignUpForm>();
        }
    }

    private static SignUpForm fillingOutSignUpForm() {
        System.out.println("First name: ");
        String firstName = in.nextLine();
        System.out.println("Last name: ");
        String lastName = in.nextLine();
        System.out.println("Phone number: ");
        String phoneNumber = in.nextLine();
        System.out.println("emailAddress: ");
        String emailAddress = in.nextLine();
        System.out.println("Are you interested in volunteering on the Worship team? (Yes/No)");
        String worshipTeam = in.nextLine();
        System.out.println("Are you interested in volunteering on the Welcome team? (Yes/No)");
        String welcomeTeam = in.nextLine();
        System.out.println("Are you interested in volunteering on the Production team? (Yes/No)");
        String productionTeam = in.nextLine();
        System.out.println("Are you interested in leading a Community Group? (Yes/No)");
        String communityGroupTeam = in.nextLine();
        System.out.println("Are you interested in teaching in Children's Ministry? (Yes/No)");
        String childrensMinistryTeam = in.nextLine();
        System.out.println("Are you interested in volunteering in Student Ministry? (Yes/No)");
        String studentMinistryTeam = in.nextLine();
        System.out.println("Are you interested in hearing more information about volunteer opportunities? (Yes/No)");
        String moreInformation = in.nextLine();
        System.out.println("Thanks! \nWe'll get back to you as soon as possible.");
        return new SignUpForm(firstName, lastName, phoneNumber, emailAddress, worshipTeam, welcomeTeam, productionTeam,
                communityGroupTeam, childrensMinistryTeam, studentMinistryTeam, moreInformation);
    }

    private static void saveForm(ArrayList<SignUpForm> signUpForms) {
        try {
            FileOutputStream fileStream = new FileOutputStream("SignUpForm.ser");
            ObjectOutputStream objOutput = new ObjectOutputStream(fileStream);
            objOutput.writeObject(signUpForms);
            objOutput.close();
        } catch (IOException ex) {
            System.out.println("Sorry, can't save this form.");
        }
    }
}