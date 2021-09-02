---
title: Access Modifier
---

|           | Self | Subclass from the Same Package | Subclass from Another Package | Class from the Same Package | Other Class | NOTE                                                         |
| --------- | ---- | ------------------------------ | ----------------------------- | --------------------------- | ----------- | ------------------------------------------------------------ |
| private   | √    | ×                              | ×                             | ×                           | ×           | private fields, methods are NOT accessible in instance if the instance is initialized in another class |
| package   | √    | √                              | ×                             | √                           | ×           |                                                              |
| protected | √    | √                              | √                             | √                           | ×           |                                                              |
| public    | √    | √                              | √                             | √                           | √           |                                                              |

Access modifiers are used to restrict restrict the accessibility of a **class**, **method**, or **variable** on which it applies

![](\access.png)