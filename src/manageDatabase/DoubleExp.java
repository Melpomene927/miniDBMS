package manageDatabase;

import structure.Value;
import dbms.DBExecutor;

public class DoubleExp extends Exp{
	private static final long serialVersionUID = 312384376123L;
	private double doubleNum;

	public DoubleExp(double doubleNum){
		this.doubleNum = doubleNum;
	}

	public double getDouble(){
		return this.doubleNum;
	}
	public Object accept(DBExecutor visitor, Value value) { return visitor.visit(this, value); }
}
