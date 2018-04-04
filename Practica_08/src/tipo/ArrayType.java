package tipo;

import visitor.Visitor;

public class ArrayType extends AbstractType {

	private int off;
	private Type of;

	public ArrayType(int row, int column, int off, Type of) {
		super();
		this.row = row;
		this.column = column;
		this.off = off;
		this.of = of;
	}

	public int getOff() {
		return off;
	}

	public void setOff(int off) {
		this.off = off;
	}

	public Type getOf() {
		return of;
	}

	public void setOf(Type of) {
		this.of = of;
	}

	@Override
	public String toString() {
		return "[ " + this.off + " ]" + this.of.toString();
	}

	@Override
	public Object accept(Visitor v, Object o) {
		return v.visit(this, o);
	}

}
