import java.util.Scanner;

public class MyersBriggsTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;
        int aCount = 0;
        int bCount = 0;
        int aCount1 = 0;
        int bCount1 = 0;
        int aCount2 = 0;
        int bCount2 = 0;
        int aCount3 = 0;
        int bCount3 = 0;


        String [][] answers = new String[5][8];

        System.out.printf("%s%n" , "Select only A or B \n 1. A. Expend Energy\t B. Conserve Energy");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[0][0] = "a";
                break;
            case "B" , "b":
                answers[0][1] = "B";
                break;
        }

        System.out.printf("%s%n" , "Select only A or B \n 2. A. Interpret Literally\t B. Look For Meaning");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[0][2] = "A";
                break;
            case "B" , "b":
                answers[0][3] = "B";
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 3. A.Logical, Thinking, Questioning\t B.Empathetic, Feeling, Accomodating");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[0][4] = "A";
                break;
            case "B" , "b":
                answers[0][5] = "B";
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 4. A.Organized, Orderly\t B.Flexible, Adaptable");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[0][6] = "A";
                break;
            case "B" , "b":
                answers[0][7] = "B";
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 5. A.More Outgoing, Think out Loud\t B.More Reserved, Think to Yourself");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[1][0] = "A";
                break;
            case "B" , "b":
                answers[1][1] = "B";
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 6. A.Practical, Realistic, Experiential\t B.Imaginative, Innovative, Theoretical");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[1][2] = "A";
                aCount1++;
                break;
            case "B" , "b":
                answers[1][3] = "B";
                bCount1++;
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 7. A. Candid, Straightforward, Frank\t B.Imaginative, Tactful, Kind, Encouraging");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[1][4] = "A";
                aCount2++;
                break;
            case "B" , "b":
                answers[1][5] = "B";
                bCount2++;
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 8. A. Plan, Schedule\t B.Unplanned, Spontaneous");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[1][6] = "A";
                aCount3++;
                break;
            case "B" , "b":
                answers[1][7] = "B";
                bCount3++;
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 9. A. Seek Many Tasks, Public Activities, Interaction with Others\t B.Seek Private, Solitary Activities with Quiet to Concentrate");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[2][0] = "A";
                aCount++;
                break;
            case "B" , "b":
                answers[2][1] = "B";
                bCount++;
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 10. A. Standard, Usual, Conventional\t B.Different, Novel, Unique");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[2][2] = "A";
                aCount1++;
                break;
            case "B" , "b":
                answers[2][3] = "B";
                bCount1++;
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 11. A.Firm, Tend to criticize, Hold the Line\t B.Gentle, Tend to Appreciate, Conciliate");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[2][4] = "A";
                aCount2++;
                break;
            case "B" , "b":
                answers[2][5] = "B";
                bCount2++;
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 12. A.Regulated, Structured\t B. Easygoing, Live and Let Live");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[2][4] = "A";
                aCount3++;
                break;
            case "B" , "b":
                answers[2][5] = "B";
                bCount3++;
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 13. A.External, Communicative\t B. Internal, reticent, keep to yourself");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[3][0] = "A";
                aCount++;
                break;
            case "B" , "b":
                answers[3][1] = "B";
                bCount++;
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 14. A.Focus on here-and-now \t B. Look to the future, global perspective, big picture");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[3][0] = "A";
                aCount1++;
                break;
            case "B" , "b":
                answers[3][1] = "B";
                bCount1++;
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 15. A.Tough-minded, Just \t B. Tender-hearted, Merciful");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[3][4] = "A";
                aCount2++;
                break;
            case "B" , "b":
                answers[3][5] = "B";
                bCount2++;
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 16. A.Preparation, Plan Ahead \t B. Go with the flow, Adapt as you go");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[3][6] = "A";
                aCount3++;
                break;
            case "B" , "b":
                answers[3][7] = "B";
                bCount3++;
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 17. A.Active, Initiate \t B. Reflective, Deliberate");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[4][0] = "A";
                aCount++;
                break;
            case "B" , "b":
                answers[4][1] = "B";
                bCount++;
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 18. A.Facts, Things,'What is' \t B. Ideas, Dreams,'What could be', Philosophical");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[4][2] = "A";
                aCount1++;
                break;
            case "B" , "b":
                answers[4][3] = "B";
                bCount1++;
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 19. A.Matter of Fact, Issue-oriented \t B. Sensitive, People-oriented, Compassionate");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[4][4] = "A";
                aCount2++;
                break;
            case "B" , "b":
                answers[4][5] = "B";
                bCount2++;
                break;
        }
        System.out.printf("%s%n" , "Select only A or B \n 20. A.Control, Govern \t B. Latitude, Freedom");
        answer = input.nextLine();
        switch (answer){
            case "A" ,"a":
                answers[4][6] = "A";
                aCount3++;
                break;
            case "B" , "b":
                answers[4][7] = "B";
                bCount3++;
                break;
        }
        if(aCount < bCount){
            System.out.println("You are an Introvert");
        }
        else {
            System.out.println(" You are an Extrovert");
        }
        if(aCount1 < bCount1){
            System.out.println("You are Intuitive");
        }
        else {
            System.out.println(" You are Sensing");
        }
        if(aCount2 < bCount2){
            System.out.println("You are Feeling");
        }
        else {
            System.out.println(" You are Thinking");
        }
        if(aCount3 < bCount3){
            System.out.println("You are Prospecting");
        }
        else {
            System.out.println(" You are Judging");
        }
    }
}
