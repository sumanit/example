package org.sumanit.datastructure.list;

import java.util.Arrays;

/**
 * ˳���
 */
public class SeqList {
    private Object[] elements;
    private int currentLength;

    public SeqList(int maxLength) {
        elements = new Object[maxLength];
        currentLength = 0;
    }

    /**
     * ���Ԫ��
     */
    public void clear(){
        currentLength = 0;
    }
    /**
     * �ж��б��Ƿ�Ϊ��
     */
    public boolean isEmpty(){
        return currentLength == 0;
    }

    /**
     * ��ȡԪ��
     * @param index �±�ֵ
     * @return Ԫ��
     */
    public Object get(int index){
        if(index < 0 || index > currentLength-1){
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    /**
     * ���Ԫ��
     * @param element ��ӵ�Ԫ��
     */
    public void add(Object element){
        if(currentLength == elements.length)
            throw new RuntimeException("��Ԫ���������޷���������");
        elements[currentLength]=element;
        currentLength++;
    }

    /**
     * ����һ��Ԫ��
     * @param index ������±�
     * @param element �����Ԫ��
     */
    public void insert(int index, Object element){
        if(currentLength == elements.length){
            throw new RuntimeException("��Ԫ���������޷���������");
        }
        if(index < 0 || index > currentLength){
            throw new RuntimeException("����λ�ò��Ϸ�");
        }
        for(int j=currentLength;j>index;j--){
            elements[j]=elements[j-1];
        }
        elements[index]=element;
        currentLength++;
    }

    /**
     * �б�ĳ���
     * @return
     */
    public int length(){
        return currentLength;
    }

    /**
     * �Ƴ�Ԫ��
     * @param index ��Ҫ�Ƴ�Ԫ�����ڵ��±�
     * @return �Ƴ���Ԫ��
     */
    public Object remove(int index){
        if(index < 0 || index > currentLength-1){
            throw new IndexOutOfBoundsException();
        }
        Object removeElement = elements[index];
        for(int i= index;i<currentLength;i++){
            elements[i]=elements[i+1];
        }
        currentLength --;
        return removeElement;
    }

    /**
     * ��ȡԪ�����ڵ��±�
     * @param element ��Ҫ��ȡ�±��Ԫ��
     * @return Ԫ�����ڵ��±�
     */
    public int indexOf(Object element){
        for(int i=0;i<currentLength;i++){
            if(elements[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @return
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<currentLength;i++){
            sb.append(elements[i].toString());
            if(i<currentLength-1)
                sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
