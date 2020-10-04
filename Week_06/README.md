学习笔记

### 分治 - 回溯 - 递归 -> 动态规划

动态规划和递归或分治没有根本上的区别，关键看有无最优的子结构。他们的共性就是要找到重复子问题。动态规划的相比后两者的区别就在于最优子结构和中途可以淘汰次优解。

动态规划的关键点

- 最优子结构 opt[n] = best_of(opt[n-1],opt[n-2],...)
- 储存中间状态：opt[i]
- 递推公式（美其名曰：状态转移方程）
  - Fib：opt[i] = opt[n-1] + opt[n-2]
  - 二维路径：opt[i,j] = opt[i+1, j] + opt[i, j+1]

复习 递归的代码模板

```java
// Java
public void recur(int level, int param) { 
  // terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); 
  // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 
 
}
```



复习 分治的代码模板

```java

private static int divide_conquer(Problem problem, ) {
  
  if (problem == NULL) {
    int res = process_last_result();
    return res;     
  }
  subProblems = split_problem(problem)
  
  res0 = divide_conquer(subProblems[0])
  res1 = divide_conquer(subProblems[1])
  
  result = process_result(res0, res1);
  
  return result;
}
```

