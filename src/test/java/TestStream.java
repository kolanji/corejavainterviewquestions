import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamCTS {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.stream()
                .sorted(Comparator.comparing(Employee.getsalary==Employee.getsalary)
                        .thenComparing(Employee::getAge))
                .collect(Collectors.toList());

    }

    class TestException extends Exception {

        public TestException(String exception){
            super(exception)
        }
    }

    @RestControllerAdvice
    class GlobalException implements  {

        @ExceptionHandler
        public MethodDoesnotException methodDoesnotException(){

        }

    }





}
