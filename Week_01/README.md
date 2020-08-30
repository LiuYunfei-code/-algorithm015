# 学习笔记

## 数组、链表、跳表

### 数组 Array

- 连续内存
- 时间复杂度
  - 随机访问 O(1)
  - 插入删除 O(n)

### 链表 Linked List

#### 单链表

- 实现

  ```java
   public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
  ```

- 时间复杂度

  - 随机访问 O(n)
  - 插入删除 O(1)

#### 双链表 Double Linked List

- 随机访问 O(n)
- 插入删除 O(1)

#### 循环链表 Circular Linked List

- 最后一个节点指向第一个节点 tail.next -> head
- 时间复杂度
  - 随机访问：O(n)
  - 插入删除：O(1)

#### 跳表 Skip List

- 思想：升维
- 要求元素必须是有序的
- 时间复杂度
  - 插入删除随机访问 O(logn)

## 栈、队列、优先队列、双端队列

### 栈 Stack

- 访问：O(1)

- 插入删除: O(n)

- 示例代码

  ```java
  Stack<Integer> stack = new Stack<>();
  stack.push(1);
  stack.push(2);
  stack.push(3);
  System.out.println(stack);
  System.out.println(stack.search(4));
  
  stack.pop();
  stack.pop();
  Integer topElement = stack.peek();
  System.out.println(topElement);
  System.out.println("3 的位置" + stack.search(3));
  ```

### 队列

- 实例代码

```java
Queue<String> queue = new LinkedList<>();
queue.offer("one");
queue.offer("two");
queue.offer("three");
System.out.println(queue);

String polledElement = queue.poll();
System.out.println(polledElement);
System.out.println(queue);

String peekedElement = queue.peek();
System.out.println(peekedElement);
System.out.println(queue);

while(queue.size() > 0){
    System.out.println(queue.poll());
}
```



### 双端队列 Double-Ended Queue

- 两端都可以出和入，可以当栈使用

- 时间复杂度

  - 随机访问：O(n)

  - 插入删除：O(1)

- 实例代码

  ```java
  Deque<String> deque = new LinkedList<>();
  deque.push("a");
  deque.push("b");
  deque.push("c");
  System.out.println(deque);
  
  String str = deque.peek();
  System.out.println(str);
  System.out.println(deque);
  
  while(deque.size() > 0){
  	System.out.println(deque.pop());
  }
  System.out.println(deque);
  ```

  

### 优先队列 Priority Queue

- 元素有优先级，元素出队的时候按优先级出队、必须要实现compartor比较器

- 时间复杂度

  - 取出：O(logn)

  - 插入：O(1)

## 学习方法

### 查询 API

Google 搜索 数据结构 + 语言 + 版本

### 查询 Java 源码

Google 搜索 source + 目标类、接口、方法等 + 语言

### 练习步骤

1. 5 - 10分钟：读题和思考
2. 有思路：自己开始做和写代码；不然，马上看题解！
3. 默写背诵、熟练
4. 然后开始自己写（闭卷）
5. 五毒神掌

