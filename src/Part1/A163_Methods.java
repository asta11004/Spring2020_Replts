package Part1;

public class A163_Methods {

    public static boolean validateTask(boolean notEmpty, int taskId, int currentId) {

        if(notEmpty && taskId == currentId + 1) {
            return true;
        } else {
            return false;
        }

    }

}
