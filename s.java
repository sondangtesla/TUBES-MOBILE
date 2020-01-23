package a.a.a;

import a.a.b.b.d;
import a.a.b.b.h;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class s implements Serializable, List, RandomAccess {
  public static final s a = new s();
  
  public int a() {
    return 0;
  }
  
  @NotNull
  public Void a(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Empty list doesn't contain element at index ");
    stringBuilder.append(paramInt);
    stringBuilder.append('.');
    throw (Throwable)new IndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public boolean a(@NotNull Void paramVoid) {
    h.b(paramVoid, "element");
    return false;
  }
  
  public boolean addAll(int paramInt, Collection paramCollection) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean addAll(Collection paramCollection) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public int b(@NotNull Void paramVoid) {
    h.b(paramVoid, "element");
    return -1;
  }
  
  public int c(@NotNull Void paramVoid) {
    h.b(paramVoid, "element");
    return -1;
  }
  
  public void clear() {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean contains(Object paramObject) {
    return (paramObject instanceof Void) ? a((Void)paramObject) : false;
  }
  
  public boolean containsAll(@NotNull Collection paramCollection) {
    h.b(paramCollection, "elements");
    return paramCollection.isEmpty();
  }
  
  public boolean equals(@Nullable Object paramObject) {
    return (paramObject instanceof List && ((List)paramObject).isEmpty());
  }
  
  public int hashCode() {
    return 1;
  }
  
  public final int indexOf(Object paramObject) {
    return (paramObject instanceof Void) ? b((Void)paramObject) : -1;
  }
  
  public boolean isEmpty() {
    return true;
  }
  
  @NotNull
  public Iterator iterator() {
    return r.a;
  }
  
  public final int lastIndexOf(Object paramObject) {
    return (paramObject instanceof Void) ? c((Void)paramObject) : -1;
  }
  
  @NotNull
  public ListIterator listIterator() {
    return r.a;
  }
  
  @NotNull
  public ListIterator listIterator(int paramInt) {
    if (paramInt == 0)
      return r.a; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Index: ");
    stringBuilder.append(paramInt);
    throw (Throwable)new IndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public boolean remove(Object paramObject) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean removeAll(Collection paramCollection) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean retainAll(Collection paramCollection) {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final int size() {
    return a();
  }
  
  @NotNull
  public List subList(int paramInt1, int paramInt2) {
    if (paramInt1 == 0 && paramInt2 == 0)
      return this; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("fromIndex: ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(", toIndex: ");
    stringBuilder.append(paramInt2);
    throw (Throwable)new IndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public Object[] toArray() {
    return d.a(this);
  }
  
  public <T> T[] toArray(T[] paramArrayOfT) {
    return (T[])d.a(this, (Object[])paramArrayOfT);
  }
  
  @NotNull
  public String toString() {
    return "[]";
  }
}


/* Location:              E:\TBS_MOBILE\Cawir\dex2jar-0.0.9.15-master\classes-dex2jar.jar!\a\a\a\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */