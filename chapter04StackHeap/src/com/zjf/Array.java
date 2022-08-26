/**
 * description:  my array
 * date:         2022/8/25 22:42
 * author        ZhuJunfei
 */

package com.zjf;

public class Array<E> {
    // 数组存放的元素个数
    private int size;
    // 实际存放数据的容器
    private E[] data;

    public Array(int capacity) {
        this.data = (E[]) new Object[capacity];
        this.size = 0;
    }

    public Array() {
        // 无参默认初识化10空间大小
        this(10);
    }


    /**
     * 获取数组中元素个数
     *
     * @return array element count
     */
    public int getSize() {
        return this.size;
    }

    /**
     * 获取数组当前容量
     *
     * @return This array capacity
     */
    public int getCapacity() {
        return this.data.length;
    }

    /**
     * 判断数组中是否存储了元素
     *
     * @return true -> size = 0, else return flase
     */
    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int index, E e) {
        // 对index进行检查
        if (index > this.size || index < 0) {
            throw new IllegalArgumentException("index is illegal argument, index need > 0 and < size ");
        }
        // 添加元素之前, 对数组容量进行判断
        if (this.size == this.getCapacity()){
            // 进行扩容
            resize(2 * this.getCapacity());
        }
        // 每个元素往后移动
        for (int i = this.size - 1; i >= index; i--) {
            this.data[i + 1] = this.data[i];
        }
        this.data[index] = e;
        this.size++;
    }

    private void resize(int newCapacity) {
        // 创建新的数组容器
        E[] newData = (E[]) new Object[newCapacity];

        // 将旧数组中的元素移动到新数组中
        System.arraycopy(data, 0, newData, 0, this.size);

        // 改变原数组的指向
        this.data = newData;
    }

    public void addLast(E e) {
        //在数组尾部添加元素
        this.add(this.size, e);
    }

    public void addFirst(E e) {
        // 数组头部添加元素
        this.add(0, e);
    }


    /**
     * 获取指定位置的元素
     *
     * @param index: 指定的位置
     * @return: return index of data
     */
    public E get(int index) {
        // 对index进行检查
        if (index >= this.size || index < 0) {
            throw new IllegalArgumentException("index is illegal argument, index need > 0 and < size ");
        }
        return this.data[index];
    }

    /**
     * 修改指定位置的数据
     *
     * @param index 指定位置的索引
     * @param e     修改后的数据
     */
    public void set(int index, E e) {
        if (index > this.size || index < 0) {
            throw new IllegalArgumentException("index is illegal argument, index need > 0 and < size ");
        }
        this.data[index] = e;

    }

    /**
     * 判断元素是否包含在数组中
     *
     * @param e 判断的元素
     * @return 返回是否存在
     */
    public boolean contains(E e) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 返回该元素对应的索引
     *
     * @param e 判断的元素
     * @return 对应的索引
     */
    public int find(E e) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除指定位置的元素, 返回删除的元素
     *
     * @param index 指定的位置
     * @return 返回删除的元素
     */
    public E remove(int index) {
        // 一个元素一个元素向前覆盖, 需要从index开始覆盖
        if (index >= size || index < 0) {
            throw new IllegalArgumentException("索引异常, 请检查索引");
        }
        E res = this.data[index];
        for (int i = index + 1; i < size; ++i) {
            this.data[i - 1] = this.data[i];
        }
        this.size--;
        this.data[size] = null;

        // 进行缩容
        if(size == data.length / 4)
            resize(data.length / 2);

        return res;
    }

    public E removeLast() {
        return this.remove(this.size - 1);
    }

    public E removeFirst() {
        return this.remove(0);
    }

    public void removeElement(E e) {
        int index = this.find(e);
        this.remove(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.format("array capacity = %d, size = %d \t-->[ ", this.data.length, this.size));
        for (int i = 0; i < this.size; ++i) {
            if (i == this.size - 1) {
                sb.append(this.data[i]);
            } else {
                sb.append(this.data[i]).append(", ");
            }
        }
        sb.append(" ]");
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
