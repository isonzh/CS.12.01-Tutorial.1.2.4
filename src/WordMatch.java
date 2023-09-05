public class WordMatch {
    static String word;
    public WordMatch(String word){
        this.word=word;
    }
    public int scoreGuess(String guess){
        int guessLength = guess.length();
        int guessLengthSquare = guessLength*guessLength;
        if(guessLength>word.length()){
            throw new IllegalArgumentException("Your guess cannot exceed the number of characters in the Secret word");
        }
        if(guessLength==0){
            throw new IllegalArgumentException("Your guess cannot be an empty String!");
        }
        int occurrences = 0;
        for(int i=0; i<word.length()-guessLength+1;i++){
            System.out.println(occurrences);
            if(word.substring(i,(i+guessLength)).equals(guess)){
                occurrences++;

            }

        }
        int score = occurrences*guessLengthSquare;
        return score;


    }
    public String findBetterGuess(String scoreOne,String scoreTwo){
       int g1=scoreGuess(scoreOne);
       int g2=scoreGuess(scoreTwo);
       if(g1>g2) return scoreOne;
       else if(g2>g1){return scoreTwo;
       }
       else{
           int alphabeticallyGreater = scoreOne.compareTo(scoreTwo);
           if(alphabeticallyGreater>0){
               return scoreOne;
           }
           return scoreTwo;

       }
    }
}
