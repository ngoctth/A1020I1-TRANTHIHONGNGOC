package _09_cleanCode.bai_tap.refacetoring;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore=0;
        if (scorePlayer1==scorePlayer2) score = "Deuce";

        else if (scorePlayer1>=4 || scorePlayer2>=4) {
            score = getString(scorePlayer1, scorePlayer2);
        }
        else {
            for (int i=1; i<3; i++) {
                if (i==1) tempScore = scorePlayer1;
                else { score+="-"; tempScore = scorePlayer2;}
                score = getRead(score, tempScore);
            }
        }
        return score;
    }

    private static String getRead(String score, int tempScore) {
        switch(tempScore) {
            case 0:
                score+="Love";
                break;
            case 1:
                score+="Fifteen";
                break;
            case 2:
                score+="Thirty";
                break;
            case 3:
                score+="Forty";
                break;
        }
        return score;
    }

    private static String getString(int scorePlayer1, int scorePlayer2) {
        String score;
        int minusResult = scorePlayer1-scorePlayer2;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    public static void main(String[] args) {
        TennisGame game = new TennisGame();
        System.out.println(TennisGame.getScore("nam","hoa",3,3));

    }
}
