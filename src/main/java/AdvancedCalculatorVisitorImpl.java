import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class AdvancedCalculatorVisitorImpl extends AdvancedCalculatorBaseVisitor<BigDecimal> {

    private HashMap<String,  BigDecimal> variablesHashMap = new HashMap<>();

    @Override
    public BigDecimal visitNum(AdvancedCalculatorParser.NumContext ctx) {
        return new BigDecimal(ctx.NUMBER().getText());
    }

    @Override
    public BigDecimal visitParens(AdvancedCalculatorParser.ParensContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public BigDecimal visitMulDiv(AdvancedCalculatorParser.MulDivContext ctx) {
        final BigDecimal left = visit(ctx.expression(0));
        final BigDecimal right = visit(ctx.expression(1));
        if (ctx.op.getText().equals("*")) {
            return left.multiply(right);
        } else {
            return left.divide(right, 9, RoundingMode.HALF_UP);
        }
    }

    @Override
    public BigDecimal visitAddSub(AdvancedCalculatorParser.AddSubContext ctx) {
        final BigDecimal left = visit(ctx.expression(0));
        final BigDecimal right = visit(ctx.expression(1));
        if (ctx.op.getText().equals("+")) {
            return left.add(right);
        } else {
            return left.subtract(right);
        }
    }

    @Override
    public BigDecimal visitAllocation(AdvancedCalculatorParser.AllocationContext ctx) {
        variablesHashMap.put(ctx.VAR().getText(), visit(ctx.expression()));
        return variablesHashMap.containsKey(ctx.VAR().getText()) ? variablesHashMap.get(ctx.VAR().getText()) : BigDecimal.valueOf(0);
    }

    @Override
    public BigDecimal visitVariable(AdvancedCalculatorParser.VariableContext ctx){
        return variablesHashMap.containsKey(ctx.VAR().getText()) ? variablesHashMap.get(ctx.VAR().getText()) : BigDecimal.valueOf(0);
    }

    // TODO Implementieren sie die fehlenden Methoden (Sie brauchen einen Speicher um den aktuellen Wert der Variablen
    // TODO ablegen zu können - wählen Sie dazu eine entsprechende Datenstruktur).


}
