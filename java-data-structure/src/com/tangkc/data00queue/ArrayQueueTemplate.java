package com.tangkc.data00queue;

/**
 * @author tangkc
 * @description 数组模拟队列
 * @date 2020/11/1 19:39
 */
public class ArrayQueueTemplate {

    public static void main(String[] args) {

    }

    class ArrayQueue{
        /**
         * 数组的最大容量
         */
        private int maxSize;
        /**
         * 队列头
         */
        private int front = -1;
        /**
         * 队列尾
         */
        private int rear = -1;
        /**
         * 存放数据, 模拟队列
         */
        private int[] arr;

        /**
         * 私有化无参构造器
         */
        private ArrayQueue(){}

        /**
         *  初始化队列
         * @param maxSize 队列大小
         */
        public ArrayQueue(int maxSize) {
            this.maxSize = maxSize;
            arr = new int[this.maxSize];
        }

        /**
         * 判断队列是否为空
         */
        public boolean isEmpty(){
            return this.front==this.rear;
        }

        /**
         * 判断队列是否满
         */
        public boolean isFull(){
            return this.front==this.maxSize-1;
        }

        /**
         * 存放元素
         */
        public boolean push(int element){
            if(isFull()){
                System.out.println("队列已满");
                return false;
            }
            // 让队列尾后移
            this.rear++;
            this.arr[this.rear] = element;
            return true;
        }

        /**
         * 取出一个元素
         */
        public int pop(){
            if(isEmpty()){
                throw new RuntimeException("队列为空");
            }
            // 让队列首后移
            this.front++;
            return this.arr[this.front];
        }
    }
}
