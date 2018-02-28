package ast;

public class ArrayAccess implements Expression {

	private int row = ASTNode.DEFAULT_ROW_COLUMN;
	private int column = ASTNode.DEFAULT_ROW_COLUMN;

	private Expression exp;

	private Expression name;

	public ArrayAccess(int row, int column, Expression name, Expression exp) {
		super();
		this.row = row;
		this.column = column;
		this.exp = exp;
		this.name = name;
	}

	@Override
	public int getLine() {
		return row;
	}

	@Override
	public int getColumn() {
		return column;
	}

	public Expression getExp() {
		return exp;
	}

	public void setExp(Expression exp) {
		this.exp = exp;
	}

	public Expression getName() {
		return name;
	}

	public void setName(Expression name) {
		this.name = name;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	@Override
	public String toString() {
		return "ArrayAccess [row=" + row + ", column=" + column + ", exp=" + exp + ", name=" + name + "]";
	}

}