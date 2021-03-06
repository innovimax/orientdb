/* Generated By:JJTree: Do not edit this line. OIsNotDefinedCondition.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import com.orientechnologies.orient.core.db.record.OIdentifiable;

import java.util.Map;

public class OIsNotDefinedCondition extends OBooleanExpression {

  protected OExpression expression;

  public OIsNotDefinedCondition(int id) {
    super(id);
  }

  public OIsNotDefinedCondition(OrientSql p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  @Override
  public boolean evaluate(OIdentifiable currentRecord) {
    return false;
  }
  @Override public void replaceParameters(Map<Object, Object> params) {
    expression.replaceParameters(params);
  }
}
/* JavaCC - OriginalChecksum=1c766d6caf5ccae19c1c291396bb56f2 (do not edit this line) */
