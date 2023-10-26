package com.java.List;

public interface AbstractList<E> {

    /**
     * Добавляет указанный элемент в конец списка.
     *
     * @param element   элемент.
     */
    void add(E element);

    /**
     * Вставляет указанный элемент в указанную позицию в списке.
     *
     * @param index     позиция
     * @param element   элемент
     */
    void add(int index, E element);

    /**
     * Удаляет все элементы из этого списка.
     */
    void clear();

    /**
     * Возвращает true, если этот список содержит указанный элемент.
     *
     * @param element   элемент.
     * @return          true, если элемент содержтся в списке, false - иначе.
     */
    boolean contains(E element);

    /**
     * Сравнивает указанный списком с этим списком на предмет равенства.
     * @param list  список.
     * @return      true, если списки одинаковы, false - иначе.
     */
    boolean equals(List<E> list);

    /**
     * Возвращает элемент в указанной позиции в списке.
     *
     * @param index позиция.
     * @return      элемент на этой позиции.
     */
    E get(int index);

    /**
     * Возвращает элемент в указанной позиции в списке.
     *
     * @param element   значение элемента.
     * @return          позиция элемента.
     */
    int indexOf(E element);

    /**
     * Возвращает true, если этот список не содержит элементов.
     *
     * @return true, если список пуст, false - иначе.
     */
    boolean isEmpty();

    /**
     * Удаляет элемент в указанной позиции в списке.
     *
     * @param index позиция удаляемого элемента.
     */
    void remove(int index);

    /**
     * Удаляет первое вхождение указанного элемента из списка, если он присутствует.
     *
     * @param element значение удаляемого элемента.
     */
    void remove(E element);

    /**
     * Заменяет элемент в указанной позиции в списке указанным элементом.
     *
     * @param index     позиция
     * @param element   элемент
     */
    void set(int index, E element);

    /**
     * Возвращает количество элементов в списке.
     *
     * @return количество элементов в списке.
     */
    int size();
}