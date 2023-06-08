public class FinalExam2 extends GradedActivity2
{
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam2(int questions, int missed)
    {
        double numericSCore;

        numQuestions=questions;
        numMissed=missed;

        pointsEach=100.00/numQuestions;

        numericSCore=100.0-(missed*pointsEach);

        setScore(numericSCore);

        adjustSCore();
    }

    public double getPointsEach(){return pointsEach;}

    public int getNumMissed(){return numMissed;}

    private void adjustSCore()
    {
        double fraction;

        fraction =score-(int)score;

        if(fraction>=0.5)
            score=score+(1.0-fraction);
    }


}
