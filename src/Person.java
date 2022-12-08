public class Person {

    public int age;

    public Person(){
        // created 2 variable min and max
        int maxNumber = 80;
        int minNumber = 5;

        //create a variable with random number
        int age = (int) Math.floor(Math.random()*(maxNumber-minNumber+1)+minNumber);

    }

    public void getLifeStage(){
        System.out.println(" The person ");
        if(age <= 12){ //1 condition
            System.out.println(" is a Child");
        }else if(age == 13 && age < 19){  //second condition with ternary operator
            System.out.println(" is a Teen ");
        }else if(age == 20 && age < 59){
            System.out.println(" is an Adult");
        }else{
            System.out.println(" is a Senior Adult");
        }
        System.out.println(" stage of life");
    }

}
