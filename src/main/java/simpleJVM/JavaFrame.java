package simpleJVM;

import java.util.Vector;

/**
 * Created by qc1iu on 4/2/16.
 */
public class JavaFrame implements Frame
{
  private java.util.Stack<JavaType.T> stack;
  private Vector<JavaType.T> locals;

  public JavaFrame(java.util.Stack<JavaType.T> stack, Vector<JavaType.T> locals)
  {
    this.stack = stack;
    this.locals = locals;
  }

  @Override
  public void push(JavaType.T e)
  {
    this.stack.push(e);
  }

  @Override
  public JavaType.T pop()
  {
    return this.stack.pop();
  }

  @Override
  public JavaType.T peek()
  {
    return this.stack.peek();
  }
}
