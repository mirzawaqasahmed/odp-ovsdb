package org.opendaylight.ovsdb.lib.message.operations;

import java.util.List;

import org.opendaylight.ovsdb.lib.notation.Condition;
//TODO Madhu : This is not complete. Getting it in to enable other committers to make progress
public class DeleteOperation extends Operation {
    String table;
    List<Condition> where;

    public DeleteOperation(String table, List<Condition> where) {
        super();
        super.setOp("delete");
        this.table = table;
        this.where = where;
    }
    public String getTable() {
        return table;
    }
    public void setTable(String table) {
        this.table = table;
    }
    public List<Condition> getWhere() {
        return where;
    }
    public void setWhere(List<Condition> where) {
        this.where = where;
    }
}
