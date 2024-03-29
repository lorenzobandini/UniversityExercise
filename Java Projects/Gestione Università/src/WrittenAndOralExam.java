public class WrittenAndOralExam extends AbstractExam {
    private int writtenGrade;

    public WrittenAndOralExam(String examName, int credits) {
        super(examName, credits);
        setOralGrade(0);
    }

    public int getWrittenGrade() {
        return writtenGrade;
    }

    public void setWrittenGrade(int writtenGrade) {
        if (writtenGrade < 0 || writtenGrade > 30) {
            throw new IllegalArgumentException("Il voto deve essere tra 0 e 30");
        }else{
        this.writtenGrade = writtenGrade;
        }
    }

    @Override
    public int getGrade() {
        return Math.round(((float)getOralGrade() + (float)this.writtenGrade) / 2);
    }
}