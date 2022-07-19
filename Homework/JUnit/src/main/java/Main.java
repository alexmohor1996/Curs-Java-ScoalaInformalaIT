import java.util.*;

import static org.junit.Assert.assertEquals;

public class Main{
    public enum Operator {
        PLUS("+"),
        MINUS("-");

        private final String operator;

        Operator(String operator) {
            this.operator = operator;
        }

        public String getOperator() {
            return operator;
        }

        public static Operator getByValue(String operator) {
            for (Operator operatorEnum : Operator.values()) {
                if (operatorEnum.getOperator().equals(operator)) {
                    return operatorEnum;
                }
            }

            throw new IllegalArgumentException("Invalid value");
        }
    }

    public enum MetricConvertor {
        m(1000),
        cm(10),
        mm(1),
        km(1000000),
        dm(100);

        private int scale;

        MetricConvertor(int scale) {
            this.scale = scale;
        }

        public int getScale() {
            return scale;
        }

    }

    public int calculator(String exp) {
        List<String> addList = new ArrayList<>();
        List<String> minusList = new ArrayList<>();
        int checkPoint = 0;
        boolean op = true;//default first value is plus
        // Split string with add/minus
        for (int i = 1; i < exp.length(); i++) {
            String s = exp.substring(i, i + 1);
            if (Operator.PLUS.getOperator().equals(s)) {
                checkOperator(addList, minusList, op, exp.substring(checkPoint, i).trim());
                checkPoint = i + 1;
                op = true;
                continue;
            }
                if (Operator.MINUS.getOperator().equals(s)) {
                checkOperator(addList, minusList, op, exp.substring(checkPoint, i).trim());
                checkPoint = i + 1;
                op = false;
                continue;
            }
        }
        // Add last string
        checkOperator(addList, minusList, op, exp.substring(checkPoint).trim());
        // Get sum each list
        int sumAdd = sumList(addList);
        int sumMinus = sumList(minusList);

       return sumAdd - sumMinus;
    }
    //sum a list
    private static int sumList(List<String> addList) {
        int sum = 0;
        for (String s: addList) {
            String[] arr = s.split(" ");
            int value = Integer.parseInt(arr[0]);
            int scale = MetricConvertor.valueOf(arr[1]).getScale();
            sum += value * scale;
        }
        return sum;
    }
    // check operator to put into approriate list
    private static void checkOperator(List<String> addList, List<String> minusList, boolean op, String substring) {
        if (op) {
            addList.add(substring);
        } else {
            minusList.add(substring);
        }
    }
}
