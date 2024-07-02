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
