public class PassFailExam extends PassFailActivity
{
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public PassFailExam(int quests, int missed, double minPassing)
    {
        super(minPassing);
        double numericScore;

        numQuestions=quests;
        numMissed=missed;
        pointsEach=100.0/quests;
        numericScore=100.0-(missed*pointsEach);
        setScore(numericScore);
    }

    public double getPointsEach()
    {
        return pointsEach;
    }

    public int getNumMissed()
    {
        return  numMissed;
    }

}
