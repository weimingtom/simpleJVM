package simpleJVM;

/**
 * Created by qc1iu on 4/2/16.
 */
class Interp
{
  private char ptr;
  private JavaFrame env;

  public Interp(JavaFrame env)
  {
    this.env = env;

  }

  public JavaType.T interp()
  {
    while (true) {
      switch (ptr) {
        case ByteCode.OPC_NOP:
          break;
        case ByteCode.OPC_ACONST_NULL:
          // TODO
          break;
        case ByteCode.OPC_RETURN :
          return null;
        case ByteCode.OPC_IADD:
          JavaType._Int v1 = (JavaType._Int) env.pop();
          JavaType._Int v2 = (JavaType._Int) env.pop();
          env.push(new JavaType._Int(v1.value+v2.value));
          break;
      }
    }
  }
}
