package c.stream;

public class StudentDTO {
    String name;
    int arg;
    int scoreMath;
    int scoreEnglish;

    public StudentDTO(String name, int arg, int scoreMath, int scoreEnglish){
        this.name = name;
        this.arg = arg;
        this.scoreMath = scoreMath;
        this.scoreEnglish = scoreEnglish;
    }

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public int getArg(){return arg;}
    public void setArg(int arg){this.arg = arg;}
    public int getScoreMath(){return scoreMath;}
    public void setScoreMath(int scoreMath){this.scoreMath = scoreMath;}
    public int getScoreEnglish(){return scoreEnglish;}
    public void setScoreEnglish(int scoreEnglish){this.scoreEnglish = scoreEnglish;}
}
