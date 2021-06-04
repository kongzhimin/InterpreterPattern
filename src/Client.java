public class Client {
    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
         Expression isMarriedWomen = getMarriedWomanExpression();

         System.out.println("John is male?" + isMale.interpret("John"));
         System.out.println("julie is a married women?"+isMarriedWomen.interpret("Married Julie"));
    }
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert,john);
    }
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie,married);
    }
}
