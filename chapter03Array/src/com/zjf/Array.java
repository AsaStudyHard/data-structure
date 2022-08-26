/**
 * description:  my array
 * date:         2022/8/25 22:42
 * author        ZhuJunfei
 */

package com.zjf;

public class Array {
    // 数组存放的元素个数
    private int size;
    // 实际存放数据的容器
    private int[] data;

    public Array(int capacity) {
        if (capacity <= 0 || capacity > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("传递的capacity异常");
        }
        this.data = new int[capacity];
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

    public void add(int index, int e) {
        // 每个元素往后移动
        for (int i = this.size - 1; i >= index; i--) {
            this.data[i + 1] = this.data[i];
        }
        this.data[index] = e;
        this.size++;
    }

    public void addLast(int e) {
        //在数组尾部添加元素
        this.add(this.size, e);
    }

    public void addFirst(int e) {
        // 数组头部添加元素
        this.add(0, e);
    }


    /**
     * 获取指定位置的元素
     *
     * @param index: 指定的位置
     * @return: return index of data
     */
    public int get(int index) {
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
    public void set(int index, int e) {
        if (index > this.size || index < 0) {
            throw new IllegalArgumentException("index is illegal argument, index need > 0 and < size ");
        }
        this.data[index] = e;

    }

    /**
     * 判断元素是否包含在数组中
     * @param e 判断的元素
     * @return 返回是否存在
     */
    public boolean contains(int e){
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == e){
                return true;
            }
        }
        return false;
    }

    /**
     * 返回该元素对应的索引
     * @param e 判断的元素
     * @return 对应的索引
     */
    public int find(int e){
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == e){
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除指定位置的元素, 返回删除的元素
     * @param index 指定的位置
     * @return 返回删除的元素
     */
    public int remove(int index){
        // 一个元素一个元素向前覆盖, 需要从index开始覆盖
        if (index >= size || index < 0 ){
            throw new IllegalArgumentException("索引异常, 请检查索引");
        }
        int res = this.data[index];
        for (int i = index + 1; i < size; ++i){
            this.data[i - 1] = this.data[i];
        }
        this.size --;
        return res;
    }

    public int removeLast(){
        return this.remove(this.size - 1);
    }

    public int removeFirst(){
        return this.remove(0);
    }

    public void removeElement(int e){
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
        Array myArray = new Array();
        for (int i = 0; i < 10; i++) {
            myArray.add(i, i + 10);
            System.out.println(myArray);
        }

        // 获取指定位置的元素
        int e = myArray.get(4);
        System.out.println("index = 4, element = " + e);
        // 修改指定位置的元素
        myArray.set(4, 999);
        System.out.println(myArray);

        // 删除元素
        myArray.remove(0);
        System.out.println(myArray);
        myArray.remove(5);
        System.out.println(myArray);
        myArray.removeElement(999);
        System.out.println(myArray);

        myArray.removeLast();
        System.out.println(myArray);

        myArray.removeFirst();
        System.out.println(myArray);

        for (int i = 0; i < 5; i++) {
            myArray.remove(0);
            System.out.println(myArray);
        }


    }
}
