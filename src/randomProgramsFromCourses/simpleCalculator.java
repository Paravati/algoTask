package randomProgramsFromCourses;

public class simpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }

    public double getSubtractionResult(){
        return secondNumber - firstNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }

    public double getDivisionResult(){
        double result = 0.0;
        if (secondNumber == 0){
            return 0;
        } else{
           result = firstNumber / secondNumber;

        }
        return result;
    }


}

