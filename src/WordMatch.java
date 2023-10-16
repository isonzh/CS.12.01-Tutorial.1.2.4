public class WordMatch {
    String guess;

    public WordMatch(String guess) {
        this.guess = guess;
    }

    public int scoreGuess(String s) {
        if (s.length() == 0) throw new IllegalArgumentException("Your guess cannot be an empty String!");
        if (s.length() > guess.length())
            throw new IllegalArgumentException("Your guess cannot exceed the number of characters in the Secret word");
        int count = 0;
        for (int i = 0; i < guess.length(); i++) {
            if (i + s.length() <= guess.length()) {
                String temp = guess.substring(i, i + s.length());
                if (temp.equals(s)) count++;
            }
        }
        return count * s.length() * s.length();
    }

        public String findBetterGuess (String scoreOne, String scoreTwo){
            int g1 = scoreGuess(scoreOne);
            int g2 = scoreGuess(scoreTwo);
            if (g1 > g2) return scoreOne;
            else if (g2 > g1) {
                return scoreTwo;
            } else {
                int alphabeticallyGreater = scoreOne.compareTo(scoreTwo);
                if (alphabeticallyGreater > 0) {
                    return scoreOne;
                }
                return scoreTwo;

            }
        }
    }


