public class QuestionOne {
    public static void main(String[] args) {

        /**
         *Initialization of the doorsState
         */
        String[] doorsState = new String[101];

        /**
         *close all the doorsState
         */
        for (int i = 1; i <= 100; i++) {
            doorsState[i] = "closed";
        }

        /**
         *Passing through the doors and toggling state
         */
        for (int rounds = 1; rounds <= 100; rounds++) {

            for (int i = 1; i <= 100; i++) {
                if (i % rounds == 0) {
                    doorsState[i] = toggle(doorsState[i]);
                }
            }

        }

        /**
         *Check/Outputting doorsState status
         */
        for (int i = 1; i <= 100; i++) {
            System.out.println("Door " + i + " " + doorsState[i]);
        }

    }


    public static String toggle(String label) {

        /**
         *Toggle door state.
         */
        if (label == "closed")
            return "open";
        else
            return "closed";
    }
}
