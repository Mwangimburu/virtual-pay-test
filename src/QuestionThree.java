public class QuestionThree {

    public static void main(String[] args) {
        System.out.println(solution(1,4));
    }


    public static String solution(int A, int B) {

        StringBuilder solutionString = new StringBuilder();

        while (A > 0 || B > 0) {
            boolean appendA = false;
            int solutionStringLength = solutionString.length();
            if (solutionStringLength >= 2 && solutionString.charAt(solutionStringLength - 1) == solutionString.charAt(solutionStringLength - 2)) {
                if (solutionString.charAt(solutionStringLength - 1) == 'b')
                    appendA = true;
            } else {
                if (A >= B)
                    appendA = true;
            }

            if (appendA) {
                A--;
                solutionString.append('a');
            } else {
                B--;
                solutionString.append('b');
            }
        }

        return solutionString.toString();
    }

}