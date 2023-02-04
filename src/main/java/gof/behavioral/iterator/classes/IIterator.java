package gof.behavioral.iterator.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 28.10.2022 04:49
 * @class IIterator
 */
public interface IIterator {
    public boolean hasNext();

    public Product getNext();
}
