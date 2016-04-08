package simpleJVM;

import java.util.HashMap;

/**
 * Created by qc1iu on 4/2/16.
 */
class ClassBlock
{
  int accessFlag;
  String id;
  String superId;
  ConstantPool cp;
  private HashMap<String, FieldBlock> fieldTable;
  private HashMap<String, MethodBlock> methodTable;

  MethodBlock findMethod(String id)
  {
    return this.methodTable.get(id);
  }

  FieldBlock findField(String id)
  {
    return this.fieldTable.get(id);
  }

}
