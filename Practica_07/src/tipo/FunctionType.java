package tipo;

import java.util.List;

import ast.ASTNode;
import ast.VarDefinition;
import visitor.Visitor;

public class FunctionType implements Type {

	private int row = ASTNode.DEFAULT_ROW_COLUMN;
	private int column = ASTNode.DEFAULT_ROW_COLUMN;

	private Type returnType;
	private List<VarDefinition> parameters;

	public FunctionType(int row, int column, Type returnType, List<VarDefinition> parameters) {
		super();
		this.row = row;
		this.column = column;
		this.returnType = returnType;
		this.parameters = parameters;
	}

	@Override
	public int getLine() {
		return row;
	}

	@Override
	public int getColumn() {
		return column;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public Type getReturnType() {
		return returnType;
	}

	public void setReturnType(Type returnType) {
		this.returnType = returnType;
	}

	public List<VarDefinition> getParameters() {
		return parameters;
	}

	public void setParameters(List<VarDefinition> parameters) {
		this.parameters = parameters;
	}

	@Override
	public String toString() {
		String cad = "(";
		for (VarDefinition v : this.getParameters()) {
			cad += " " + v.toString() + ",";
		}
		cad += " ):";
		cad += "" + getReturnType().toString();
		return cad;
	}
	
	@Override
	public Object accept(Visitor v, Object o) {
		return v.visit(this, o);
	}

}