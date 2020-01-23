package a.a.a;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

public final class r implements ListIterator {
  public static final r a = new r();
  
  @NotNull
  public Void a() {
    throw (Throwable)new NoSuchElementException();
  }
  
  @NotNull
  public Void b() {
    throw (Throwable)new NoSuchElementException();
  }
  
  public boolean hasNext() {
    return false;
  }
  
  public boolean hasPrevious() {
    return false;
  }
  
  public int nextIndex() {
    return 0;
  }
  
  public int previousIndex() {
    return -1;
  }
  
  public void remove() {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}


/* Location:              E:\TBS_MOBILE\Cawir\dex2jar-0.0.9.15-master\classes-dex2jar.jar!\a\a\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */