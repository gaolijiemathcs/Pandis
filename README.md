# 什么是Pandis?
Pandis是一个模仿Redis实现的分布式缓存系统，基于Java实现。

## 为啥叫Pandis
有谁不喜欢大熊猫呢~~~

# 项目架构
初步项目想要实现以下功能：
* 基本的单机存储功能，实现不同特点的kv数据存储结构
* 基于Reactor模式的事件分发系统
* 分布式功能

项目架构暂时按以下模块划分：
* event
* cache
* cluster
* common
  * store
    * 字符串
    * 列表
    * 集合
    * 哈希表
    * 有序列表
* ...