// https://github.com/kulwadeelab/cpe6302-fund2/tree/main/lect03

# Project Cinema Room Manager

## ผลลัพธ์การเรียนรู้

* Input: java.util.Scanner

* Output: System.out.println, System.out.printf

* multi-dimensional arrays

* functions

* conditional statements

* loops

* class declaration


## Specification โรงหนังคนดู

เมื่อโปรแกรมเริ่มต้นทำงาน ระบบจะให้ผู้ใช้ใส่จำนวนแถวและจำนวนที่นั่งในแต่ละแถว ดังตัวอย่าง

Enter the number of rows:

> 8

Enter the number of seats in each row:

> 7

จากนั้น ระบบจะแสดงเมนูให้ผู้ใช้เลือกฟังก์ชันการทำงานต่าง ๆ  ดังนี้

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 1

เมื่อผู้ใช้เลือกเมนู 1 ระบบจะแสดงแผนผังสถานะที่นั่งของโรงหนัง ณ ปัจจุบัน โดยใช้ตัวอักษร S แทนที่นั่งว่าง และตัวอักษร B แทนที่นั่งที่ถูกซื้อแล้ว

ตามตัวอย่าง

Cinema:\
&nbsp; &nbsp; 1 2 3 4 5 6 7 8\
1 S S S S S S S S\
2 S S S S S S S S\
3 S S S S S S S S\
4 S S S S S S S S\
5 S S S S S S S S\
6 S S S S S S S S\
7 S S S S S S S S

S: หมายถึง ว่าง

B: หมายถึง ซื้อแล้ว

หลังจากนั้นระบบ จะแสดงเมนู เพื่อรอรับคำสั่งต่อไปจากผู้ใช้งาน 

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 2

เมื่อผู้ใช้เลือกเมนู 2 เพื่อซื้อตั๋วที่นั่ง ระบบจะให้ผู้ใช้ใส่เลขที่แถว และเลขที่ที่นั่ง ที่ผู้ใช้ต้องการซื้อ

Enter a row number:

> 1

Enter a seat number in that row:

> 1

Ticket price: $10

กรณีที่ ที่นั่ง ณ ตำแหน่งดังกล่าว ว่าง ระบบจะอัพเดตสถานะที่นั่งให้เป็น B และ แสดงราคาค่าตั๋วหนัง 
โดยวิธีการคิดราคาตั๋วหนัง จะมีกฎดังนี้คือ

* หากโรงหนังมีขนาดน้อยกว่า 60 ที่นั่ง ทุกที่นั่งจะขายราคา 100 บาท

* หากโรงหนังมีขนาดตั้งแต่ 60 ที่นั่ง ขึ้นไป แถวด้านหน้า (ครึ่งหนึ่งของโรงหนัง) จะขายราคาที่นั่งละ 100 บาท ส่วนแถวด้านหลัง (ครึ่งหลังของโรงหนัง) จะขายราคาที่นั่งละ 80 บาท 

ตัวอย่างเช่น

หากโรงหนังมีจำนวนที่นั่งทั้งหมด 10 แถว แถวละ 10 ที่นั่ง ราคาตั๋วของแถวที่  1-5 คือ 100 บาท 
และราคาตั๋วของแถวที่ 6-10 คือ 80 บาท

หากโรงหนังมีจำนวนที่นั่งทั้งหมด 7 แถว แถวละ 10 ที่นั่ง ราคาตั๋วของแถวที่  1-3 คือ 100 บาท 
และราคาตั๋วของแถวที่ 4-7 คือ 80 บาท

หากโรงหนังมีจำนวนที่นั่งทั้งหมด 5 แถว แถวละ 8 ที่นั่ง ราคาตั๋วของแถวที่  1-5 คือ 100 บาท 

ในกรณีที่ผู้ใช้เลือกที่นั่งที่ถูกซื้อแล้ว (สถานะเท่ากับ B) ระบบจะไม่อนุญาตให้ผู้ใช้ซื้อตั๋วได้ 
โดยแสดงข้อความ 

That ticket has already been purchased!

ตัวอย่างเช่น

Enter a row number:

> 1

Enter a seat number in that row:

> 1

That ticket has already been purchased!

ในกรณีที่เลขที่แถวและเลขที่นั่งที่ผู้ใช้เลือก ไม่ถูกต้อง ระบบจะแสดงข้อความเตือนว่า

Wrong input!

และให้ผู้ใช้ใส่เลขที่แถวและเลขที่นั่งอีกครั้งหนึ่ง ตามตัวอย่าง

Enter a row number:

> 10

Enter a seat number in that row:

> 20

Wrong input!

Enter a row number:

> 4

Enter a seat number in that row:

> 4

Ticket price: $10

เมื่อการซื้อตั๋วเสร็จสิ้นระบบจะกลับไปแสดงเมนูหลัก

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

เมื่อผู้ใช้เลือกเมนู 3 ระบบจะแสดงสถิติการขายตั๋วดังตัวอย่าง

Number of purchased tickets: 2

Percentage: 3.57%

Current income: $20

Total income: $560


เมื่อผู้ใช้เลือกเมนู 0 ระบบจะจบการทำงาน
