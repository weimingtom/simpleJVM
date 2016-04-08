package simpleJVM;

import java.util.HashMap;

/**
 * Created by qc1iu on 4/2/16.
 */
class SimpleJVM
{
  public static final int CONSTANT_Utf8 = 1;
  public static final int CONSTANT_Integer = 3;
  public static final int CONSTANT_Float = 4;
  public static final int CONSTANT_Long = 5;
  public static final int CONSTANT_Double = 6;
  public static final int CONSTANT_Class = 7;
  public static final int CONSTANT_String = 8;
  public static final int CONSTANT_Fieldref = 9;
  public static final int CONSTANT_Methodref = 10;
  public static final int CONSTANT_InterfaceMethodref = 11;
  public static final int CONSTANT_NameAndType = 12;
  public static final int CONSTANT_MethodHandle = 15;
  public static final int CONSTANT_MethodType = 16;
  public static final int CONSTANT_InvokeDynamic = 18;

  public static final int ACC_PUBLIC = 0x0001;
  public static final int ACC_PRIVATE = 0x0002;
  public static final int ACC_PROTECTED = 0x0004;
  public static final int ACC_STATIC = 0x0008;
  public static final int ACC_FINAL = 0x0010;
  public static final int ACC_SUPER = 0x0020;
  public static final int ACC_SYNCHRONIZED = 0x0020;
  public static final int ACC_VOLATILE = 0x0040;
  public static final int ACC_BRIDGE = 0x0040;
  public static final int ACC_TRANSIENT = 0x0080;
  public static final int ACC_VARARGS = 0x0080;
  public static final int ACC_NATIVE = 0x0100;
  public static final int ACC_INTERFACE = 0x0200;
  public static final int ACC_ABSTRACT = 0x0400;
  public static final int ACC_STRICT = 0x0800;
  public static final int ACC_SYNTHETIC = 0x1000;
  public static final int ACC_ANNOTATION = 0x2000;
  public static final int ACC_ENUM = 0x4000;

  private static final SimpleJVM _instance = new SimpleJVM();
  private HashMap<String, ClassBlock> classTable;

  private SimpleJVM()
  {
    this.classTable = new HashMap<>();
  }

  public static void putClass(String id, ClassBlock c)
  {
    SimpleJVM._instance.classTable.put(id, c);
  }
}
