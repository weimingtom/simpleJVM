package simpleJVM;

/**
 * Created by qc1iu on 4/2/16.
 */
interface Frame
{
  void push(JavaType.T e);

  JavaType.T pop();

  JavaType.T peek();



}
