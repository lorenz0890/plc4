import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class AdvancedCalculatorVisitorImpl extends AdvancedCalculatorBaseVisitor<BigDecimal> {

    private HashMap<String,  BigDecimal> variablesHashMap = new HashMap<>();
    private BigDecimal lastResult =  new BigDecimal(0);

    @Override
    public BigDecimal visitNum(AdvancedCalculatorParser.NumContext ctx) {
        lastResult = new BigDecimal(ctx.NUMBER().getText());
        return lastResult;
    }

    @Override
    public BigDecimal visitParens(AdvancedCalculatorParser.ParensContext ctx) {
        lastResult = visit(ctx.expression());
        return lastResult;
    }

    @Override
    public BigDecimal visitMulDiv(AdvancedCalculatorParser.MulDivContext ctx) {
        final BigDecimal left = visit(ctx.expression(0));
        final BigDecimal right = visit(ctx.expression(1));
        if (ctx.op.getText().equals("*")) {
            lastResult = left.multiply(right);
            return lastResult;
        } else {
            lastResult = left.divide(right, 9, RoundingMode.HALF_UP);
            return lastResult;
        }
    }

    @Override
    public BigDecimal visitAddSub(AdvancedCalculatorParser.AddSubContext ctx) {
        final BigDecimal left = visit(ctx.expression(0));
        final BigDecimal right = visit(ctx.expression(1));
        if (ctx.op.getText().equals("+")) {
            lastResult = left.add(right);
            return lastResult;
        } else {
            lastResult = left.subtract(right);
            return lastResult;
        }
    }

    @Override
    public BigDecimal visitAllocation(AdvancedCalculatorParser.AllocationContext ctx) {
        variablesHashMap.put(ctx.VAR().getText(), visit(ctx.expression()));
        lastResult = variablesHashMap.containsKey(ctx.VAR().getText()) ? variablesHashMap.get(ctx.VAR().getText()) : BigDecimal.valueOf(0);
        return lastResult;
    }

    @Override
    public BigDecimal visitVariable(AdvancedCalculatorParser.VariableContext ctx){
        lastResult = variablesHashMap.containsKey(ctx.VAR().getText()) ? variablesHashMap.get(ctx.VAR().getText()) : BigDecimal.valueOf(0);
        return lastResult;
    }

    @Override
    public BigDecimal visitEof (AdvancedCalculatorParser.EofContext ctx){
        return lastResult;
    }

    // TODO Implementieren sie die fehlenden Methoden (Sie brauchen einen Speicher um den aktuellen Wert der Variablen
    // TODO ablegen zu können - wählen Sie dazu eine entsprechende Datenstruktur).


}
