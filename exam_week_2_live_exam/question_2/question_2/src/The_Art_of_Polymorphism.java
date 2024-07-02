package exam_week_2_live_exam.question_2.question_2.src;
public class The_Art_of_Polymorphism {
    public static void main(String[] args) throws Exception {
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        football.play();
        basketball.play();
        rugby.play();
    }
}
