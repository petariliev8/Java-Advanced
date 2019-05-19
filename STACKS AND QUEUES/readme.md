# 1.Lab: Stacks and Queues

This document defines the exercises for [&quot;Java Advanced&quot; course @ Software University](https://softuni.bg/courses/java-advanced). Please submit your solutions (source code) of all below described problems in [Judge](https://judge.softuni.bg/Contests/1437/Stacks-and-Queues-Lab).

1.
# I.Working with Stacks

1. 1.Browser History

Write a program which takes 2 types of browser instructions:

- Normal navigation: a URL is set, given by a string
- The string &quot; **back&quot;** that sets the current URL to the last set URL

After each instruction the program should print the current URL. If the **back** instruction can&#39;t be executed, print
**&quot;no previous URLs&quot;**.The input ends with **&quot;Home&quot;** command, then simply you have to stop the program.

### Examples

| **Input** | **Output** |
| --- | --- |
| https//softuni.bg/backhttps//softuni.bg/trainings/coursesbackhttps//softuni.bg/trainings/2056backhttps//softuni.bg/trainings/livehttps//softuni.bg/trainings/live/detailsHome | https//softuni.bg/no previous URLshttps//softuni.bg/trainings/courseshttps//softuni.bg/https//softuni.bg/trainings/2056https//softuni.bg/https//softuni.bg/trainings/livehttps//softuni.bg/trainings/live/details |

### Hints

- Use **ArrayDeque\&lt;\&gt;**
- Use **String** to keep current page
- Use **push()**, when moving to next page
- Use **pop()**,when going back

1. 2.Simple Calculator

**Create a simple calculator** that can **evaluate simple expressions** that will not hold any operator different from addition and subtraction. There will not be parentheses or operator precedence.

Solve the problem **using a Stack**.

### Examples

| **Input** | **Output** |
| --- | --- |
| 2 + 5 + 10 - 2 - 1 | 14 |
| 2 - 2 + 5 | 5 |

### Hints

- Use an **ArrayDeque**** \&lt;\&gt;**
- Consider using the **add()** method
- You can either
  - add the elements and then pop them out
  - or push them and reverse the stack

1. 3.Decimal to Binary Converter

Create a simple program that **can convert a decimal number to its binary representation**. Implement an elegant solution **using a Stack**.

**Print the binary representation** back at the terminal.

### Examples

| **Input** | **Output** |
| --- | --- |
| 10 | 1010 |
| 1024 | 10000000000 |

### Hints

- If the given number is 0, just print 0
- Else, while the number is greater than zero, divide it by 2 and push the reminder into the stack

 ![](data:image/*;base64,iVBORw0KGgoAAAANSUhEUgAAAfUAAACDCAMAAAHUnULdAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAADPUExURf///2YAfwAAgAAAlo7a//+2rGa2////6o45fwBm1//ajjkAOf//tmYAAAAAAAAAZrb//9qOOf+2ZgAAOTmO2v+2/wAA/zmO/zkAAI45AABmto45////17Zmf2YA/wA5jtqO/wA5/7Zm/7ZmAI7a1//awTkAfwA5wdr//zmO6jk5OQAArNqOljkAZmYAObaOlmaOwTmO1wBm/zk5f7b/6jkAlgA5Oebm5rZmOWYAZmZmZgBmZv/a/zkA/zk5ADmOjjk5jmY5jmaOjma2tgAAAFf1xqIAAABFdFJOU///////////////////////////////////////////////////////////////////////////////////////////ALLusTgAAAAJcEhZcwAADsQAAA7EAZUrDhsAAAwcSURBVHhe7Z0Ne6PIDYAnmHU2LB4b7OSMN1+7brK93Wzap5937V17bf//f6qkETBjwGBsYxz0PokB8zEIjWakEWDVD27h/wpnHtQMJ0jAU8JZKHL7V9jf85TyZ2Z/f+Wnu/j4UbN/LwgWSiWTMczNcWGs/DkIM1FqHeH5r0GQXwOlzcYlTNSS5QzUfKLG6iHWWi10oHGKXN+sadoFDzxtzmJKk1f1gab7AZetO3aX1eUQAgtF0JYa8EJND7Okz301uhN/52lb8v2hBUHCFXyANQXYZqgHXFJ5w1qA99fqQSs90ROlo6leQpMxVz58M9XQhOBqdaNUbLZ1ONz5tyPdfx1iwx/RPDShSt3TbC37li8Ie+J53q16ptkrNVLgyTCzhXrNPBlolfzUlSG3xqXMNvcg4WktxuIUWF9LTmyAOxaP16XYmBq1cFurPmHz25CN4kmxs4CKeMV5hA4La9h/g1qRadt/mOS1wtCw3TPUSR9Ve5yHoF+6r9daQ5+iIU7x39U0M3W1eo3Wphdz+BX+m1etOk588U/N4S5kK05cvCCchJGZ3JkJU+K8GBcnW/GofkjjshLnpxmXWPoM/as79cTfJdCrkguDR/2gIvRjoB02ZWT96kfo09kjqo6kavA8kp1KV/7l7/E7HNuhwYoVCMelw9kUJPQ5Mm0v+36w0Bxh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)

- When you are done dividing, pop all reminders from the stack, that is the binary representation

1. 4. **Matching Brackets**

We are given an arithmetical expression with brackets. Scan through the string and extract each sub-expression.

Print the result back at the terminal.

### **Examples**

| **Input** | **Output** |
| --- | --- |
| 1 + (2 - (2 + 3) \* 4 / (3 + 1)) \* 5 | (2 + 3)(3 + 1)(2 - (2 + 3) \* 4 / (3 + 1)) |
| (2 + 3) - (2 + 3) | (2 + 3)(2 + 3) |

### **Hints**

- Use a stack, namely an **ArrayDeque()**
- Scan through the expression searching for brackets
  - If you find an opening bracket, push the index into the stack
  - If you find a closing bracket pop the topmost element from the stack. This is the index of the opening bracket.
  - Use the current and the popped index to extract the sub-expression

 ![](data:image/*;base64,iVBORw0KGgoAAAANSUhEUgAAA5YAAAD2CAMAAAHtztgdAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAFWUExURf////+2rAAAgGa2////12YAfwAArLb////ajjkAOY7a/zkAAAAAAABmttrBOQCAADnB2v//tmYAAAAAZv/awTkAf445ALZmAP//2o6WAACWjtr////qjjl/ANqOOTmO2rZmfwBm1/+2ZgAAObasAACstgB/ZjmO6gA5jv//6o45fwAAlgBmZv/XZmbX/wB/OY7q/zl/OdqOlubm5mZmZjkAZmZmADk5OWYAOTk5ADmOjgA5OWaOjma2tmZ/AAA5wWZmlmYAljkAlt7GoCqLtL///445/wAA/5ygiyyMjCq02iqgxv/atDmO/2YA/3mLi1TG7L+0i3na///sxlSLiyqLoJzs/1SLoFSLtHm0i1Sgi7Zm//+4qGYOeoGS6c9reZu4////6bRAeWUMkbTb/2UMqM/////bvoEMeeaSkWVAvub//2Vr1f//1ZsMeXmLoHna2gAAAMgalAIAAABydFJOU///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////AHzXy+gAAAAJcEhZcwAADsQAAA7EAZUrDhsAACPbSURBVHhe7Z39e9vIde/nIR9GXAmyTcomVXtDKVSzsTd3d1M37m42bd1UVmPabm1ZXm9ur5TN425Wbm+87f//U8/bADMgQIKvIqnvxxYxAAYzAA4Ozrydgbs6arbMuMk/2xJcEJZnVxcpC81z+fytLZeJ5Zl0kx2X0L9esku/xDav3U8O6rJ/rqTX2ZNfyu4RLUi4280DChy4ReYJwNSk774t5167pq04d0MX2Ya5Uasd0t9PKHSoG/Is/B0YZrC467zCdx9xx5bD3Ocfkva8sDxrH+5wnpS63kvK4T69+IQebf3InTi3u6sbZuVq7+3y8HmeDu66X911AwrWk95rMmRsy/TuJq6fuF13v8Vmp8M/STOps/1LHMd0B7KHQ2SRttVC6R4yhrJC1qkjASa9zuNT9/b2Kwq0SWG6OyTYgwMTLh3WOSBZUpJyNLPz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)

1.
# II.Working with Queues

1. 5. **Printer Queue**

The printer queue is a simple way to control the order of files sent to a printer device. We know that a single printer can be shared between multiple devices. So to preserve the order of the files sent, we can use queue. Write down a program which takes filenames until **&quot;print&quot;** command is received. Then as output print the filenames in the order of printing. Some of the tasks may be **canceled** if you receive **&quot;cancel&quot;** you have to remove the first file to be printed. If there is no current file to be printed print **&quot;Printer is on standby&quot;**.

### **Examples**

| **Input** | **Output** |
| --- | --- |
| Lab.docxcancelcancelPresentation.pptxNoteNothing.txtSomeCode.javacancelprint  | Canceled Lab.docxPrinter is on standbyCanceled Presentation.pptxNoteNothing.txtSomeCode.java |

### Hints

- Use an **ArrayDeque\&lt;\&gt;**
- Use **offer()**, when adding file
- Use **pollFirst()**,when printing file

1. 6.Hot Potato

Hot potato is a game in which **children form a circle and start passing a hot potato**. The counting starts with the fist kid. **Every n**** th **** toss the child left with the potato leaves the game **. When a kid leaves the game, it passes the potato forward. This continues repeating** until there is only one kid left**.

Create a program that simulates the game of Hot Potato.   **Print every kid that is removed from the circle**. In the end, **print the kid that is left last**.

### **Examples**

| **Input** | **Output** |
| --- | --- |
| Mimi Pepi Toshko2 | Removed PepiRemoved MimiLast is Toshko |
| Gosho Pesho Misho Stefan Krasi10 | Removed KrasiRemoved PeshoRemoved MishoRemoved GoshoLast is Stefan |
| Gosho Pesho Misho Stefan Krasi1 | Removed GoshoRemoved PeshoRemoved MishoRemoved StefanLast is Krasi |

1. 7. **Math Potato**

Rework the previous problem so that a **child is removed only on a prime cycle** (cycles start from 1)

If a **cycle is not prime** , just **print the child&#39;s name.**

As before, print the name of the child that is left last.

### **Examples**

| **Input** | **Output** |
| --- | --- |
| Mimi Pepi Toshko2 | Removed PepiPrime MimiPrime ToshkoRemoved MimiLast is Toshko |
| Gosho Pesho Misho Stefan Krasi10 | Removed KrasiPrime PeshoPrime MishoRemoved StefanPrime GoshoRemoved GoshoPrime MishoRemoved PeshoLast is Misho |

1. 8.Browser History Upgrade

Extend &quot;Browser History&quot; with a **&quot;forward&quot;** instruction which visits URLs that were navigated away from by **&quot;back&quot;**

Each forward instruction visits the next most-recent such URL. If a normal navigation happens, all potential forward URLs are removed until a new back instruction is given If the forward instruction can&#39;t be executed, print
**&quot;no next URLs&quot;.**

### Examples

| **Input** | **Output** |
| --- | --- |
| forwardhttps//softuni.bg/https//softuni.bg/trainings/coursesbackforwardhttps//softuni.bg/trainings/2056backforwardforwardhttps//softuni.bg/trainings/coursesHome | no next URLshttps//softuni.bg/https//softuni.bg/trainings/courseshttps//softuni.bg/https//softuni.bg/trainings/courseshttps//softuni.bg/trainings/2056https//softuni.bg/trainings/courseshttps//softuni.bg/trainings/2056no next URLshttps//softuni.bg/trainings/courses |

### Hints

- Use the solution from Browser History
- Use **ArrayDequeue\&lt;\&gt;** as queue to keep the forward pages
- Use **clear()** method to reset the forward pages
- Use **addFirst()** when adding page to the forward pages