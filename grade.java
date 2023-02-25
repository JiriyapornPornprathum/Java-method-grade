public class grade {    
    private double Score ;
    private String message ;

    public void setChoice(int choice, double Score){
        switch (choice) {
            case 1:
                choice_1(Score);
                break;

            case 2:
                choice_2(Score);
                break;

            case 3:
                choice_3(Score);
                break;

            default:
                break;
        }
    }

    public String choice_1(double score){
        if (score >= 50) {
            this.message = "Pass";
        }else{
            this.message = "Not Pass";
        }
        return this.message;
    }

    public String choice_2(double score){
        if (score >= 80) {
            this.message = "Grade A";
        }else if (score >= 70) {
            this.message = "Grade B";
        }else if (score >= 60) {
            this.message = "Grade C";
        }else if (score >= 50) {
            this.message = "Grade D";
        }else if (score >= 0) {
            this.message = "Grade F";
        }else{
            this.message = "ERROR";
        }
        return this.message;
    }

    public String choice_3(double score){
        if (score >= 80) {
            this.message = "Grade A";
        }else if (score >= 75) {
            this.message = "Grade B+";
        }else if (score >= 70) {
            this.message = "Grade B";
        }else if (score >= 65) {
            this.message = "Grade C+";
        }else if (score >= 60) {
            this.message = "Grade C";
        }else if (score >= 55) {
            this.message = "Grade D+";
        }else if (score >= 50) {
            this.message = "Grade D";
        }else if (score >= 0) {
            this.message = "Grade F";
        }else{
            this.message = "ERROR";
        }
        return this.message;
    }

    public String display(){
        return this.message;
    }
}
