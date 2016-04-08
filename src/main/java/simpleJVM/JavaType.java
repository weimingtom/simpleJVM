package simpleJVM;

/**
 * Created by qc1iu on 4/2/16.
 */
class JavaType
{
  public static abstract class T
  {

  }

  public static class _Int extends T
  {
    int value;

    public _Int(int value)
    {
      this.value = value;
    }
  }

  public static class _Boolean extends T
  {
    boolean value;

    public _Boolean(boolean value)
    {
      this.value = value;
    }
  }

  public static class _Double extends T
  {
    double value;

    public _Double(double value)
    {
      this.value = value;
    }
  }

  public static class _Long extends T
  {
    long value;

    public _Long(long value)
    {
      this.value = value;
    }
  }

  public static class _Object extends T
  {

  }
}
